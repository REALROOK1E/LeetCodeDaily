import java.util.*;

/**
 * LeetCode 128 - 最长连续序列
 * 
 * 题目描述：
 * 给定一个未排序的整数数组 nums ，找出数字连续的最长序列（不要求序列元素在原数组中连续）的长度。
 * 请你设计并实现时间复杂度为 O(n) 的算法解决此问题。
 * 
 * 示例：
 * 输入: nums = [100,4,200,1,3,2]
 * 输出: 4
 * 解释: 最长数字连续序列是 [1, 2, 3, 4]。它的长度为 4。
 * 
 * 输入: nums = [0,3,7,2,5,8,4,6,0,1]
 * 输出: 9
 * 
 * 提示：
 * 0 <= nums.length <= 10^5
 * -10^9 <= nums[i] <= 10^9
 */
public class LC128_最长连续序列 {
    
    /**
     * 方法1：哈希集合
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     */
    public int longestConsecutive(int[] nums) {
        // TODO: 实现你的解法
        return 0;
    }
    
    /**
     * 方法2：排序
     * 时间复杂度：O(n log n)
     * 空间复杂度：O(1)
     */
    public int longestConsecutive2(int[] nums) {
        // TODO: 实现你的解法
        return 0;
    }
    
    /**
     * 方法3：并查集
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     */
    public int longestConsecutive3(int[] nums) {
        // TODO: 实现你的解法
        return 0;
    }
    
    public static void main(String[] args) {
        LC128_最长连续序列 solution = new LC128_最长连续序列();
        
        // 测试用例
        int[][] testCases = {
            {100, 4, 200, 1, 3, 2},           // 期望输出: 4
            {0, 3, 7, 2, 5, 8, 4, 6, 0, 1},   // 期望输出: 9
            {},                                 // 期望输出: 0
            {1},                               // 期望输出: 1
            {1, 2, 0, 1},                     // 期望输出: 3
            {9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6} // 期望输出: 7
        };
        
        for (int i = 0; i < testCases.length; i++) {
            int[] nums = testCases[i];
            int result = solution.longestConsecutive(nums);
            System.out.println("测试用例 " + (i + 1) + ":");
            System.out.println("输入: " + Arrays.toString(nums));
            System.out.println("输出: " + result);
            System.out.println("---");
        }
    }
} 