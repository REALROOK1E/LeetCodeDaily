/**
 * LC64 - 最小路径和
 * 难度：中等
 * 描述：
 * 给定一个包含非负整数的 m x n 网格 grid ，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
 * 说明：每次只能向下或者向右移动一步。
 */
import java.util.*;

public class LC64_最小路径和 {

    /**
     * 方法：动态规划
     * @param grid 网格
     * @return 最小路径和
     */
    public int minPathSum(int[][] grid) {
        
        return 0;
    }

    public static void main(String[] args) {
        LC64_最小路径和 solution = new LC64_最小路径和();
        int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        int result = solution.minPathSum(grid);
        System.out.println("结果: " + result);
    }
}
