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
    public int findKthLargest(int[] nums, int k) {
        // TODO: 实现你的解法
        return 0;
    }
    
    /**
     * 方法2：堆排序
     * 时间复杂度：O(n log k)
     * 空间复杂度：O(k)
     */
    public int findKthLargest2(int[] nums, int k) {
        // TODO: 实现你的解法
        return 0;
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
        LC215_数组中的第K个最大元素 solution = new LC215_数组中的第K个最大元素();
        
        // 测试用例
        int[][] testCases = {
            {3, 2, 1, 5, 6, 4}, 2,           // 期望输出: 5
            {3, 2, 3, 1, 2, 4, 5, 5, 6}, 4,  // 期望输出: 4
            {1}, 1,                           // 期望输出: 1
            {1, 2, 3, 4, 5}, 2,              // 期望输出: 4
            {5, 4, 3, 2, 1}, 3               // 期望输出: 3
        };
        
        for (int i = 0; i < testCases.length; i += 2) {
            int[] nums = testCases[i];
            int k = testCases[i + 1];
            int result = solution.findKthLargest(nums, k);
            System.out.println("测试用例 " + (i/2 + 1) + ":");
            System.out.println("输入: nums = " + Arrays.toString(nums) + ", k = " + k);
            System.out.println("输出: " + result);
            System.out.println("---");
        }
    }
} 