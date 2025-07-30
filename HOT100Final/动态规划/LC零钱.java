import java.util.Arrays;


class LC零钱 {
    public static int coinChange(int[] coins, int amount) {
        
        int [] dp=new int[amount+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        for(int i=1;i<dp.length;i++){
        for(int j=0;j<coins.length;j++){
            if(i-coins[j]>=0)
          dp[i]=Math.min(dp[i],dp[i-coins[j]]+1);
        }
    }
    return dp[amount]==Integer.MAX_VALUE?-1:dp[amount];
    }


    public static void main(String[] args) {
       System.out.println(coinChange(new int[] {1,2,5}, 11));
    }
}