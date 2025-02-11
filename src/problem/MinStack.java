package problem;

import java.util.PriorityQueue;
import java.util.Stack;

/**
 * @author: ZeKai
 * @date: 2025/2/11
 * @description:
 **/
class MinStack {
Stack <Integer> minStack = new Stack();
Stack <Integer> stack=new Stack();
    public MinStack() {

    }

    public void push(Integer val) {
          stack.push(val);
          if(minStack.isEmpty()||val<minStack.peek()) minStack.push(val);
          else minStack.push(minStack.peek());
          }

    public void pop() {
      stack.pop();
      minStack.pop();
    }

    public Integer top() {
          return stack.peek();
    }

    public Integer getMin() {
        return minStack.peek();
    }
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        minStack.top();
        System.out.println(minStack.getMin());
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */