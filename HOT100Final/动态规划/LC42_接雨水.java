/**
 * LC42 - 接雨水
 * 难度：困难
 * 描述：
 * 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能够接多少雨水。
 */
import java.util.*;

public class LC42_接雨水 {

    /**
     * 方法：动态规划/双指针
     * @param height 高度数组
     * @return 能接的雨水量
     */
    public int trap(int[] height) {
        // 实现逻辑
        int max[] = new int[height.length];
        int lmax=0;
        int ans=0;
        max[0]=0;
      for (int i = 1; i < height.length; i++) {
        max[i] = lmax;
        if(height[i]>height[lmax]) lmax=i;
      }

      lmax=height.length-1;
      for(int i=height.length-1;i>=0;i--){
        if(Math.min(height[lmax], height[max[i]])>height[i])
         ans+=Math.min(height[lmax], height[max[i]])-height[i];
        if(height[i]>height[lmax]) lmax=i;
      }
        return ans;
    }

    public static void main(String[] args) {
        LC42_接雨水 solution = new LC42_接雨水();
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int result = solution.trap(height);
        System.out.println("结果: " + result);
    }
}
