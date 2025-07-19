import java.util.*;

/**
 * LeetCode 42 - 接雨水
 * 
 * 题目描述：
 * 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
 * 
 * 示例：
 * 输入: height = [0,1,0,2,1,0,1,3,2,1,2,1]
 * 输出: 6
 * 解释: 上面是由数组 [0,1,0,2,1,0,1,3,2,1,2,1] 表示的高度图，
 * 在这种情况下，可以接 6 个单位的雨水（蓝色部分表示雨水）。
 * 
 * 输入: height = [4,2,0,3,2,5]
 * 输出: 9
 * 
 * 提示：
 * n == height.length
 * 1 <= n <= 2 * 10^4
 * 0 <= height[i] <= 10^5
 */
public class LC42_接雨水 {
    

    
    /**
     * 方法2：双指针预处理
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     */
    public static int trap(int[] height) {
        //两侧最大值的最小值*它和当前的高度差
        int lmax=0;
        int[] max=new int[height.length];
        int ans=0;
        for (int i = 0; i < height.length; i++) {
            max[i]=lmax;
            if(height[i]>height[lmax]) lmax=i;        
        }
        int rmax=height.length-1;

     for (int r = height.length-2; r >0; r--){
        int min=Math.min(height[max[r]], height[rmax]);
        ans+=min>height[r]?(min-height[r]):0;
        if(height[r]>height[rmax]) rmax=r;     
     }
        return ans;
    }
    
    public static int trap2(int[] height) {
        //两侧最大值的最小值*它和当前的高度差
        int lmax=0;
        int[] max=new int[height.length];
        int ans=0;
        for (int i = 0; i < height.length; i++) {
            max[i]=lmax;
            if(height[i]>height[lmax]) lmax=i;        
        }
        int rmax=height.length-1;

     for (int r = height.length-2; r >0; r--){
        int min=Math.min(height[max[r]], height[rmax]);
        ans+=min>height[r]?(min-height[r]):0;
        if(height[r]>height[rmax]) rmax=r;     
     }
        return ans;
    }
    
    
    public static void main(String[] args) {
        LC42_接雨水 solution = new LC42_接雨水();
        
        // 测试用例
        int[][] testCases = {
            {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1},  // 期望输出: 6
            {4, 2, 0, 3, 2, 5},                       // 期望输出: 9
            {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1},   // 期望输出: 6
            {4, 2, 3},                                 // 期望输出: 1
            {5, 4, 1, 2},                             // 期望输出: 1
            {1, 0, 1},                                // 期望输出: 1
            {1, 2, 3, 4, 5},                          // 期望输出: 0
            {5, 4, 3, 2, 1},                          // 期望输出: 0
            {1},                                       // 期望输出: 0
            {1, 2, 1},                                // 期望输出: 0
            {3, 0, 0, 2, 0, 4},                       // 期望输出: 10
            {0, 2, 0}                                 // 期望输出: 0
        };
        
        for (int i = 0; i < testCases.length; i++) {
            int[] height = testCases[i];
            int result =trap(height);
            System.out.println("测试用例 " + (i + 1) + ":");
            System.out.println("输入: " + Arrays.toString(height));
            System.out.println("输出: " + result);
            System.out.println("---");
        }
    }
} 