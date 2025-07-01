package Hot100.Template;

public class Heap {
    
}
class Solution {
    public int findKthLargest(int[] nums, int k) {
        //单调队列做一下
        //我知道应该用堆的
        //长度为k的单调队列的最后一个
        int [] q=new int[k];


        return q[k-1]; 
    }
}