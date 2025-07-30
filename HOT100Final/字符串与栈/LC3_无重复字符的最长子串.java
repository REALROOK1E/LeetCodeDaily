/**
 * LC3 - 无重复字符的最长子串
 * 难度：中等
 * 描述：
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 */
public class LC3_无重复字符的最长子串 {

    /**
     * 方法：滑动窗口
     * @param s 输入字符串
     * @return 最长子串的长度
     */
    public int lengthOfLongestSubstring(String s) {
        // 实现逻辑
        return 0;
    }

    public static void main(String[] args) {
        LC3_无重复字符的最长子串 solution = new LC3_无重复字符的最长子串();
        String s = "abcabcbb";
        int result = solution.lengthOfLongestSubstring(s);
        System.out.println("结果: " + result);
    }
}
