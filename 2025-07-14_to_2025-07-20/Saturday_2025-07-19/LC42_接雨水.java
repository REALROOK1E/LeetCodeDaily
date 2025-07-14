import java.util.*;

/**
 * LeetCode 42 - 接雨水
 * 
 * 题目描述：
 * 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
 * 
 * 示例：
 * 输入: height = [0,1,0,2,1,0,1,3,2,1,2,1]
 * 输出: 6
 * 解释: 上面是由数组 [0,1,0,2,1,0,1,3,2,1,2,1] 表示的高度图，
 * 在这种情况下，可以接 6 个单位的雨水（蓝色部分表示雨水）。
 * 
 * 输入: height = [4,2,0,3,2,5]
 * 输出: 9
 * 
 * 提示：
 * n == height.length
 * 1 <= n <= 2 * 10^4
 * 0 <= height[i] <= 10^5
 */
public class LC42_接雨水 {
    
    /**
     * 方法1：动态规划（预计算左右最大值）
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     */
    public int trap(int[] height) {
        // TODO: 实现你的解法
        return 0;
    }
    
    /**
     * 方法2：双指针
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     */
    public int trap2(int[] height) {
        // TODO: 实现你的解法
        return 0;
    }
    
    /**
     * 方法3：单调栈
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     */
    public int trap3(int[] height) {
        // TODO: 实现你的解法
        return 0;
    }
    
    /**
     * 方法4：暴力解法（超时）
     * 时间复杂度：O(n^2)
     * 空间复杂度：O(1)
     */
    public int trap4(int[] height) {
        // TODO: 实现你的解法
        return 0;
    }
    
    public static void main(String[] args) {
        LC42_接雨水 solution = new LC42_接雨水();
        
        // 测试用例
        int[][] testCases = {
            {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1},  // 期望输出: 6
            {4, 2, 0, 3, 2, 5},                       // 期望输出: 9
            {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1},   // 期望输出: 6
            {4, 2, 3},                                 // 期望输出: 1
            {5, 4, 1, 2},                             // 期望输出: 1
            {1, 0, 1},                                // 期望输出: 1
            {1, 2, 3, 4, 5},                          // 期望输出: 0
            {5, 4, 3, 2, 1},                          // 期望输出: 0
            {1},                                       // 期望输出: 0
            {1, 2, 1},                                // 期望输出: 0
            {3, 0, 0, 2, 0, 4},                       // 期望输出: 10
            {0, 2, 0}                                 // 期望输出: 0
        };
        
        for (int i = 0; i < testCases.length; i++) {
            int[] height = testCases[i];
            int result = solution.trap(height);
            System.out.println("测试用例 " + (i + 1) + ":");
            System.out.println("输入: " + Arrays.toString(height));
            System.out.println("输出: " + result);
            System.out.println("---");
        }
    }
} 