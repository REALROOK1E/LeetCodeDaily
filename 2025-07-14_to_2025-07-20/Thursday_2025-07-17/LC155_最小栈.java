import java.util.*;

/**
 * LeetCode 155 - 最小栈
 * 
 * 题目描述：
 * 设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。
 * 
 * 实现 MinStack 类:
 * - MinStack() 初始化堆栈对象。
 * - void push(int val) 将元素val推入堆栈。
 * - void pop() 删除堆栈顶部的元素。
 * - int top() 获取堆栈顶部的元素。
 * - int getMin() 获取堆栈中的最小元素。
 * 
 * 示例：
 * 输入：
 * ["MinStack","push","push","push","getMin","pop","top","getMin"]
 * [[],[-2],[0],[-3],[],[],[],[]]
 * 
 * 输出：
 * [null,null,null,null,-3,null,0,-2]
 * 
 * 解释：
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> 返回 -3.
 * minStack.pop();
 * minStack.top();      --> 返回 0.
 * minStack.getMin();   --> 返回 -2.
 * 
 * 提示：
 * -2^31 <= val <= 2^31 - 1
 * pop、top 和 getMin 操作总是在非空栈上调用
 * 最多调用 3 * 10^4 次 push、pop、top 和 getMin
 */
public class LC155_最小栈 {
    
    /**
     * 方法2：使用一个栈存储差值
     * 时间复杂度：O(1)
     * 空间复杂度：O(1)
     */
    class MinStack2 {
        // TODO: 实现你的解法
        int dif;
        int min;
        //pop还原前一个最小值
        //push更新最小值
        int[] s;
        int r=0;
        public MinStack2() {
            this.dif=0;
            this.min=0;
            this.s=new int[30001];
        }
        
        public void push(int val) {

            if(r==0){
                 min=val;
                dif=val;
                s[r++]=0;
                }else  {
                     dif=val-min;
                     if(dif<0){
                        min=val;
                     }
                     s[r++]=dif;
            }
        }
        
        public void pop() {
            if(s[r--]<0){
                min=min-dif;
            }

        }
        
        public int top() {
            return s[r-1];
        }
        
        public int getMin() {
            // TODO: 实现getMin方法
            return 0;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== 测试方法1 ===");
        LC155_最小栈 solution = new LC155_最小栈();
        MinStack minStack = solution.new MinStack();
        
        // 测试用例
        minStack.push(-2);
        System.out.println("push(-2)");
        
        minStack.push(0);
        System.out.println("push(0)");
        
        minStack.push(-3);
        System.out.println("push(-3)");
        
        int min1 = minStack.getMin();
        System.out.println("getMin() = " + min1 + " (期望: -3)");
        
        minStack.pop();
        System.out.println("pop()");
        
        int top1 = minStack.top();
        System.out.println("top() = " + top1 + " (期望: 0)");
        
        int min2 = minStack.getMin();
        System.out.println("getMin() = " + min2 + " (期望: -2)");
        
        System.out.println("\\n=== 测试方法2 ===");
        MinStack2 minStack2 = solution.new MinStack2();
        
        minStack2.push(2);
        minStack2.push(0);
        minStack2.push(3);
        minStack2.push(0);
        
        System.out.println("getMin() = " + minStack2.getMin());
        minStack2.pop();
        System.out.println("getMin() = " + minStack2.getMin());
        minStack2.pop();
        System.out.println("getMin() = " + minStack2.getMin());
        minStack2.pop();
        System.out.println("getMin() = " + minStack2.getMin());
    }
} 