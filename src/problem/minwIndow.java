/**
 * @author: ZeKai
 * @date: 2025/2/10
 * @description:
 **/
package problem;

import java.util.HashMap;
import java.util.Objects;

class minwIndow {

    public static String minWindow(String s, String t) {

        int l=0,r=0;
        char[] c=s.toCharArray();
        int [] count=new int[256];
        int length=999999;
        int num=0;//map中满足条件的字符数
        HashMap<Character,Integer> tmap=new HashMap<>();
        for(char cc:t.toCharArray()){
            tmap.put(cc,tmap.getOrDefault(cc,0)+1);
        }//tmap is ready
        HashMap<Character,Integer> smap=new HashMap<>();
        for(r=0;r<c.length;r++){
            Character ch=c[r];
            smap.put(c[r],smap.getOrDefault(c[r],0)+1);
            System.out.println("Smap="+smap);
            if(tmap.containsKey(ch)&& Objects.equals(smap.get(ch), tmap.get(ch))){
                //当前字符满足条件了
                num++;
            }
            while (num == tmap.size()) {
                // 因为满足了，不知道是不是最佳，所以先更新最小窗口
                if (length > r - l + 1) {
                    length = r - l + 1;
                    count[0] = l;
                    count[1] = r;
                }

                // 移动左边界
                char leftChar = s.charAt(l);
                smap.put(leftChar, smap.get(leftChar) - 1);

                // 如果移除的字符是 t 中的字符，并且数量不匹配，则减少 num
                //后方意识：map里面的东西都没动，只有当前的有变化，比较当前的即可
                if (tmap.containsKey(leftChar) ){
                    if (smap.get(leftChar) < tmap.get(leftChar)) {
                        num--;
                    }
                }

                l++;
            }

        }
        if(length==999999) return  "";//一定要记得，没有被找到时候怎么办，你的更新条件一直没有触发怎么办#大局观#顶级理解#opdd
        StringBuilder sb=new StringBuilder();
        l=count[0];
        r=count[1];

        for(;l!=r+1; l++){
            sb.append(c[l]);
        };

        return sb.toString();
    }

    public static void main(String[] args) {
        String S=minWindow("as","k");
        System.out.println(S);
    }
}