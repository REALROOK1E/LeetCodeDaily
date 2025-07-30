/**
 * LC150 - 逆波兰表达式求值
 * 难度：中等
 * 描述：
 * 根据 逆波兰表示法，求表达式的值。
 * 有效的算符包括 +、-、*、/ 。每个运算对象可以是整数，也可以是另一个逆波兰表达式。
 * 注意：两个整数之间的除法只保留整数部分。
 * 可以保证给定的逆波兰表达式总是有效的。换句话说，表达式总会得出有效数值且不存在除数为 0 的情况。
 */
import java.util.*;

public class LC150_逆波兰表达式求值 {

    /**
     * 方法：栈
     * @param tokens 逆波兰表达式数组
     * @return 表达式的值
     */
    public int evalRPN(String[] tokens) {
        // 实现逻辑
        return 0;
    }

    public static void main(String[] args) {
        LC150_逆波兰表达式求值 solution = new LC150_逆波兰表达式求值();
        String[] tokens = {"2", "1", "+", "3", "*"};
        int result = solution.evalRPN(tokens);
        System.out.println("结果: " + result);
    }
}
