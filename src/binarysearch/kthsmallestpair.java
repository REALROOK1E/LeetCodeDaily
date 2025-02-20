package binarysearch;

import java.util.Arrays;

/**
 * @author: ZeKai
 * @date: 2025/2/19
 * @description:
 **/
public class kthsmallestpair {
    public static int smallestDistancePair(int[] nums, int k) {
    /*如果我知道这个数组的极差，其实是做不出来的，不能用0-极差做二分，因为不连续，这样理解对不对？不对！顺序不重要直接排序
      求最小差值，那我用所有差值作为。。。然后想个办法用函数判断有多少差值小于某个值
      因为要求第k小，比如一共4个数1357，6对 差值为 2,4,6,2,4,2，求第k=2小的，极差是4，范围0-4 mid=2
      那么判断一下有多少对差小于等于2.有三对，比mid大，那说明答案在这三对里 记下来一个答案，mid=1
      有0对是1，0<k 那么答案不记录,跳出
      那我还真要知道极差？如果知道的话，直接算的时候用个优先队列？不就知道了？！！！草，直接排序算啊，都说了顺序不重要
      * */
        Arrays.sort(nums);
        int r = nums[nums.length-1] - nums[0];//极差
        int l=0;
        int ans=0;
        while(l<=r){
            int mid =l+(r-l)/2;
            int x=howmanylowerthanN(nums,mid);
            if (x>=k){
                ans=mid;
                r=mid-1;
            }else {
                l=mid+1;
            }
        }
        return ans;
    }

    public static int howmanylowerthanN(int[] nums, int n) {
        int count = 0;
        int j = 0; // 快指针 因为已经排序了
        for (int i = 0; i < nums.length; i++) {
            // 移动快指针 j，直到 nums[j] - nums[i] > n
            while (j < nums.length && nums[j] - nums[i] <= n) {
                j++;
            }
            // 以 nums[i] 为起点的合法数对数量为 j - i - 1
            count += j - i - 1;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums=new int[]{1,90,7};//89，6,83
        smallestDistancePair(nums,2);
    }}