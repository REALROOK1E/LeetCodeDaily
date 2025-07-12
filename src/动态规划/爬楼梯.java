package 动态规划;

import java.util.Arrays;

public class 爬楼梯 {
    
       public int climbStairs(int n) {
        int [] dp= new int[n+1];
          Arrays.fill(dp,-1);
        return f1(dp,n);
    }

    public int f1(int[] dp,int i){
        /*
         * 从i往后有多少种方法
         */
        if(i==0) return 1;
        if(i==1) return 1;
        if(dp[i]!=-1) return dp[i];//命中

        //没有命中
        int ans = f1(dp,i-1)+f1(dp,i-2);
        dp[i] = ans;
        return ans;

    }
}
