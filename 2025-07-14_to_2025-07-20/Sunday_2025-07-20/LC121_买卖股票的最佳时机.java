import java.util.*;

/**
 * LeetCode 121 - 买卖股票的最佳时机
 * 
 * 题目描述：
 * 给定一个数组 prices ，它的第 i 个元素 prices[i] 表示一支给定股票第 i 天的价格。
 * 
 * 你只能选择某一天买入这只股票，并选择在未来的某一个不同的日子卖出该股票。设计一个算法来计算你所能获取的最大利润。
 * 
 * 返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0 。
 * 
 * 示例：
 * 输入: [7,1,5,3,6,4]
 * 输出: 5
 * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
 *      注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格；同时，你不能在第 1 天和第 2 天买入，然后在之后将它们卖出。
 *      因为这样属于同时参与了多笔交易，你必须在再次购买前出售掉之前的股票。
 * 
 * 输入: prices = [7,6,4,3,1]
 * 输出: 0
 * 解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。
 * 
 * 提示：
 * 1 <= prices.length <= 10^5
 * 0 <= prices[i] <= 10^4
 */
public class LC121_买卖股票的最佳时机 {
    
    /**
     * 方法1：一次遍历
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
     * 方法3：暴力解法（超时）
     * 时间复杂度：O(n^2)
     * 空间复杂度：O(1)
     */
    public int maxProfit3(int[] prices) {
        // TODO: 实现你的解法
        return 0;
    }
    
    /**
     * 方法4：分治法
     * 时间复杂度：O(n log n)
     * 空间复杂度：O(log n)
     */
    public int maxProfit4(int[] prices) {
        // TODO: 实现你的解法
        return 0;
    }
    
    public static void main(String[] args) {
        LC121_买卖股票的最佳时机 solution = new LC121_买卖股票的最佳时机();
        
        // 测试用例
        int[][] testCases = {
            {7, 1, 5, 3, 6, 4},         // 期望输出: 5
            {7, 6, 4, 3, 1},            // 期望输出: 0
            {1, 2, 3, 4, 5},            // 期望输出: 4
            {5, 4, 3, 2, 1},            // 期望输出: 0
            {1},                         // 期望输出: 0
            {1, 2},                      // 期望输出: 1
            {2, 1},                      // 期望输出: 0
            {3, 2, 6, 5, 0, 3},         // 期望输出: 4
            {2, 4, 1},                   // 期望输出: 2
            {1, 2, 4, 2, 5, 7, 2, 4, 9, 0, 9} // 期望输出: 9
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