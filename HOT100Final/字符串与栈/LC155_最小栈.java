/**
 * LC155 - 最小栈
 * 难度：中等
 * 描述：
 * 设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。
 * 实现 MinStack 类：
 * - MinStack() 初始化堆栈对象。
 * - void push(int val) 将元素 val 推入堆栈。
 * - void pop() 删除堆栈顶部的元素。
 * - int top() 获取堆栈顶部的元素。
 * - int getMin() 获取堆栈中的最小元素。
 */
public class LC155_最小栈 {

    /**
     * 初始化栈
     */
    public LC155_最小栈() {
        // 实现逻辑
    }

    /**
     * 压栈
     * @param val 值
     */
    public void push(int val) {
        // 实现逻辑
    }

    /**
     * 弹栈
     */
    public void pop() {
        // 实现逻辑
    }

    /**
     * 获取栈顶元素
     * @return 栈顶元素
     */
    public int top() {
        // 实现逻辑
        return 0;
    }

    /**
     * 获取最小元素
     * @return 最小元素
     */
    public int getMin() {
        // 实现逻辑
        return 0;
    }

    public static void main(String[] args) {
        LC155_最小栈 minStack = new LC155_最小栈();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println("最小值: " + minStack.getMin()); // 返回 -3
        minStack.pop();
        System.out.println("栈顶值: " + minStack.top());    // 返回 0
        System.out.println("最小值: " + minStack.getMin()); // 返回 -2
    }
}
