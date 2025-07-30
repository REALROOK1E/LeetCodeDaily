/**
 * LC200 - 岛屿数量
 * 难度：中等
 * 描述：
 * 给你一个由 '1'（陆地）和 '0'（水）组成的的二维网格，请你计算网格中岛屿的数量。
 * 岛屿总是被水包围，并且每座岛屿只能由水平方向和/或竖直方向上相邻的陆地连接形成。
 * 此外，你可以假设该网格的四条边均被水包围。
 */
import java.util.*;

public class LC200_岛屿数量 {

    /**
     * 方法：DFS/BFS
     * @param grid 二维网格
     * @return 岛屿数量
     */
    public int numIslands(char[][] grid) {
        // 实现逻辑
        return 0;
    }

    /**
     * DFS辅助方法
     */
    private void dfs(char[][] grid, int i, int j) {
        // 实现逻辑
    }

    public static void main(String[] args) {
        LC200_岛屿数量 solution = new LC200_岛屿数量();
        char[][] grid = {
            {'1','1','1','1','0'},
            {'1','1','0','1','0'},
            {'1','1','0','0','0'},
            {'0','0','0','0','0'}
        };
        int result = solution.numIslands(grid);
        System.out.println("结果: " + result);
    }
}
