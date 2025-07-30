/**
 * LC5 - 最长回文子串
 * 难度：中等
 * 描述：
 * 给你一个字符串 s，找到 s 中最长的回文子串。
 */
import java.util.*;

public class LC5_最长回文子串 {

    /**
     * 方法：中心扩展
     * @param s 输入字符串
     * @return 最长回文子串
     */
    public String longestPalindrome(String s) {
        // 实现逻辑
        return "";
    }

    public static void main(String[] args) {
        LC5_最长回文子串 solution = new LC5_最长回文子串();
        String s = "babad";
        String result = solution.longestPalindrome(s);
        System.out.println("结果: " + result);
    }
}
