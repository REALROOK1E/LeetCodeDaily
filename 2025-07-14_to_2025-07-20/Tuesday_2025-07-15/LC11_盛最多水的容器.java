/**
 * LeetCode 11 - 盛最多水的容器
 * 
 * 题目描述：
 * 给定一个长度为 n 的整数数组 height 。有 n 条垂线，第 i 条线的两个端点是 (i, 0) 和 (i, height[i]) 。
 * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 * 返回容器可以储存的最大水量。
 * 
 * 示例：
 * 输入: height = [1,8,6,2,5,4,8,3,7]
 * 输出: 49
 * 解释: 图中垂直线代表输入数组 [1,8,6,2,5,4,8,3,7]。在此情况下，容器能够容纳水（表示为蓝色部分）的最大值为 49。
 * 
 * 输入: height = [1,1]
 * 输出: 1
 * 
 * 提示：
 * n == height.length
 * 2 <= n <= 10^5
 * 0 <= height[i] <= 10^4
 */
public class LC11_盛最多水的容器 {
    
    /**
     * 方法1：双指针
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     */
    public int maxArea(int[] height) {
        // TODO: 实现你的解法
        return 0;
    }
    
    /**
     * 方法2：暴力解法（超时）
     * 时间复杂度：O(n^2)
     * 空间复杂度：O(1)
     */
    public int maxArea2(int[] height) {
        // TODO: 实现你的解法
        return 0;
    }
    
    public static void main(String[] args) {
        LC11_盛最多水的容器 solution = new LC11_盛最多水的容器();
        
        // 测试用例
        int[][] testCases = {
            {1, 8, 6, 2, 5, 4, 8, 3, 7},  // 期望输出: 49
            {1, 1},                          // 期望输出: 1
            {4, 3, 2, 1, 4},                // 期望输出: 16
            {1, 2, 1},                      // 期望输出: 2
            {2, 3, 4, 5, 18, 17, 6}        // 期望输出: 17
        };
        
        for (int i = 0; i < testCases.length; i++) {
            int[] height = testCases[i];
            int result = solution.maxArea(height);
            System.out.println("测试用例 " + (i + 1) + ":");
            System.out.println("输入: " + java.util.Arrays.toString(height));
            System.out.println("输出: " + result);
            System.out.println("---");
        }
    }
} 