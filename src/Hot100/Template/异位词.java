package Hot100.Template;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 异位词 {
    public static List<Integer> findAnagrams(String s, String p) {
        
        char[] d = p.toCharArray();
        Arrays.sort(d);
        String s1=new String(d);
        List<Integer> ans=new ArrayList<>();
        
        for (int i = 0; i <=s.length()-p.length(); i++) {
            char[] c = s.substring(i,i+p.length()).toCharArray();
            Arrays.sort(c);
            String s2=new String(c);
            if(s2.equals(s1)) ans.add(i);
        }

        System.out.println(ans);
return ans;




    }

    public static void main(String[] args) {
        findAnagrams("abab","ab");
    }
}
