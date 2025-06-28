package JVM;

import java.util.*;

/**
 * 简化版JVM模拟器
 * 包含类加载、字节码执行、内存管理等核心机制
 */
public class SimpleJVM {
    
    // 类加载器
    private ClassLoader classLoader;
    
    // 方法区（存储类信息）
    private Map<String, ClassInfo> methodArea;
    
    // 堆内存（存储对象）
    private List<Object> heap;
    
    // 栈内存（存储局部变量和操作数栈）
    private Stack<StackFrame> callStack;
    
    // 程序计数器
    private int pc;
    
    // 当前执行的方法
    private MethodInfo currentMethod;
    
    public SimpleJVM() {
        this.classLoader = new ClassLoader();
        this.methodArea = new HashMap<>();
        this.heap = new ArrayList<>();
        this.callStack = new Stack<>();
        this.pc = 0;
    }
    
    /**
     * 类信息
     */
    static class ClassInfo {
        String className;
        Map<String, MethodInfo> methods;
        Map<String, FieldInfo> fields;
        
        public ClassInfo(String className) {
            this.className = className;
            this.methods = new HashMap<>();
            this.fields = new HashMap<>();
        }
    }
    
    /**
     * 方法信息
     */
    static class MethodInfo {
        String methodName;
        List<String> instructions; // 字节码指令
        int maxLocals;
        int maxStack;
        
        public MethodInfo(String methodName) {
            this.methodName = methodName;
            this.instructions = new ArrayList<>();
            this.maxLocals = 10;
            this.maxStack = 10;
        }
    }
    
    /**
     * 字段信息
     */
    static class FieldInfo {
        String fieldName;
        String fieldType;
        Object value;
        
        public FieldInfo(String fieldName, String fieldType) {
            this.fieldName = fieldName;
            this.fieldType = fieldType;
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
            
            // 模拟类加载过程
            ClassInfo classInfo = new ClassInfo(className);
            
            // 模拟解析字节码
            parseBytecode(classInfo);
            
            return classInfo;
        }
        
        private void parseBytecode(ClassInfo classInfo) {
            // 模拟解析字节码文件
            System.out.println("解析字节码文件...");
            
            // 添加一些模拟的方法
            if (classInfo.className.equals("Main")) {
                MethodInfo mainMethod = new MethodInfo("main");
                mainMethod.instructions.add("iconst_1");  // 加载常量1
                mainMethod.instructions.add("istore_1");  // 存储到局部变量1
                mainMethod.instructions.add("iload_1");   // 加载局部变量1
                mainMethod.instructions.add("iconst_2");  // 加载常量2
                mainMethod.instructions.add("iadd");      // 整数加法
                mainMethod.instructions.add("istore_2");  // 存储结果
                mainMethod.instructions.add("return");    // 返回
                
                classInfo.methods.put("main", mainMethod);
            }
        }
    }
    
    /**
     * 字节码解释器
     */
    public void execute(String className, String methodName) {
        System.out.println("开始执行方法: " + className + "." + methodName);
        
        // 1. 类加载
        ClassInfo classInfo = methodArea.get(className);
        if (classInfo == null) {
            classInfo = classLoader.loadClass(className);
            methodArea.put(className, classInfo);
        }
        
        // 2. 方法解析
        MethodInfo method = classInfo.methods.get(methodName);
        if (method == null) {
            throw new RuntimeException("方法未找到: " + methodName);
        }
        
        // 3. 创建栈帧
        StackFrame frame = new StackFrame(method);
        callStack.push(frame);
        currentMethod = method;
        
        // 4. 执行字节码
        executeBytecode(frame);
        
        // 5. 方法返回
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
                case "iconst_2":
                    frame.operandStack.push(2);
                    break;
                case "istore_1":
                    frame.localVariables[1] = frame.operandStack.pop();
                    break;
                case "istore_2":
                    frame.localVariables[2] = frame.operandStack.pop();
                    break;
                case "iload_1":
                    frame.operandStack.push(frame.localVariables[1]);
                    break;
                case "iadd":
                    int b = (Integer) frame.operandStack.pop();
                    int a = (Integer) frame.operandStack.pop();
                    frame.operandStack.push(a + b);
                    break;
                case "return":
                    return;
                default:
                    System.out.println("未知指令: " + instruction);
            }
        }
    }
    
    /**
     * 垃圾回收器
     */
    public void garbageCollect() {
        System.out.println("开始垃圾回收...");
        
        // 标记-清除算法
        Set<Object> reachable = new HashSet<>();
        
        // 从根对象开始标记
        for (StackFrame frame : callStack) {
            for (Object localVar : frame.localVariables) {
                if (localVar != null) {
                    reachable.add(localVar);
                }
            }
            for (Object operand : frame.operandStack) {
                if (operand != null) {
                    reachable.add(operand);
                }
            }
        }
        
        // 清除不可达对象
        heap.removeIf(obj -> !reachable.contains(obj));
        
        System.out.println("垃圾回收完成，剩余对象: " + heap.size());
    }
    
    /**
     * 内存分配
     */
    public Object allocateObject(String className) {
        System.out.println("分配内存空间给对象: " + className);
        Object obj = new Object(); // 简化版，实际应该创建对应类的实例
        heap.add(obj);
        return obj;
    }
    
    public static void main(String[] args) {
        SimpleJVM jvm = new SimpleJVM();
        
        System.out.println("=== 启动JVM ===");
        
        // 执行主方法
        jvm.execute("Main", "main");
        
        // 模拟内存分配
        jvm.allocateObject("String");
        jvm.allocateObject("Integer");
        
        // 垃圾回收
        jvm.garbageCollect();
        
        System.out.println("=== JVM关闭 ===");
    }
} 