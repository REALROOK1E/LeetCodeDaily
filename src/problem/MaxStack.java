package problem;

/**
 * @author: ZeKai
 * @date: 2025/2/11
 * @description:
 **/

import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Stack;

/**
 * @author: ZeKai
 * @date: 2025/2/11
 * @description:
 **/
class MaxStack {
    Stack <Integer> maxStack = new Stack();
    Stack <Integer> stack=new Stack();
    Stack <Integer> helper=new Stack();
    public MaxStack() {

    }

    public void push(Integer val) {
        stack.push(val);
        if(maxStack.isEmpty()||maxStack.peek()<val) maxStack.push(val);
        else maxStack.push(maxStack.peek());
        System.out.println(maxStack+"最大值栈");
        System.out.println(stack+"栈");
        }

    public void pop() {
       stack.pop();
       maxStack.pop();
    }

    public Integer top() {
        System.out.println(stack.peek());
        return stack.peek();
    }

    public Integer getMax() {
        System.out.println(maxStack.peek());
        return maxStack.peek();
    }

    public void popMax(){
        Integer max=maxStack.peek();

        while(!Objects.equals(stack.peek(), max)){
            helper.push(stack.pop());
            maxStack.pop();
        }
        stack.pop();
        maxStack.pop();
        while(!helper.isEmpty()){
            push(helper.pop());
        }
        System.out.println(stack);
        System.out.println(maxStack);

    }
    public static void main(String[] args) {
        MaxStack stk = new MaxStack();
        stk.push(5);
        stk.push(1);
        stk.push(5);
        stk.push(2);
        stk.push(5);
        stk.popMax()   ;//返回 5，栈变为 [5, 1, 5, 2]
        stk.popMax()   ; //返回 5，栈变为 [5, 1, 2]
        stk.popMax()   ;//返回 5，栈变为 [1, 2]
        stk.getMax()  ;//返回 2
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