/**
 * LC121 - 买卖股票的最佳时机
 * 难度：简单
 * 描述：
 * 给定一个数组 prices ，它的第 i 个元素 prices[i] 表示一支给定股票第 i 天的价格。
 * 你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。
 * 返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0 。
 */
import java.util.*;

public class LC121_买卖股票的最佳时机 {

    /**
     * 方法：一次遍历
     * @param prices 股票价格数组
     * @return 最大利润
     */
    public int maxProfit(int[] prices) {
        // 实现逻辑
        return 0;
    }

    public static void main(String[] args) {
        LC121_买卖股票的最佳时机 solution = new LC121_买卖股票的最佳时机();
        int[] prices = {7, 1, 5, 3, 6, 4};
        int result = solution.maxProfit(prices);
        System.out.println("结果: " + result);
    }
}
