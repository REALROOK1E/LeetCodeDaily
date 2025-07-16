import java.util.*;

/**
 * LeetCode 3 - 无重复字符的最长子串
 * 
 * 题目描述：
 * 给定一个字符串，请你找出其中不含有重复字符的最长子串的长度。
 * 
 * 示例：
 * 输入: s = "abcabcbb"
 * 输出: 3 
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 
 * 输入: s = "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 
 * 输入: s = "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 * 
 * 提示：
 * 0 <= s.length <= 5 * 10^4
 * s 由英文字母、数字、符号和空格组成
 */
public class LC3_无重复字符的最长子串 {
    
    /**
     * 方法1：滑动窗口 + 哈希集合
     * 时间复杂度：O(n)
     * 空间复杂度：O(min(m, n))，其中m是字符集大小
     */
    public static int lengthOfLongestSubstring(String s) {

        int l=0;
        int r=0;
        int ans=0;
        HashSet<Character> set=new HashSet<>();
        char[] c=s.toCharArray();
        while(r<c.length){
            while(l<r&&set.contains(c[r])){
                    set.remove(c[l++]);
                }
            set.add(c[r++]);
         ans=Math.max(ans,set.size());   
        }
        return ans;
    }
    
    /**
     * 方法2：滑动窗口 + 哈希表（记录字符位置）
     * 时间复杂度：O(n)
     * 空间复杂度：O(min(m, n))
     */
    public int lengthOfLongestSubstring2(String s) {
        // TODO: 实现你的解法
        return 0;
    }
    
    /**
     * 方法3：优化的滑动窗口
     * 时间复杂度：O(n)
     * 空间复杂度：O(min(m, n))
     */
    public int lengthOfLongestSubstring3(String s) {

    
    }
    
    public static void main(String[] args) {
       
        
        // 测试用例
        String[] testCases = {
            "abcabcbb",  // 期望输出: 3
            "bbbbb",     // 期望输出: 1
            "pwwkew",    // 期望输出: 3
            "",          // 期望输出: 0
            "a",         // 期望输出: 1
            "au"         // 期望输出: 2
        };
        
        for (String testCase : testCases) {
            int result = lengthOfLongestSubstring(testCase);
            System.out.println("输入: \"" + testCase + "\"");
            System.out.println("输出: " + result);
            System.out.println("---");
        }
    }
} 