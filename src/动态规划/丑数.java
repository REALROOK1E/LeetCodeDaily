package 动态规划;
/*
 * 给你一个整数 n ，请你找出并返回第 n 个 丑数 。
丑数 就是质因子只包含 2、3 和 5 的正整数。
用三个指针，每当被选中了，就后移一个
下一个丑数，就是前面所有丑数里面 *2*3*5 最小的那个
 */
public class 丑数 {

public static int nthUglyNumber(int n){
    int p2=0;
    int p3=0;
    int p5=0;
    int dp[] =new int [n];
    dp[0]=1;

for (int i = 1; i < n; i++) {
    int v2=dp[p2]*2;
    int v3=dp[p3]*3;
    int v5=dp[p5]*5;

    int ans = Math.min(v2,Math.min(v3,v5));

    if(ans==v2) p2++;
    if(ans==v3) p3++;
    if(ans==v5) p5++;
    dp[i]=ans;
}
  for (int i : dp) {
    System.out.println(i);
  }
    return dp[n-1];

}
   


public static void main(String[] args) {
    System.out.println(nthUglyNumber(5));
}

}
