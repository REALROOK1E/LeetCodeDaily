import java.util.*;

/**
 * LeetCode 20 - 有效的括号
 * 
 * 题目描述：
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 * 
 * 有效字符串需满足：
 * 1. 左括号必须用相同类型的右括号闭合。
 * 2. 左括号必须以正确的顺序闭合。
 * 3. 每个右括号都有一个对应的相同类型的左括号。
 * 
 * 示例：
 * 输入: s = "()"
 * 输出: true
 * 
 * 输入: s = "()[]{}"
 * 输出: true
 * 
 * 输入: s = "(]"
 * 输出: false
 * 
 * 输入: s = "([)]"
 * 输出: false
 * 
 * 输入: s = "{[]}"
 * 输出: true
 * 
 * 提示：
 * 1 <= s.length <= 10^4
 * s 仅由括号 '()[]{}' 组成
 */
public class LC20_有效的括号 {
    
    /**
     * 方法1：栈
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     */
    public boolean isValid(String s) {
        // TODO: 实现你的解法
        return false;
    }
    
    /**
     * 方法2：使用数组模拟栈
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     */
    public boolean isValid2(String s) {
        // TODO: 实现你的解法
        return false;
    }
    
    /**
     * 方法3：使用HashMap优化
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     */
    public boolean isValid3(String s) {
        // TODO: 实现你的解法
        return false;
    }
    
    public static void main(String[] args) {
        LC20_有效的括号 solution = new LC20_有效的括号();
        
        // 测试用例
        String[] testCases = {
            "()",        // 期望输出: true
            "()[]{}",    // 期望输出: true
            "(]",        // 期望输出: false
            "([)]",      // 期望输出: false
            "{[]}",      // 期望输出: true
            "",          // 期望输出: true
            "(",         // 期望输出: false
            ")",         // 期望输出: false
            "(((",       // 期望输出: false
            ")))",       // 期望输出: false
            "({[]})",    // 期望输出: true
            "({[}])"     // 期望输出: false
        };
        
        for (String testCase : testCases) {
            boolean result = solution.isValid(testCase);
            System.out.println("输入: \"" + testCase + "\"");
            System.out.println("输出: " + result);
            System.out.println("---");
        }
    }
} 