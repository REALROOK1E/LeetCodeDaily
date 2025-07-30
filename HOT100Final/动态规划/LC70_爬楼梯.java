/**
 * LC70 - 爬楼梯
 * 难度：简单
 * 描述：
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 */
import java.util.*;

public class LC70_爬楼梯 {

    /**
     * 方法：动态规划
     * @param n 楼梯阶数
     * @return 爬楼梯的方法数
     */
    public int climbStairs(int n) {
        // 实现逻辑
        return 0;
    }

    public static void main(String[] args) {
        LC70_爬楼梯 solution = new LC70_爬楼梯();
        int n = 3;
        int result = solution.climbStairs(n);
        System.out.println("结果: " + result);
    }
}
