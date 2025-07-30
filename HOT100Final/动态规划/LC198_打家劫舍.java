/**
 * LC198 - 打家劫舍
 * 难度：中等
 * 描述：
 * 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，
 * 如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你 不触动警报装置的情况下 ，一夜之内能够偷窃到的最高金额。
 */
import java.util.*;

public class LC198_打家劫舍 {

    /**
     * 方法：动态规划
     * @param nums 房屋金额数组
     * @return 最高金额
     */
  public int rob(int[] nums) {
        //r如果偷最后一间，就不能偷倒数第二间，本质上就是最后一间的价值加上前n-2的最大价值。
        //如果不偷最后一间，那么就是n-1的最大价值。
        //对于每一间都是这样。OK
        int [] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return f1(nums,nums.length-1,dp);
    }

    public int f1(int[] nums,int n,int [] dp){
            if(n==0) return nums[0];
            if(n==1) return Math.max(nums[0],nums[1]);
            if(dp[n]!=-1) return dp[n];
            dp[n]=Math.max((nums[n]+f1(nums,n-2,dp)),f1(nums,n-1,dp));
            return dp[n];
    }
    public static void main(String[] args) {
        LC198_打家劫舍 solution = new LC198_打家劫舍();
        int[] nums = {2, 7, 9, 3, 1};
        int result = solution.rob(nums);
        System.out.println("结果: " + result);
    }
}
