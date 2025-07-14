import java.util.*;

/**
 * LeetCode 238 - 除自身以外数组的乘积
 * 
 * 题目描述：
 * 给你一个整数数组 nums，返回数组 answer ，其中 answer[i] 等于 nums 中除 nums[i] 之外其余各元素的乘积。
 * 
 * 题目数据保证数组 nums 之中任意元素的全部前缀元素和后缀（甚至是整个数组）的乘积都在 32 位整数范围内。
 * 
 * 请不要使用除法，且在 O(n) 时间复杂度内完成此题。
 * 
 * 示例：
 * 输入: nums = [1,2,3,4]
 * 输出: [24,12,8,6]
 * 解释: answer[0] = 2×3×4 = 24, answer[1] = 1×3×4 = 12, answer[2] = 1×2×4 = 8, answer[3] = 1×2×3 = 6
 * 
 * 输入: nums = [-1,1,0,-3,3]
 * 输出: [0,0,9,0,0]
 * 
 * 提示：
 * 2 <= nums.length <= 10^5
 * -30 <= nums[i] <= 30
 * 保证数组 nums 之中任意元素的全部前缀元素和后缀（甚至是整个数组）的乘积都在 32 位整数范围内
 * 
 * 进阶：你可以在 O(1) 的额外空间复杂度内完成这个题目吗？（出于对空间复杂度分析的目的，输出数组不被视为额外空间。）
 */
public class LC238_除自身以外数组的乘积 {
    
    /**
     * 方法1：左右乘积列表
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     */
    public int[] productExceptSelf(int[] nums) {
        // TODO: 实现你的解法
        return new int[0];
    }
    
    /**
     * 方法2：空间优化版本
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)（输出数组不算额外空间）
     */
    public int[] productExceptSelf2(int[] nums) {
        // TODO: 实现你的解法
        return new int[0];
    }
    
    /**
     * 方法3：使用除法（不推荐，但可以理解思路）
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     */
    public int[] productExceptSelf3(int[] nums) {
        // TODO: 实现你的解法
        return new int[0];
    }
    
    public static void main(String[] args) {
        LC238_除自身以外数组的乘积 solution = new LC238_除自身以外数组的乘积();
        
        // 测试用例
        int[][] testCases = {
            {1, 2, 3, 4},                // 期望输出: [24,12,8,6]
            {-1, 1, 0, -3, 3},           // 期望输出: [0,0,9,0,0]
            {2, 3, 4, 5},                // 期望输出: [60,40,30,24]
            {1, 1, 1, 1},                // 期望输出: [1,1,1,1]
            {1, 0},                      // 期望输出: [0,1]
            {0, 0},                      // 期望输出: [0,0]
            {1, 2, 3},                   // 期望输出: [6,3,2]
            {-2, -3, -4, -5}            // 期望输出: [60,40,30,24]
        };
        
        for (int i = 0; i < testCases.length; i++) {
            int[] nums = testCases[i];
            int[] result = solution.productExceptSelf(nums);
            System.out.println("测试用例 " + (i + 1) + ":");
            System.out.println("输入: " + Arrays.toString(nums));
            System.out.println("输出: " + Arrays.toString(result));
            System.out.println("---");
        }
    }
} 