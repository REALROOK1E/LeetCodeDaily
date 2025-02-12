
import java.util.Stack;

/**
 * @author: ZeKai
 * @date: 2025/2/11
 * @description:
 **/
public class PolishNotation {

    public static int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();
        String l ="";
        String r ="";
        for (int i = 0; i < tokens.length; i++) {

            if(("+-*/".contains(tokens[i])))
                switch (tokens[i]){
                    case "+": stack.push(stack.pop() + stack.pop());break;
                    case "-":  int min = stack.pop();  // 弹出除数
                                int big = stack.pop(); // 弹出被除数
                             stack.push((int) (big-min));  break;
                    case "*": stack.push(stack.pop() * stack.pop());break;
                    case "/":
                        double divisor = stack.pop();  // 弹出除数
                        double dividend = stack.pop(); // 弹出被除数
                        stack.push((int) (dividend / divisor)); // 执行除法; break;
                }
            else  stack.push(Integer.parseInt(tokens[i]));
            System.out.println(stack);
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String[] strings= new String[] {"4","13","5","/","+"};

        evalRPN(strings);
    }
}
