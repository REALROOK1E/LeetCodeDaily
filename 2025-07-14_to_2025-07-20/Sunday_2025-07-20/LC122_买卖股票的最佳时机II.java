import java.util.*;

/**
 * LeetCode 122 - 买卖股票的最佳时机II
 * 
 * 题目描述：
 * 给你一个整数数组 prices ，其中 prices[i] 表示某支股票第 i 天的价格。
 * 
 * 在每一天，你可以决定是否购买和/或出售股票。你在任何时候最多只能持有一股股票。你也可以先购买，然后在同一天出售。
 * 
 * 返回你能获得的最大利润 。
 * 
 * 示例：
 * 输入: prices = [7,1,5,3,6,4]
 * 输出: 7
 * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 3 天（股票价格 = 5）的时候卖出, 这笔交易所能获得利润 = 5 - 1 = 4 。
 *      随后，在第 4 天（股票价格 = 3）的时候买入，在第 5 天（股票价格 = 6）的时候卖出, 这笔交易所能获得利润 = 6 - 3 = 3 。
 *      总利润为 4 + 3 = 7 。
 * 
 * 输入: prices = [1,2,3,4,5]
 * 输出: 4
 * 解释: 在第 1 天（股票价格 = 1）的时候买入，在第 5 天 （股票价格 = 5）的时候卖出, 这笔交易所能获得利润 = 5 - 1 = 4 。
 *      总利润为 4 。
 * 
 * 输入: prices = [7,6,4,3,1]
 * 输出: 0
 * 解释: 在这种情况下, 交易无法获得正利润，所以不参与交易可以获得最大利润，最大利润为 0 。
 * 
 * 提示：
 * 1 <= prices.length <= 3 * 10^4
 * 0 <= prices[i] <= 10^4
 */
public class LC122_买卖股票的最佳时机II {
    
    /**
     * 方法1：贪心算法
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     */
    public int maxProfit(int[] prices) {
        // TODO: 实现你的解法
        return 0;
    }
    
    /**
     * 方法2：动态规划
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     */
    public int maxProfit2(int[] prices) {
        // TODO: 实现你的解法
        return 0;
    }
    
    /**
     * 方法3：峰谷法
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     */
    public int maxProfit3(int[] prices) {
        // TODO: 实现你的解法
        return 0;
    }
    
    /**
     * 方法4：暴力解法（超时）
     * 时间复杂度：O(2^n)
     * 空间复杂度：O(n)
     */
    public int maxProfit4(int[] prices) {
        // TODO: 实现你的解法
        return 0;
    }
    
    public static void main(String[] args) {
        LC122_买卖股票的最佳时机II solution = new LC122_买卖股票的最佳时机II();
        
        // 测试用例
        int[][] testCases = {
            {7, 1, 5, 3, 6, 4},         // 期望输出: 7
            {1, 2, 3, 4, 5},            // 期望输出: 4
            {7, 6, 4, 3, 1},            // 期望输出: 0
            {1},                         // 期望输出: 0
            {1, 2},                      // 期望输出: 1
            {2, 1},                      // 期望输出: 0
            {3, 2, 6, 5, 0, 3},         // 期望输出: 7
            {2, 4, 1},                   // 期望输出: 2
            {1, 2, 4, 2, 5, 7, 2, 4, 9, 0, 9}, // 期望输出: 15
            {6, 1, 3, 2, 4, 7}          // 期望输出: 7
        };
        
        for (int i = 0; i < testCases.length; i++) {
            int[] prices = testCases[i];
            int result = solution.maxProfit(prices);
            System.out.println("测试用例 " + (i + 1) + ":");
            System.out.println("输入: " + Arrays.toString(prices));
            System.out.println("输出: " + result);
            System.out.println("---");
        }
    }
} 