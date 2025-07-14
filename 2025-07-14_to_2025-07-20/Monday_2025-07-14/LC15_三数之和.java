import java.util.*;

/**
 * LeetCode 15 - 三数之和
 * 
 * 题目描述：
 * 给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]] 
 * 满足 i != j、i != k 且 j != k ，同时还满足 nums[i] + nums[j] + nums[k] == 0 。
 * 请你返回所有和为 0 且不重复的三元组。
 * 
 * 注意：答案中不可以包含重复的三元组。
 * 
 * 示例：
 * 输入: nums = [-1,0,1,2,-1,-4]
 * 输出: [[-1,-1,2],[-1,0,1]]
 * 解释: 
 * nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0 。
 * nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0 。
 * nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0 。
 * 不同的三元组是 [-1,0,1] 和 [-1,-1,2] 。
 * 注意，输出的顺序和三元组的顺序并不重要。
 * 
 * 输入: nums = []
 * 输出: []
 * 
 * 输入: nums = [0]
 * 输出: []
 * 
 * 提示：
 * 3 <= nums.length <= 3000
 * -10^5 <= nums[i] <= 10^5
 */
public class LC15_三数之和 {
    
    /**
     * 方法1：排序 + 双指针
     * 时间复杂度：O(n^2)
     * 空间复杂度：O(log n)，排序所需空间
     */
    public List<List<Integer>> threeSum(int[] nums) {
        // TODO: 实现你的解法
        return new ArrayList<>();
    }
    
    /**
     * 方法2：使用HashSet去重
     * 时间复杂度：O(n^2)
     * 空间复杂度：O(n)
     */
    public List<List<Integer>> threeSum2(int[] nums) {
        // TODO: 实现你的解法
        return new ArrayList<>();
    }
    
    /**
     * 方法3：优化版本，减少重复计算
     * 时间复杂度：O(n^2)
     * 空间复杂度：O(log n)
     */
    public List<List<Integer>> threeSum3(int[] nums) {
        // TODO: 实现你的解法
        return new ArrayList<>();
    }
    
    public static void main(String[] args) {
        LC15_三数之和 solution = new LC15_三数之和();
        
        // 测试用例
        int[][] testCases = {
            {-1, 0, 1, 2, -1, -4},  // 期望输出: [[-1,-1,2],[-1,0,1]]
            {},                       // 期望输出: []
            {0},                     // 期望输出: []
            {0, 0, 0},              // 期望输出: [[0,0,0]]
            {1, 2, -2, -1},         // 期望输出: []
            {-2, 0, 1, 1, 2},       // 期望输出: [[-2,0,2],[-2,1,1]]
            {3, 0, -2, -1, 1, 2}    // 期望输出: [[-2,-1,3],[-2,0,2],[-1,0,1]]
        };
        
        for (int i = 0; i < testCases.length; i++) {
            int[] nums = testCases[i];
            List<List<Integer>> result = solution.threeSum(nums);
            System.out.println("测试用例 " + (i + 1) + ":");
            System.out.println("输入: " + Arrays.toString(nums));
            System.out.println("输出: " + result);
            System.out.println("---");
        }
    }
} 