package Hot100;

import java.util.HashMap;
import java.util.HashSet;

public class 最长子串 {
    public static int lengthOfLongestSubstring(String s) {
        if(s.length()<=1) return s.length();
        int l=0;
        int r=0;
        char[] c=s.toCharArray();
        int len=0;
        int ans=0;
        HashSet<Character> set=new HashSet<>();
        for (int i = 0; i < c.length; i++) {
            while(!set.contains(c[r])) {
                len++;
                set.add(c[r]);
                r++; 
                if(r==c.length) break;
            }
            ans=Math.max(ans,len);
            if(r==c.length) break;
            while(set.contains(c[r])){
                set.remove(c[l++]);
                len--;
            }
   }
         System.out.println(ans);
     return ans;
    }
    public static int lengthOfLongestSubstring2(String s) {
        int n = s.length();
        HashSet<Character> set = new HashSet<>();
        int ans = 0, l = 0, r = 0;
        while (r < n) {
            if (!set.contains(s.charAt(r))) {
                set.add(s.charAt(r));
                r++;
                ans = Math.max(ans, r - l);
            } else {
                set.remove(s.charAt(l));
                l++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        lengthOfLongestSubstring("au");
    }
}
