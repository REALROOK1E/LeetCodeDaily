import java.util.*;

/**
 * LeetCode 225 - 用队列实现栈
 * 
 * 题目描述：
 * 请你仅使用两个队列实现一个后入先出（LIFO）的栈，并支持普通栈的全部四种操作（push、top、pop 和 empty）。
 * 
 * 实现 MyStack 类：
 * - void push(int x) 将元素 x 压入栈顶。
 * - int pop() 移除并返回栈顶元素。
 * - int top() 返回栈顶元素。
 * - boolean empty() 如果栈是空的，返回 true ；否则，返回 false 。
 * 
 * 注意：
 * 你只能使用队列的基本操作 —— 也就是 push to back、peek/pop from front、size 和 is empty 这些操作。
 * 你所使用的语言也许不支持队列。 你可以使用 list （列表）或者 deque（双端队列）来模拟一个队列 , 只要是标准的队列操作即可。
 * 
 * 示例：
 * 输入：
 * ["MyStack", "push", "push", "top", "pop", "empty"]
 * [[], [1], [2], [], [], []]
 * 输出：
 * [null, null, null, 2, 2, false]
 * 
 * 解释：
 * MyStack myStack = new MyStack();
 * myStack.push(1);
 * myStack.push(2);
 * myStack.top(); // 返回 2
 * myStack.pop(); // 返回 2
 * myStack.empty(); // 返回 False
 * 
 * 提示：
 * 1 <= x <= 9
 * 最多调用100 次 push、pop、top 和 empty
 * 每次调用 pop 和 top 都保证栈不为空
 * 
 * 进阶：你能否仅用一个队列来实现栈。
 */

    
    /**
     * 方法2：单队列法
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     */
    class MyStack {
        int[] s;
        int r;
        public MyStack() {
            this. s=new int[1001];
            this. r=0;
        }

        public void push(int x) {
            s[r++]=x;
        }
        
        public int pop() {
            return s[--r];
        }
        
        public int top() {
            return s[r];
        }
        
        public boolean empty() {
            return r==0;
        }
    
    
    public static void main(String[] args) {
        System.out.println("=== 测试方法1 ===");

        MyStack myStack = new MyStack();
        
        // 测试用例
        myStack.push(1);
        System.out.println("push(1)");
        
        myStack.push(2);
        System.out.println("push(2)");
        
        int top1 = myStack.top();
        System.out.println("top() = " + top1 + " (期望: 2)");
        
        int pop1 = myStack.pop();
        System.out.println("pop() = " + pop1 + " (期望: 2)");
        
        boolean empty1 = myStack.empty();
        System.out.println("empty() = " + empty1 + " (期望: false)");
        
        int pop2 = myStack.pop();
        System.out.println("pop() = " + pop2 + " (期望: 1)");
        
        boolean empty2 = myStack.empty();
        System.out.println("empty() = " + empty2 + " (期望: true)");
        
    }
} 