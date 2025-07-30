/**
 * LC232 - 用栈实现队列
 * 难度：简单
 * 描述：
 * 请你仅使用两个栈实现先入先出队列。队列应当支持一般队列支持的所有操作（push、pop、peek、empty）：
 * - 实现 MyQueue 类：
 *   - void push(int x) 将元素 x 推到队列的末尾
 *   - int pop() 从队列的开头移除并返回元素
 *   - int peek() 返回队列开头的元素
 *   - boolean empty() 如果队列为空，返回 true ；否则，返回 false
 */
public class LC232_用栈实现队列 {

    /**
     * 初始化队列
     */
    public LC232_用栈实现队列() {
        // 实现逻辑
    }

    /**
     * 入队
     * @param x 元素
     */
    public void push(int x) {
        // 实现逻辑
    }

    /**
     * 出队
     * @return 队列头部元素
     */
    public int pop() {
        // 实现逻辑
        return 0;
    }

    /**
     * 查看队列头部元素
     * @return 队列头部元素
     */
    public int peek() {
        // 实现逻辑
        return 0;
    }

    /**
     * 检查队列是否为空
     * @return 是否为空
     */
    public boolean empty() {
        // 实现逻辑
        return false;
    }

    public static void main(String[] args) {
        LC232_用栈实现队列 myQueue = new LC232_用栈实现队列();
        myQueue.push(1);
        myQueue.push(2);
        System.out.println("队列头部: " + myQueue.peek()); // 返回 1
        System.out.println("出队: " + myQueue.pop());    // 返回 1
        System.out.println("是否为空: " + myQueue.empty()); // 返回 false
    }
}
