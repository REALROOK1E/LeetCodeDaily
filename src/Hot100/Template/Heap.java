package Hot100.Template;

import java.util.PriorityQueue;

import 左神.Array.findduplicate;

public class Heap {
    


    public static int findKthLargest(int[] nums, int k) {
        //单调队列做一下
        //我知道应该用堆的
        //这道题：ospp
        PriorityQueue<Integer> heap=new PriorityQueue<Integer>();
        for(int n:nums){
            heap.offer(n);
            if(heap.size()>k) 
             heap.poll();
        }

    
        return heap.peek();

}

    public static void main(String[] args) {
      
        System.out.println(  findKthLargest(new int[]{3,2,1,5,6,4},2));
    }
}
