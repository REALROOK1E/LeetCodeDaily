package slidingwindow;

import java.util.Arrays;

/**
 * @author: ZeKai
 * @date: 2025/2/24
 * @description:
 **/
class minWindowSUB {
    public static String minWindow(String s, String t) {
        if(t.length()>s.length()) return "";
        if(t.length()==s.length()&&t.equals(s)) return s;
            char[] s1=s.toCharArray();
            char[] t1=t.toCharArray();

        int [] count=new int[256];
        int length=Integer.MAX_VALUE;

        //把t的字符进入到里面 然后学着怎么用一个数组表示map
        //index对应字符，值对应出现次数

        for(char c:t1){
            count[c]--;
        }
        int restart=0;
        int debt=t.length();

        //用一个数字去记录欠债，不要死脑筋每次都要算总和，怎么可能
       //每次记录答案后开始准备缩一下，还有更新答案的时刻
        for(int l=0, r=0;r<s.length();r++){
            if(count[s1[r]]++<0) debt--;
            if(debt==0){
                while(count[s1[l]]>0){

                    count[s1[l]]--;
                    l++;
                }
                if(r-l+1<length){
                    length=r-l+1;
                    restart=l;
                }
            }

    }


 return length==Integer.MAX_VALUE?"":s.substring(restart,restart+length);


}

    public static void main(String[] args) {
        System.out.println(minWindow("ADCEBANC","ABC"));
    }
}
