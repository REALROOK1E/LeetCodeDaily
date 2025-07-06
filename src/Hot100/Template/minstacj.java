package Hot100.Template;

class minstacj {
    


    int [] q = new int[100000];
    int[] stack = new int[100000];
    int size=0;
    int r=0;
    public minstacj() {
        
    }
    
    public void push(int val) {
        stack[size++]=val;
        while(r>0&&stack[q[r]]>val){
            r--;
        }
        q[r++]=val;
    }
    
    public void pop() {
        size--;
        
    }
    
    public int top() {
        return stack[size-1];
    }
    
    public int getMin() {
        return q[0];
    }


    public static void main(String[] args) {
        minstacj m=new minstacj();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.getMin();   
        minStack.pop();
        minStack.top();      
        minStack.getMin();  

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