/**
 * LC20 - 有效的括号
 * 难度：简单
 * 描述：
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 * 有效字符串需满足：
 * 1. 左括号必须用相同类型的右括号闭合。
 * 2. 左括号必须以正确的顺序闭合。
 */
public class LC20_有效的括号 {

    /**
     * 方法：栈
     * @param s 输入字符串
     * @return 是否有效
     */
    public boolean isValid(String s) {
        // 实现逻辑
        return false;
    }

    public static void main(String[] args) {
        LC20_有效的括号 solution = new LC20_有效的括号();
        String s = "()[]{}";
        boolean result = solution.isValid(s);
        System.out.println("结果: " + result);
    }
}
