/**
 * LC225 - 用队列实现栈
 * 难度：简单
 * 描述：
 * 请你仅使用两个队列实现一个后入先出（LIFO）的栈，并支持普通栈的全部四种操作（push、top、pop 和 empty）。
 * 实现 MyStack 类：
 * - void push(int x) 将元素 x 压入栈顶。
 * - int pop() 移除并返回栈顶元素。
 * - int top() 返回栈顶元素。
 * - boolean empty() 如果栈是空的，返回 true ；否则，返回 false 。
 */
import java.util.*;

public class LC225_用队列实现栈 {

    /**
     * 初始化栈
     */
    public LC225_用队列实现栈() {
        // 实现逻辑
    }

    /**
     * 压栈
     * @param x 元素
     */
    public void push(int x) {
        // 实现逻辑
    }

    /**
     * 弹栈
     * @return 栈顶元素
     */
    public int pop() {
        // 实现逻辑
        return 0;
    }

    /**
     * 查看栈顶元素
     * @return 栈顶元素
     */
    public int top() {
        // 实现逻辑
        return 0;
    }

    /**
     * 检查栈是否为空
     * @return 是否为空
     */
    public boolean empty() {
        // 实现逻辑
        return false;
    }

    public static void main(String[] args) {
        LC225_用队列实现栈 myStack = new LC225_用队列实现栈();
        myStack.push(1);
        myStack.push(2);
        System.out.println("栈顶: " + myStack.top());   // 返回 2
        System.out.println("弹栈: " + myStack.pop());   // 返回 2
        System.out.println("是否为空: " + myStack.empty()); // 返回 false
    }
}
