/**
 * LC79 - 单词搜索
 * 难度：中等
 * 描述：
 * 给定一个 m x n 二维字符网格 board 和一个字符串单词 word 。如果 word 存在于网格中，返回 true ；否则，返回 false 。
 * 单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中"相邻"单元格是那些水平相邻或垂直相邻的单元格。
 * 同一个单元格内的字母不允许被重复使用。
 */
import java.util.*;

public class LC79_单词搜索 {

    /**
     * 方法：DFS回溯
     * @param board 字符网格
     * @param word 目标单词
     * @return 是否存在
     */
    public boolean exist(char[][] board, String word) {
        // 实现逻辑
        return false;
    }

    public static void main(String[] args) {
        LC79_单词搜索 solution = new LC79_单词搜索();
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCCED";
        boolean result = solution.exist(board, word);
        System.out.println("结果: " + result);
    }
}
