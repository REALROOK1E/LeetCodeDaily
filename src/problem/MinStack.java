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
          if(minStack.isEmpty()) minStack.push(val);
          else if(minStack.peek()>val) minStack.push(val);
          else {
              int temp = minStack.peek();
              minStack.pop();
              minStack.push(val);
              minStack.push(temp);
    }}

    public void pop() {
      int p=stack.pop();
      if(p==minStack.peek()) minStack.pop();
      else {
          int temp = minStack.peek();
          minStack.pop();
         minStack.pop();
          minStack.push(temp);
      }
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