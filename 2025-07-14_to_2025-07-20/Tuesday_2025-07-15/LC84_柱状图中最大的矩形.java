import java.util.*;

/**
 * LeetCode 84 - 柱状图中最大的矩形
 * 
 * 题目描述：
 * 给定 n 个非负整数，用来表示柱状图中各个柱子的高度。每个柱子彼此相邻，且宽度为 1 。
 * 求在该柱状图中，能够勾勒出来的矩形的最大面积。
 * 
 * 示例：
 * 输入: heights = [2,1,5,6,2,3]
 * 输出: 10
 * 解释: 最大的矩形为图中红色区域，面积为 10
 * 
 * 输入: heights = [2,4]
 * 输出: 4
 * 
 * 提示：
 * 1 <= heights.length <= 10^5
 * 0 <= heights[i] <= 10^4
 */
public class LC84_柱状图中最大的矩形 {
    
    /**
     * 方法1：单调栈
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     */
    public int largestRectangleArea(int[] heights) {
        // TODO: 实现你的解法
        return 0;
    }
    
    /**
     * 方法2：暴力解法（超时）
     * 时间复杂度：O(n^2)
     * 空间复杂度：O(1)
     */
    public int largestRectangleArea2(int[] heights) {
        // TODO: 实现你的解法
        return 0;
    }
    
    /**
     * 方法3：分治法
     * 时间复杂度：O(n log n)
     * 空间复杂度：O(log n)
     */
    public int largestRectangleArea3(int[] heights) {
        // TODO: 实现你的解法
        return 0;
    }
    
    public static void main(String[] args) {
        LC84_柱状图中最大的矩形 solution = new LC84_柱状图中最大的矩形();
        
        // 测试用例
        int[][] testCases = {
            {2, 1, 5, 6, 2, 3},  // 期望输出: 10
            {2, 4},                // 期望输出: 4
            {1},                   // 期望输出: 1
            {1, 1},                // 期望输出: 2
            {2, 1, 2},             // 期望输出: 3
            {0, 9},                // 期望输出: 9
            {2, 0, 2},             // 期望输出: 2
            {3, 1, 3, 2, 2}       // 期望输出: 6
        };
        
        for (int i = 0; i < testCases.length; i++) {
            int[] heights = testCases[i];
            int result = solution.largestRectangleArea(heights);
            System.out.println("测试用例 " + (i + 1) + ":");
            System.out.println("输入: " + Arrays.toString(heights));
            System.out.println("输出: " + result);
            System.out.println("---");
        }
    }
} 