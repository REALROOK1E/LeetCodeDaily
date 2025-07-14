import java.util.*;

/**
 * LeetCode 232 - 用栈实现队列
 * 
 * 题目描述：
 * 请你仅使用两个栈实现先入先出队列。队列应当支持一般队列支持的所有操作（push、pop、peek、empty）：
 * 
 * 实现 MyQueue 类：
 * - void push(int x) 将元素 x 推到队列的末尾
 * - int pop() 从队列的开头移除并返回元素
 * - int peek() 返回队列开头的元素
 * - boolean empty() 如果队列为空，返回 true ；否则，返回 false
 * 
 * 说明：
 * 你只能使用标准的栈操作 —— 也就是只有 push to top, peek/pop from top, size, 和 is empty 操作是合法的。
 * 你所使用的语言也许不支持栈。你可以使用 list 或者 deque（双端队列）来模拟一个栈，只要是标准的栈操作即可。
 * 
 * 示例：
 * 输入：
 * ["MyQueue", "push", "push", "peek", "pop", "empty"]
 * [[], [1], [2], [], [], []]
 * 输出：
 * [null, null, null, 1, 1, false]
 * 
 * 解释：
 * MyQueue myQueue = new MyQueue();
 * myQueue.push(1); // queue is: [1]
 * myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
 * myQueue.peek(); // return 1
 * myQueue.pop(); // return 1, queue is [2]
 * myQueue.empty(); // return false
 * 
 * 提示：
 * 1 <= x <= 9
 * 最多调用 100 次 push、pop、peek 和 empty
 * 假设所有操作都是有效的 （例如，一个空的队列不会调用 pop 或者 peek 操作）
 * 
 * 进阶：
 * 你能否实现每个操作均摊时间复杂度为 O(1) 的队列？换句话说，执行 n 个操作的总时间复杂度为 O(n) ，
 * 即使其中一个操作可能花费较长时间。
 */
public class LC232_用栈实现队列 {
    
    /**
     * 方法1：双栈法
     * 时间复杂度：O(1) 均摊
     * 空间复杂度：O(n)
     */
    class MyQueue {
        // TODO: 实现你的解法
        
        public MyQueue() {
            // TODO: 初始化
        }
        
        public void push(int x) {
            // TODO: 实现push方法
        }
        
        public int pop() {
            // TODO: 实现pop方法
            return 0;
        }
        
        public int peek() {
            // TODO: 实现peek方法
            return 0;
        }
        
        public boolean empty() {
            // TODO: 实现empty方法
            return false;
        }
    }
    
    /**
     * 方法2：单栈法（不推荐，但可以理解思路）
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     */
    class MyQueue2 {
        // TODO: 实现你的解法
        
        public MyQueue2() {
            // TODO: 初始化
        }
        
        public void push(int x) {
            // TODO: 实现push方法
        }
        
        public int pop() {
            // TODO: 实现pop方法
            return 0;
        }
        
        public int peek() {
            // TODO: 实现peek方法
            return 0;
        }
        
        public boolean empty() {
            // TODO: 实现empty方法
            return false;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== 测试方法1 ===");
        LC232_用栈实现队列 solution = new LC232_用栈实现队列();
        MyQueue myQueue = solution.new MyQueue();
        
        // 测试用例
        myQueue.push(1);
        System.out.println("push(1)");
        
        myQueue.push(2);
        System.out.println("push(2)");
        
        int peek1 = myQueue.peek();
        System.out.println("peek() = " + peek1 + " (期望: 1)");
        
        int pop1 = myQueue.pop();
        System.out.println("pop() = " + pop1 + " (期望: 1)");
        
        boolean empty1 = myQueue.empty();
        System.out.println("empty() = " + empty1 + " (期望: false)");
        
        int pop2 = myQueue.pop();
        System.out.println("pop() = " + pop2 + " (期望: 2)");
        
        boolean empty2 = myQueue.empty();
        System.out.println("empty() = " + empty2 + " (期望: true)");
        
        System.out.println("\\n=== 测试方法2 ===");
        MyQueue2 myQueue2 = solution.new MyQueue2();
        
        myQueue2.push(1);
        myQueue2.push(2);
        myQueue2.push(3);
        
        System.out.println("peek() = " + myQueue2.peek());
        System.out.println("pop() = " + myQueue2.pop());
        System.out.println("peek() = " + myQueue2.peek());
    }
} 