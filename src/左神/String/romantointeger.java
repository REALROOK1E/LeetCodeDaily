package 左神.String;

import java.util.HashMap;

/**
 * @author: ZeKai
 * @date: 2025/2/17
 * @description:
 **/
public class romantointeger {

        public static int romanToInt(String s) {
            HashMap<Character,Integer> map=new HashMap<Character,Integer>();
            map.put('I',1);
            map.put('V',5);
            map.put('X',10);
            map.put('L',50);
            map.put('C',100);
            map.put('D',500);
            map.put('M',1000);
            Integer res=0;
            char[] c=s.toCharArray();
            int max=map.get(c[0]);
            for(int i=0;i<c.length-1;i++)
            {
                int cur=map.get(c[i]);
                int next=map.get(c[i+1]);
                if(next>cur)
                    res-=cur;
                else
                    res+=cur;
            }
            res+=map.get(c[c.length-1]);

            return res;

    }

    public static void main(String[] args) {
        romanToInt("MCMXCIV");
    }
}
