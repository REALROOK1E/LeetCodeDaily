import java.util.*;

/**
 * LeetCode 239 - 滑动窗口最大值
 * 
 * 题目描述：
 * 给你一个整数数组 nums，有一个大小为 k 的滑动窗口从数组的最左侧移动到数组的最右侧。
 * 你只可以看到在滑动窗口内的 k 个数字。滑动窗口每次只向右移动一位。
 * 返回滑动窗口中的最大值。
 * 
 * 示例：
 * 输入: nums = [1,3,-1,-3,5,3,6,7], k = 3
 * 输出: [3,3,5,5,6,7]
 * 解释: 
 * 滑动窗口的位置                最大值
 * ---------------               -----
 * [1  3  -1] -3  5  3  6  7       3
 *  1 [3  -1  -3] 5  3  6  7       3
 *  1  3 [-1  -3  5] 3  6  7       5
 *  1  3  -1 [-3  5  3] 6  7       5
 *  1  3  -1  -3 [5  3  6] 7       6
 *  1  3  -1  -3  5 [3  6  7]      7
 * 
 * 提示：
 * 1 <= nums.length <= 10^5
 * -10^4 <= nums[i] <= 10^4
 * 1 <= k <= nums.length
 */
public class LC239_滑动窗口最大值 {
    
    /**
     * 方法1：单调队列（推荐）
     * 时间复杂度：O(n)
     * 空间复杂度：O(k)
     */
    public int[] maxSlidingWindow(int[] nums, int k) {
        // TODO: 实现你的解法
        return new int[0];
    }
    
    /**
     * 方法2：TreeMap
     * 时间复杂度：O(n log k)
     * 空间复杂度：O(k)
     */
    public int[] maxSlidingWindow2(int[] nums, int k) {
        // TODO: 实现你的解法
        return new int[0];
    }
    
    /**
     * 方法3：优先队列（堆）
     * 时间复杂度：O(n log k)
     * 空间复杂度：O(k)
     */
    public int[] maxSlidingWindow3(int[] nums, int k) {
        // TODO: 实现你的解法
        return new int[0];
    }
    
    public static void main(String[] args) {
        LC239_滑动窗口最大值 solution = new LC239_滑动窗口最大值();
        
        // 测试用例
        int[] nums1 = {1, 3, -1, -3, 5, 3, 6, 7};
        int k1 = 3;
        int[] expected1 = {3, 3, 5, 5, 6, 7};
        
        int[] nums2 = {1};
        int k2 = 1;
        int[] expected2 = {1};
        
        int[] nums3 = {1, -1};
        int k3 = 1;
        int[] expected3 = {1, -1};
        
        // 测试方法1
        System.out.println("=== 测试方法1 ===");
        int[] result1 = solution.maxSlidingWindow(nums1, k1);
        System.out.println("输入: nums = " + Arrays.toString(nums1) + ", k = " + k1);
        System.out.println("期望输出: " + Arrays.toString(expected1));
        System.out.println("实际输出: " + Arrays.toString(result1));
        System.out.println("结果正确: " + Arrays.equals(result1, expected1));
        System.out.println();
        
        // 测试方法2
        System.out.println("=== 测试方法2 ===");
        int[] result2 = solution.maxSlidingWindow2(nums1, k1);
        System.out.println("输入: nums = " + Arrays.toString(nums1) + ", k = " + k1);
        System.out.println("期望输出: " + Arrays.toString(expected1));
        System.out.println("实际输出: " + Arrays.toString(result2));
        System.out.println("结果正确: " + Arrays.equals(result2, expected1));
    }
} 