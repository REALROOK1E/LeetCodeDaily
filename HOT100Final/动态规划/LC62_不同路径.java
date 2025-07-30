/**
 * LC62 - 不同路径
 * 难度：中等
 * 描述：
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为 "Start" ）。
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为 "Finish" ）。
 * 问总共有多少条不同的路径？
 */
import java.util.*;

public class LC62_不同路径 {

    /**
     * 方法：动态规划
     * @param m 行数
     * @param n 列数
     * @return 不同路径数
     */
    public int uniquePaths(int m, int n) {
        // 实现逻辑
        return 0;
    }

    public static void main(String[] args) {
        LC62_不同路径 solution = new LC62_不同路径();
        int m = 3, n = 7;
        int result = solution.uniquePaths(m, n);
        System.out.println("结果: " + result);
    }
}
