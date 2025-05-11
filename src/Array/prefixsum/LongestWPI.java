package Array.prefixsum;

import java.util.HashMap;

/**
 * @author: ZeKai
 * @date: 2025/2/27
 * @description:
 **/
public class LongestWPI {

        public static int longestWPI(int[] hours) {
            /*求一个最长的严格数组的长度，这个严格数组用num>0去判断
            从头加，如果加到最后num>0那最好，直接i就是最长的位置
            但如果出现num<0，就要找了，答案有可能是在中间部分。
            比如在某一点i的num为-2，那么一定有一点j从0-i，而且他的num是-1，由此可以得到从i-j的长度
            num=0在-1位置出现。map存的事num，index，算index就知道长度了
            这个好巧妙啊，我想想怎么描述。。。。
             */
     int num=0;
     int ans=0;
     int i=0;
            HashMap<Integer,Integer> map=new HashMap<>();
            for (; i < hours.length; i++) {
                if(hours[i]>8) {num++;}
                else {num--;}

                if(num>0) {ans=Math.max(ans,i+1);}
                else {
                    if(map.containsKey(num-1)){
                        ans=Math.max(ans,i-map.get(num-1));
                    }
                }
                if(!map.containsKey(num))map.put(num,i);
            }

            return ans;
        }

    public static void main(String[] args) {
        longestWPI(new int[]{6,6,9,10,16,1,1,10,0});
    }
}
