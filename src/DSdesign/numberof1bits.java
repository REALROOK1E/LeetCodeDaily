package DSdesign;

/**
 * @author: ZeKai
 * @date: 2025/3/2
 * @description:
 **/
public class numberof1bits {
    public int hammingWeight(int n) {
     int res=0;
     while(n!=0){
         res+=(n&1);
         n>>=1;
     }
     return res;
    }
}
