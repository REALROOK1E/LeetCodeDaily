import java.util.*;

/**
 53. 最大子数组和
中等
相关标签
premium lock icon
相关企业
给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。

子数组是数组中的一个连续部分。

 

示例 1：

输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
输出：6
解释：连续子数组 [4,-1,2,1] 的和最大，为 6 。
示例 2：

输入：nums = [1]
输出：1
示例 3：

输入：nums = [5,4,-1,7,8]
输出：23
 */
public class LC53_最大子数组和 {
    
    public static int maxSubArray(int[] nums) {
        //算一个前缀和--更新最小值--更新答案

        int min = 0;
        int sum = 0;
        int ans = nums[0];
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            ans = Math.max(ans, sum - min);
            min = Math.min(min, sum);
        }
        return ans;
     
    }
    
  public static void main(String[] args) {
    maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4});
  }
    
} 