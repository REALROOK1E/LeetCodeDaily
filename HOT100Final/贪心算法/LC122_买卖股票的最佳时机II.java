/**
 * LC122 - 买卖股票的最佳时机 II
 * 难度：中等
 * 描述：
 * 给你一个整数数组 prices ，其中 prices[i] 表示某支股票第 i 天的价格。
 * 在每一天，你可以决定是否购买和/或出售股票。你在任何时候 最多 只能持有 一股 股票。你也可以先购买，然后在 同一天 出售。
 * 返回 你能获得的 最大 利润 。
 */
import java.util.*;

public class LC122_买卖股票的最佳时机II {

    /**
     * 方法：贪心算法
     * @param prices 股票价格数组
     * @return 最大利润
     */
    public int maxProfit(int[] prices) {
        // 实现逻辑
        return 0;
    }

    public static void main(String[] args) {
        LC122_买卖股票的最佳时机II solution = new LC122_买卖股票的最佳时机II();
        int[] prices = {7, 1, 5, 3, 6, 4};
        int result = solution.maxProfit(prices);
        System.out.println("结果: " + result);
    }
}
