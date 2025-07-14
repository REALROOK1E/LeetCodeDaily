import java.util.*;

/**
 * LeetCode 55 - 跳跃游戏
 * 
 * 题目描述：
 * 给定一个非负整数数组 nums ，你最初位于数组的第一个下标 。
 * 
 * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
 * 
 * 判断你是否能够到达最后一个下标。
 * 
 * 示例：
 * 输入: nums = [2,3,1,1,4]
 * 输出: true
 * 解释: 可以先跳 1 步，从下标 0 到达下标 1, 然后再从下标 1 跳 3 步到达最后一个下标。
 * 
 * 输入: nums = [3,2,1,0,4]
 * 输出: false
 * 解释: 无论怎样，总会到达下标为 3 的位置。但该下标的最大跳跃长度是 0 ， 所以永远不可能到达最后一个下标。
 * 
 * 提示：
 * 1 <= nums.length <= 3 * 10^4
 * 0 <= nums[i] <= 10^5
 */
public class LC55_跳跃游戏 {
    
    /**
     * 方法1：贪心算法
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     */
    public boolean canJump(int[] nums) {
        // TODO: 实现你的解法
        return false;
    }
    
    /**
     * 方法2：动态规划
     * 时间复杂度：O(n^2)
     * 空间复杂度：O(n)
     */
    public boolean canJump2(int[] nums) {
        // TODO: 实现你的解法
        return false;
    }
    
    /**
     * 方法3：回溯算法（超时）
     * 时间复杂度：O(2^n)
     * 空间复杂度：O(n)
     */
    public boolean canJump3(int[] nums) {
        // TODO: 实现你的解法
        return false;
    }
    
    /**
     * 方法4：BFS（超时）
     * 时间复杂度：O(n^2)
     * 空间复杂度：O(n)
     */
    public boolean canJump4(int[] nums) {
        // TODO: 实现你的解法
        return false;
    }
    
    public static void main(String[] args) {
        LC55_跳跃游戏 solution = new LC55_跳跃游戏();
        
        // 测试用例
        int[][] testCases = {
            {2, 3, 1, 1, 4},            // 期望输出: true
            {3, 2, 1, 0, 4},            // 期望输出: false
            {0},                         // 期望输出: true
            {1},                         // 期望输出: true
            {2, 0},                      // 期望输出: true
            {1, 0, 1, 0},               // 期望输出: false
            {2, 5, 0, 0},               // 期望输出: true
            {1, 2, 3},                  // 期望输出: true
            {3, 0, 8, 2, 0, 0, 1},     // 期望输出: true
            {0, 2, 3},                  // 期望输出: false
            {1, 1, 1, 1, 1},           // 期望输出: true
            {5, 9, 3, 2, 1, 0, 2, 3, 3, 1, 0, 0} // 期望输出: true
        };
        
        for (int i = 0; i < testCases.length; i++) {
            int[] nums = testCases[i];
            boolean result = solution.canJump(nums);
            System.out.println("测试用例 " + (i + 1) + ":");
            System.out.println("输入: " + Arrays.toString(nums));
            System.out.println("输出: " + result);
            System.out.println("---");
        }
    }
} 