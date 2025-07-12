package 动态规划;
/*
 * 给你一个整数 n ，请你找出并返回第 n 个 丑数 。
丑数 就是质因子只包含 2、3 和 5 的正整数。
用三个指针，每当被选中了，就后移一个
下一个丑数，就是前面所有丑数里面 *2*3*5 最小的那个
 */
public class 丑数 {


        public static int nthUglyNumber(int n) {
         int [] dp =new int[n+1];
        int p2=0,p3=0,p5=0;
        dp[0]=1;
        for (int i =1; i < n+1 ; i++) {
            int v2=dp[p2]*2;
            int v3=dp[p3]*3;
            int v5=dp[p5]*5;

            int val=Math.min(Math.min(v2,v3),v5);
            dp[i]=val;

            if(v2==val) p2++;          
            if(v3==val) p3++;          
            if(v5==val) p5++;     
        }

         return dp[n-1];
    }
   
public static void main(String[] args) {
    System.out.println(nthUglyNumber(5));
}

}
