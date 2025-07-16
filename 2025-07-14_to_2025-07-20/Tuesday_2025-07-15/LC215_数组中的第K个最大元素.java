import java.util.*;

/**
 * LeetCode 215 - 数组中的第K个最大元素
 * 
 * 题目描述：
 * 给定整数数组 nums 和整数 k，请返回数组中第 k 个最大的元素。
 * 请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
 * 
 * 示例：
 * 输入: nums = [3,2,1,5,6,4], k = 2
 * 输出: 5
 * 
 * 输入: nums = [3,2,3,1,2,4,5,5,6], k = 4
 * 输出: 4
 * 
 * 提示：
 * 1 <= k <= nums.length <= 10^4
 * -10^4 <= nums[i] <= 10^4
 */
public class LC215_数组中的第K个最大元素 {
    
    /**
     * 方法1：快速选择算法
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     */
    public static int findKthLargest(int[] nums, int k) {
        int n=nums.length;
        int l=0;
        int r=n-1;
        while(l<r){
            int p=partition(nums,l,r);
            if(p==k) return nums[k];
            if(p>k) r=p-1;
            else l=p+1;
        }
        return 0;
    }
    
    private static int partition(int[] nums,int left,int right) {
        int p=nums[right];
        int i=0;
    for (int j=0; j < nums.length; j++) {
        if(nums[j]<p){
            swap(nums,i,j);
            i++;
        }
    }
      swap(nums,i,p);
    
    return p;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    /**
     * 方法2：堆排序
     * 时间复杂度：O(n log k)
     * 空间复杂度：O(k)
     */
    public static int findKthLargest2(int[] nums, int k) {
        PriorityQueue <Integer> pq=new PriorityQueue<>();
       for (int nums2 : nums) {
        if(pq.size()==k) pq.poll();
        pq.offer(nums2);
       }
        return pq.peek();
    }
    
    /**
     * 方法3：排序
     * 时间复杂度：O(n log n)
     * 空间复杂度：O(log n)
     */
    public int findKthLargest3(int[] nums, int k) {
        // TODO: 实现你的解法
        return 0;
    }
    
    public static void main(String[] args) {
       System.out.println( findKthLargest(new int[] {3,2,3,1,2,4,5,5,6}, 4));
    }
} 