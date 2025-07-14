import java.util.*;

/**
 * LeetCode 169 - 多数元素
 * 
 * 题目描述：
 * 给定一个大小为 n 的数组 nums ，返回其中的多数元素。多数元素是指在数组中出现次数大于 ⌊n/2⌋ 的元素。
 * 
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 * 
 * 示例：
 * 输入: nums = [3,2,3]
 * 输出: 3
 * 
 * 输入: nums = [2,2,1,1,1,2,2]
 * 输出: 2
 * 
 * 提示：
 * n == nums.length
 * 1 <= n <= 5 * 10^4
 * -10^9 <= nums[i] <= 10^9
 * 
 * 进阶：尝试设计时间复杂度为 O(n)、空间复杂度为 O(1) 的算法解决此问题。
 */
public class LC169_多数元素 {
    
    /**
     * 方法1：Boyer-Moore投票算法
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     */
    public int majorityElement(int[] nums) {
        // TODO: 实现你的解法
        return 0;
    }
    
    /**
     * 方法2：排序
     * 时间复杂度：O(n log n)
     * 空间复杂度：O(log n)
     */
    public int majorityElement2(int[] nums) {
        // TODO: 实现你的解法
        return 0;
    }
    
    /**
     * 方法3：哈希表
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     */
    public int majorityElement3(int[] nums) {
        // TODO: 实现你的解法
        return 0;
    }
    
    /**
     * 方法4：分治法
     * 时间复杂度：O(n log n)
     * 空间复杂度：O(log n)
     */
    public int majorityElement4(int[] nums) {
        // TODO: 实现你的解法
        return 0;
    }
    
    public static void main(String[] args) {
        LC169_多数元素 solution = new LC169_多数元素();
        
        // 测试用例
        int[][] testCases = {
            {3, 2, 3},                    // 期望输出: 3
            {2, 2, 1, 1, 1, 2, 2},       // 期望输出: 2
            {1},                          // 期望输出: 1
            {1, 1, 2},                   // 期望输出: 1
            {1, 2, 1},                   // 期望输出: 1
            {1, 1, 1, 2, 2},            // 期望输出: 1
            {2, 2, 2, 1, 1},            // 期望输出: 2
            {1, 1, 1, 1, 2, 2, 2},      // 期望输出: 1
            {1, 2, 3, 1, 1, 1, 1},      // 期望输出: 1
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2} // 期望输出: 1
        };
        
        for (int i = 0; i < testCases.length; i++) {
            int[] nums = testCases[i];
            int result = solution.majorityElement(nums);
            System.out.println("测试用例 " + (i + 1) + ":");
            System.out.println("输入: " + Arrays.toString(nums));
            System.out.println("输出: " + result);
            System.out.println("---");
        }
    }
} 