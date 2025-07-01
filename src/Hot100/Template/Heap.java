package Hot100.Template;

import 左神.Array.findduplicate;

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

    public static void main(String[] args) {
        findKthLargest(new int[]{3,2,1,5,6,4},2);
    }
}