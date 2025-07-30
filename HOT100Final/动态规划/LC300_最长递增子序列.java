/**
 * LC300 - 最长递增子序列
 * 难度：中等
 * 描述：
 * 给你一个整数数组 nums ，找到其中最长严格递增子序列的长度。
 * 子序列 是由数组派生而来的序列，删除（或不删除）数组中的元素而不改变其余元素的顺序。
 * 例如，[3,6,2,7] 是数组 [0,3,1,6,2,2,7] 的子序列。
 */
import java.util.*;

public class LC300_最长递增子序列 {


    public static int lengthOfLIS(int[] nums) {
        //每一个位置：要或者不要   比前一个的尾巴小，就不是递增,不要，如果大就要
        //dp[i]=Math.max(dp[i],dp[j]+1)  找j
        int [] dp=new int[nums.length];
        dp[0]=1;
        Arrays.fill(dp,1);
        for(int i=1;i<nums.length;i++){
            int j=i-1;
            while(j>0&&nums[i]<=nums[j]){
                j--;
            }
            if(nums[j]<nums[i])
            dp[i]=Math.max(dp[i],dp[j]+1);

    
        }
        return dp[nums.length-1];
    }

    public static void main(String[] args) {
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        int result = lengthOfLIS(nums);
        System.out.println("结果: " + result);
    }
}
