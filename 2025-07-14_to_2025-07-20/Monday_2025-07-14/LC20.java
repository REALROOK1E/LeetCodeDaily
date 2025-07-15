import java.util.*;

public class LC20 {
    public  boolean isValid(String s) {
        char[] c=s.toCharArray();
        HashMap <Character,Character> map=new HashMap<>();
        char[] stack=new char[s.length()];
        int r=0;
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        for (int i = 0; i < c.length; i++) {
            if(r>0&&map.get(c[i])==stack[r-1]){
                r--;
            }else{
                stack[r++]=c[i];
            }
        }

        return r==0;
    }
    
    public static void main(String[] args) {
        LC20 solution = new LC20();
        
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