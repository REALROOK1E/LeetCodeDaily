package JVM;

import java.util.*;

/**
 * 高级JVM模拟器
 * 包含详细的类加载、字节码执行、垃圾回收算法等
 */
public class AdvancedJVM {
    
    // 类加载器
    private ClassLoader classLoader;
    
    // 方法区（存储类信息）
    private Map<String, ClassInfo> methodArea;
    
    // 堆内存（分为新生代和老年代）
    private Heap heap;
    
    // 栈内存
    private Stack<StackFrame> callStack;
    
    // 程序计数器
    private int pc;
    
    // 垃圾回收器
    private GarbageCollector gc;
    
    // 常量池
    private Map<String, Object> constantPool;
    
    public AdvancedJVM() {
        this.classLoader = new ClassLoader();
        this.methodArea = new HashMap<>();
        this.heap = new Heap();
        this.callStack = new Stack<>();
        this.pc = 0;
        this.gc = new GarbageCollector(heap);
        this.constantPool = new HashMap<>();
    }
    
    /**
     * 堆内存管理
     */
    static class Heap {
        // 新生代（Eden + Survivor）
        private List<Object> edenSpace;
        private List<Object> survivorSpace1;
        private List<Object> survivorSpace2;
        
        // 老年代
        private List<Object> oldGen;
        
        // 元空间（方法区）
        private Map<String, ClassInfo> metaspace;
        
        public Heap() {
            this.edenSpace = new ArrayList<>();
            this.survivorSpace1 = new ArrayList<>();
            this.survivorSpace2 = new ArrayList<>();
            this.oldGen = new ArrayList<>();
            this.metaspace = new HashMap<>();
        }
        
        public Object allocateInEden(String className) {
            Object obj = new Object();
            edenSpace.add(obj);
            System.out.println("在Eden区分配对象: " + className);
            return obj;
        }
        
        public void promoteToOldGen(Object obj) {
            oldGen.add(obj);
            System.out.println("对象晋升到老年代");
        }
        
        public List<Object> getAllObjects() {
            List<Object> all = new ArrayList<>();
            all.addAll(edenSpace);
            all.addAll(survivorSpace1);
            all.addAll(survivorSpace2);
            all.addAll(oldGen);
            return all;
        }
    }
    
    /**
     * 垃圾回收器
     */
    static class GarbageCollector {
        private Heap heap;
        private int minorGCCount = 0;
        private int majorGCCount = 0;
        
        public GarbageCollector(Heap heap) {
            this.heap = heap;
        }
        
        /**
         * Minor GC（新生代垃圾回收）
         */
        public void minorGC() {
            System.out.println("=== 开始Minor GC ===");
            minorGCCount++;
            
            // 标记-复制算法
            Set<Object> reachable = markReachableObjects();
            
            // 复制存活对象到Survivor空间
            List<Object> newSurvivor = new ArrayList<>();
            for (Object obj : heap.edenSpace) {
                if (reachable.contains(obj)) {
                    newSurvivor.add(obj);
                }
            }
            
            // 清空Eden区
            heap.edenSpace.clear();
            
            // 交换Survivor空间
            heap.survivorSpace1 = heap.survivorSpace2;
            heap.survivorSpace2 = newSurvivor;
            
            System.out.println("Minor GC完成，存活对象: " + newSurvivor.size());
        }
        
        /**
         * Major GC（老年代垃圾回收）
         */
        public void majorGC() {
            System.out.println("=== 开始Major GC ===");
            majorGCCount++;
            
            // 标记-清除算法
            Set<Object> reachable = markReachableObjects();
            
            // 清除不可达对象
            heap.oldGen.removeIf(obj -> !reachable.contains(obj));
            
            System.out.println("Major GC完成，剩余对象: " + heap.oldGen.size());
        }
        
        /**
         * 标记可达对象
         */
        private Set<Object> markReachableObjects() {
            Set<Object> reachable = new HashSet<>();
            
            // 从根对象开始标记
            // 这里简化处理，实际应该遍历所有栈帧
            for (Object obj : heap.getAllObjects()) {
                if (Math.random() > 0.3) { // 模拟70%的对象存活
                    reachable.add(obj);
                }
            }
            
            return reachable;
        }
        
        /**
         * 分代垃圾回收策略
         */
        public void generationalGC() {
            if (heap.edenSpace.size() > 100) { // Eden区满了
                minorGC();
            }
            
            if (heap.oldGen.size() > 500) { // 老年代满了
                majorGC();
            }
        }
    }
    
    /**
     * 类信息
     */
    static class ClassInfo {
        String className;
        Map<String, MethodInfo> methods;
        Map<String, FieldInfo> fields;
        String superClass;
        List<String> interfaces;
        
        public ClassInfo(String className) {
            this.className = className;
            this.methods = new HashMap<>();
            this.fields = new HashMap<>();
            this.interfaces = new ArrayList<>();
        }
    }
    
    /**
     * 方法信息
     */
    static class MethodInfo {
        String methodName;
        List<String> instructions;
        int maxLocals;
        int maxStack;
        String returnType;
        List<String> parameters;
        
        public MethodInfo(String methodName) {
            this.methodName = methodName;
            this.instructions = new ArrayList<>();
            this.maxLocals = 10;
            this.maxStack = 10;
            this.parameters = new ArrayList<>();
        }
    }
    
    /**
     * 字段信息
     */
    static class FieldInfo {
        String fieldName;
        String fieldType;
        Object value;
        boolean isStatic;
        
        public FieldInfo(String fieldName, String fieldType) {
            this.fieldName = fieldName;
            this.fieldType = fieldType;
            this.isStatic = false;
        }
    }
    
    /**
     * 栈帧
     */
    static class StackFrame {
        MethodInfo method;
        Object[] localVariables;
        Stack<Object> operandStack;
        int pc;
        String returnAddress;
        
        public StackFrame(MethodInfo method) {
            this.method = method;
            this.localVariables = new Object[method.maxLocals];
            this.operandStack = new Stack<>();
            this.pc = 0;
        }
    }
    
    /**
     * 类加载器
     */
    static class ClassLoader {
        public ClassInfo loadClass(String className) {
            System.out.println("类加载器正在加载类: " + className);
            
            ClassInfo classInfo = new ClassInfo(className);
            parseBytecode(classInfo);
            
            return classInfo;
        }
        
        private void parseBytecode(ClassInfo classInfo) {
            System.out.println("解析字节码文件...");
            
            if (classInfo.className.equals("Calculator")) {
                // 模拟计算器类
                MethodInfo addMethod = new MethodInfo("add");
                addMethod.instructions.add("iload_0");  // 加载第一个参数
                addMethod.instructions.add("iload_1");  // 加载第二个参数
                addMethod.instructions.add("iadd");     // 加法
                addMethod.instructions.add("ireturn");  // 返回结果
                
                MethodInfo multiplyMethod = new MethodInfo("multiply");
                multiplyMethod.instructions.add("iload_0");
                multiplyMethod.instructions.add("iload_1");
                multiplyMethod.instructions.add("imul");    // 乘法
                multiplyMethod.instructions.add("ireturn");
                
                MethodInfo factorialMethod = new MethodInfo("factorial");
                factorialMethod.instructions.add("iload_0");
                factorialMethod.instructions.add("iconst_1");
                factorialMethod.instructions.add("if_icmple"); // 比较
                factorialMethod.instructions.add("iload_0");
                factorialMethod.instructions.add("iload_0");
                factorialMethod.instructions.add("iconst_1");
                factorialMethod.instructions.add("isub");   // 减法
                factorialMethod.instructions.add("invokevirtual"); // 递归调用
                factorialMethod.instructions.add("imul");
                factorialMethod.instructions.add("ireturn");
                factorialMethod.instructions.add("iconst_1"); // 基本情况
                factorialMethod.instructions.add("ireturn");
                
                classInfo.methods.put("add", addMethod);
                classInfo.methods.put("multiply", multiplyMethod);
                classInfo.methods.put("factorial", factorialMethod);
            }
        }
    }
    
    /**
     * 字节码解释器
     */
    public void execute(String className, String methodName, Object... args) {
        System.out.println("开始执行方法: " + className + "." + methodName);
        
        // 类加载
        ClassInfo classInfo = methodArea.get(className);
        if (classInfo == null) {
            classInfo = classLoader.loadClass(className);
            methodArea.put(className, classInfo);
        }
        
        // 方法解析
        MethodInfo method = classInfo.methods.get(methodName);
        if (method == null) {
            throw new RuntimeException("方法未找到: " + methodName);
        }
        
        // 创建栈帧
        StackFrame frame = new StackFrame(method);
        
        // 设置参数
        for (int i = 0; i < args.length; i++) {
            frame.localVariables[i] = args[i];
        }
        
        callStack.push(frame);
        
        // 执行字节码
        executeBytecode(frame);
        
        // 方法返回
        callStack.pop();
        System.out.println("方法执行完成");
    }
    
    /**
     * 执行字节码指令
     */
    private void executeBytecode(StackFrame frame) {
        List<String> instructions = frame.method.instructions;
        
        for (int i = 0; i < instructions.size(); i++) {
            String instruction = instructions.get(i);
            System.out.println("执行指令: " + instruction);
            
            switch (instruction) {
                case "iconst_1":
                    frame.operandStack.push(1);
                    break;
                case "iload_0":
                    frame.operandStack.push(frame.localVariables[0]);
                    break;
                case "iload_1":
                    frame.operandStack.push(frame.localVariables[1]);
                    break;
                case "iadd":
                    int b = (Integer) frame.operandStack.pop();
                    int a = (Integer) frame.operandStack.pop();
                    frame.operandStack.push(a + b);
                    break;
                case "imul":
                    int d = (Integer) frame.operandStack.pop();
                    int c = (Integer) frame.operandStack.pop();
                    frame.operandStack.push(c * d);
                    break;
                case "isub":
                    int f = (Integer) frame.operandStack.pop();
                    int e = (Integer) frame.operandStack.pop();
                    frame.operandStack.push(e - f);
                    break;
                case "if_icmple":
                    int val2 = (Integer) frame.operandStack.pop();
                    int val1 = (Integer) frame.operandStack.pop();
                    if (val1 <= val2) {
                        i = 8; // 跳转到基本情况
                    }
                    break;
                case "invokevirtual":
                    // 模拟方法调用
                    System.out.println("调用方法...");
                    break;
                case "ireturn":
                    Object result = frame.operandStack.pop();
                    System.out.println("返回结果: " + result);
                    return;
                default:
                    System.out.println("未知指令: " + instruction);
            }
        }
    }
    
    /**
     * 内存分配策略
     */
    public Object allocateObject(String className) {
        // 对象分配策略
        if (heap.edenSpace.size() < 100) {
            return heap.allocateInEden(className);
        } else {
            // Eden区满了，触发Minor GC
            gc.minorGC();
            return heap.allocateInEden(className);
        }
    }
    
    /**
     * 性能监控
     */
    public void printStats() {
        System.out.println("=== JVM统计信息 ===");
        System.out.println("Eden区对象数: " + heap.edenSpace.size());
        System.out.println("Survivor区对象数: " + heap.survivorSpace1.size());
        System.out.println("老年代对象数: " + heap.oldGen.size());
        System.out.println("Minor GC次数: " + gc.minorGCCount);
        System.out.println("Major GC次数: " + gc.majorGCCount);
        System.out.println("已加载类数: " + methodArea.size());
    }
    
    public static void main(String[] args) {
        AdvancedJVM jvm = new AdvancedJVM();
        
        System.out.println("=== 启动高级JVM ===");
        
        // 执行计算器方法
        jvm.execute("Calculator", "add", 5, 3);
        jvm.execute("Calculator", "multiply", 4, 6);
        
        // 模拟内存分配
        for (int i = 0; i < 50; i++) {
            jvm.allocateObject("String" + i);
        }
        
        // 垃圾回收
        jvm.gc.generationalGC();
        
        // 打印统计信息
        jvm.printStats();
        
        System.out.println("=== JVM关闭 ===");
    }
} 