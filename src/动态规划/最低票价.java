package 动态规划;

public class 最低票价 {
/*
 * 
你要旅行的日子将以一个名为 days 的数组给出。每一项是一个从 1 到 365 的整数。
火车票有 三种不同的销售方式 ：
一张 为期一天 的通行证售价为 costs[0] 美元；
一张 为期七天 的通行证售价为 costs[1] 美元；
一张 为期三十天 的通行证售价为 costs[2] 美元。
输入：days = [1,4,6,7,8,20], costs = [2,7,15]
通行证允许数天无限制的旅行。 
例如，如果我们在第 2 天获得一张 为期 7 天 的通行证，那么我们可以连着旅行 7 天：
第 2 天、第 3 天、第 4 天、第 5 天、第 6 天、第 7 天和第 8 天。
返回 你想要完成在给定的列表 days 中列出的每一天的旅行所需要的最低消费 。
 
 */

public static int[] durations= {1,7,30};
public static int[] dp= new int[366];

public static int f234(int days[],int costs[],int n,int[] dp){
//1. 为了算 “从n天开始，剩余的天数的最佳花钱计划”
if(n==days.length) return 0;//最后一天 不花钱 这里错了
int ans=Integer.MAX_VALUE;//为了更新答案
if(dp[n]!=ans) return dp[n]; //说明已经算过了，命中缓存直接返回
for (int i = 0,j=n; i < durations.length; i++) {
  while(j<days.length&&days[j]<durations[i]+days[n]){
          j++;
  }
  ans=Math.min(ans,costs[i]+f234(days,costs,j,dp));
}
  ans=dp[n];
  return ans;
}



















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
            j++; //j到了覆盖截止那天就停了，所以下次迭代从j开始
        }
        ans=Math.min(ans, f1(days, costs, j));
    }
     return ans;
}

public static int f2(int[] days, int[] costs,int n,int[] dp){
  /*“计算从第 n 个旅行日开始，覆盖所有剩余旅行日所需的最小总花费。”
 */
    if(n==days.length) return 0;
    if(dp[n]!=Integer.MAX_VALUE)  return dp[n];
    int ans=Integer.MAX_VALUE;
    
      for (int i = 0,j=n; i < 3; i++) {
          //k是一个往前找的数，一直找到票覆盖的天数不够了的时候才停
  
          while(j<days.length&&days[n]+durations[i]>days[j]){
              j++;
              /*
              j到了覆盖截止那天就停了，所以下次迭代从j开始
              实际上每种情况都要算，j不回退（为啥？因为days是递增的，买更长的票覆盖时间肯定比短的票要更久
              ）
              j最后停到，票覆盖不到的时间
              */
          }
          ans=Math.min(ans, costs[i]+f2(days, costs, j,dp));
          //我要买的票cost[i]+买完了之后，有效期过了以后->最后一天的钱，对吗
      }
      dp[n]=ans;
      return ans;
  }


  public int mincostTickets(int[] days, int[] costs) {
      //暴力递归
    
      int[] dp= new int[366];

      for(int i:dp){
          i=Integer.MAX_VALUE;
      }
    return  f2(days,costs,0,dp);
  }


}
