package 左神.DSdesign;
class MinStack {
    int[] q = new int[100000];
    int[] s = new int[100000];
    int r=0;//栈的
    int t=0;//队列的


/*
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   --> 返回 -3.
minStack.pop();
minStack.top();      --> 返回 0.
minStack.getMin();   --> 返回 -2.
 */

    //是我用这个队列完成栈，栈就是栈
    public MinStack() {
    }
    public void print (){
     
        System.out.println("栈：");
        for (int j = r-1; j >= 0; j--) {
           
            System.out.println(s[j]+"->");
        }
    
        System.out.println("队：");
        for (int s = t-1; s >= 0; s--)  {
     
        System.out.println(q[t]+"->");
     }
    }
    public void push(int val) {
        s[r++]=val;
        while(r>0&&val<s[q[r-1]]){
            t--;
        }
        q[t++]=r-1;
        
    }
    
    public void pop() {
        r--;
        while(s[r]>q[t-1]){
            t--;
        }
    }
    
    public int top() {
        return s[r-1];
    }
    
    public int getMin() {
        return s[q[1]];
    }

}
class main{


    
    public static void main(String[] args) {
        MinStack minStack=new MinStack();

minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.print();
System.out.println("---------");
System.out.println(minStack.getMin());
System.out.println("---------");
minStack.pop();
minStack.print();
System.out.println("---------");
System.out.println(minStack.top() );
System.out.println("---------");
System.out.println(minStack.getMin());

    

    }
}