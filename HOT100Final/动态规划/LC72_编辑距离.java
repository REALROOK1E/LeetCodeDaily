/**
 * LC72 - 编辑距离
 * 难度：困难
 * 描述：
 * 给你两个单词 word1 和 word2， 请返回将 word1 转换成 word2 所使用的最少操作数  。
 * 你可以对一个单词进行如下三种操作：
 * - 插入一个字符
 * - 删除一个字符
 * - 替换一个字符
 */
import java.util.*;

public class LC72_编辑距离 {

    /**
     * 方法：动态规划
     * @param word1 单词1
     * @param word2 单词2
     * @return 最少操作数
     */
    public int minDistance(String word1, String word2) {
        // 实现逻辑
        return 0;
    }

    public static void main(String[] args) {
        LC72_编辑距离 solution = new LC72_编辑距离();
        String word1 = "horse";
        String word2 = "ros";
        int result = solution.minDistance(word1, word2);
        System.out.println("结果: " + result);
    }
}
