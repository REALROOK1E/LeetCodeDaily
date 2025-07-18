package Stack;

import java.util.Stack;

/**
 * LeetCode 155 - 最小栈
 *
 * 题目描述：
 * 设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。
 *
 * 实现 MinStack 类:
 * - MinStack() 初始化堆栈对象。
 * - void push(int val) 将元素val推入栈中。
 * - void pop() 删除栈顶的元素。
 * - int top() 获取栈顶元素。
 * - int getMin() 获取栈中的最小元素。
 *
 * 示例：
 * 输入：
 * ["MinStack","push","push","push","getMin","pop","top","getMin"]
 * [[],[-2],[0],[-3],[],[],[],[]]
 * 输出：
 * [null,null,null,null,-3,null,0,-2]
 *
 * 解释：
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   // 返回 -3
 * minStack.pop();
 * minStack.top();      // 返回 0
 * minStack.getMin();   // 返回 -2
 *
 * 提示：
 * -2^31 <= val <= 2^31 - 1
 * pop、top 和 getMin 操作总是在 非空栈 上调用
 * push、pop、top、getMin最多被调用 3 * 10^4 次
 */
public class MinStack {

    private Stack<Integer> dataStack; // 主栈，存储所有元素
    private Stack<Integer> minStack;  // 辅助栈，存储当前最小值

    /**
     * Initializes the stack object.
     */
    public MinStack() {
        dataStack = new Stack<>();
        minStack = new Stack<>();
    }

    /**
     * Pushes the element val onto the stack.
     * @param val The value to be pushed.
     */
    public void push(int val) {
        dataStack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        } else {
            minStack.push(minStack.peek()); // Keep the current min if new value is not smaller
        }
    }

    /**
     * Removes the element on top of the stack.
     */
    public void pop() {
        if (!dataStack.isEmpty()) {
            dataStack.pop();
            minStack.pop(); // Both stacks pop simultaneously
        }
    }

    /**
     * Gets the top element of the stack.
     * @return The top element.
     */
    public int top() {
        return dataStack.peek();
    }

    /**
     * Retrieves the minimum element in the stack.
     * @return The minimum element.
     */
    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        System.out.println("=== 测试最小栈 ===");

        MinStack minStack = new MinStack();
        
        System.out.println("push(-2)");
        minStack.push(-2);
        
        System.out.println("push(0)");
        minStack.push(0);
        
        System.out.println("push(-3)");
        minStack.push(-3);
        
        int min1 = minStack.getMin();
        System.out.println("getMin() = " + min1 + " (期望: -3)");
        
        System.out.println("pop()");
        minStack.pop();
        
        int top1 = minStack.top();
        System.out.println("top() = " + top1 + " (期望: 0)");
        
        int min2 = minStack.getMin();
        System.out.println("getMin() = " + min2 + " (期望: -2)");

        System.out.println("\n--- 更多测试用例 ---");
        MinStack minStack2 = new MinStack();
        System.out.println("push(1)");
        minStack2.push(1);
        System.out.println("push(2)");
        minStack2.push(2);
        System.out.println("getMin() = " + minStack2.getMin()); // Expected: 1
        System.out.println("pop()");
        minStack2.pop();
        System.out.println("getMin() = " + minStack2.getMin()); // Expected: 1
        System.out.println("top() = " + minStack2.top());     // Expected: 1
    }
} 