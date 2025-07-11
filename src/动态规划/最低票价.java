package 动态规划;

public class 最低票价 {


public static int[] durations= {1,7,30};
public static int[] dp= new int[366];
public int f1(int[] days, int[] costs,int n){
  /*
     * 这个f1：从第n天开始的后面，最少花多少
     * basecase：最后一天了
     */
    if(n==days.length) return 0;
    int ans=Integer.MAX_VALUE;

    for (int i = 0,j=n; i < 3; i++) {
        //k是一个往前找的数，一直找到票覆盖的天数不够了的时候才停
        while(j<days.length&&days[i]+durations[j]>days[j]){
            j++;
            //j到了覆盖截止那天就停了，所以下次迭代从j开始
        }
        ans=Math.min(ans, f1(days, costs, j));
     
    }

     return ans;
}

public static int f2(int[] days, int[] costs,int n,int[] dp){
    /*
       * 这个f1：从第n天开始的后面，最少花多少
       * basecase：最后一天了
       */
      if(n==days.length) return 0;
  
    if(dp[n]!=Integer.MAX_VALUE)  return dp[n];
    
      int ans=Integer.MAX_VALUE;
  
      for (int i = 0,j=n; i < 3; i++) {
          //k是一个往前找的数，一直找到票覆盖的天数不够了的时候才停
  
          while(j<days.length&&days[n]+durations[i]>days[j]){
              j++;
              //j到了覆盖截止那天就停了，所以下次迭代从j开始
          }
          
          ans=Math.min(ans, costs[i]+f2(days, costs, j,dp));
      }
      dp[n]=ans;
       return ans;
  }
  public static int[] durations= {1,7,30};

  public int mincostTickets(int[] days, int[] costs) {
      //暴力递归
    
      int[] dp= new int[366];

      for(int i:dp){
          i=Integer.MAX_VALUE;
      }
    return  f2(days,costs,0,dp);
  }


}
