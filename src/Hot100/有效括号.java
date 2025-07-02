package Hot100;

import java.util.HashMap;

public class 有效括号 {
    //给个字符串，判断是否是合法的括号序列
    public static boolean isValid(String s) {

        int[] c=new int[s.length()];
        int r=0;
        char[] ss=s.toCharArray();
        HashMap <Character,Character> map=new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');

        for (int i = 0; i < c.length; i++) {
            
            if(map.containsKey(s.charAt(i))){
                c[r++]=i;
            }else if (r>0&&map.get(ss[c[r-1]])==s.charAt(i)) r--;
            else return false;
        }

        return r==0;

}

public static void main(String[] args) {
    if(isValid("{(})"))
    System.out.println("__________________");
}

}