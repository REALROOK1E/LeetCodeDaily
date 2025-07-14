import java.util.*;

/**
 * LeetCode 347 - 前K个高频元素
 * 
 * 题目描述：
 * 给你一个整数数组 nums 和一个整数 k ，请你返回其中出现频率前 k 高的元素。你可以按任意顺序返回答案。
 * 
 * 示例：
 * 输入: nums = [1,1,1,2,2,3], k = 2
 * 输出: [1,2]
 * 
 * 输入: nums = [1], k = 1
 * 输出: [1]
 * 
 * 提示：
 * 1 <= nums.length <= 10^5
 * k 的取值范围是 [1, 数组中不相同的元素的个数]
 * 题目数据保证答案唯一，换句话说，数组中前 k 个高频元素的集合是唯一的
 * 
 * 进阶：你所设计算法的时间复杂度必须优于 O(n log n) ，其中 n 是数组大小。
 */
public class LC347_前K个高频元素 {
    
    /**
     * 方法1：最小堆
     * 时间复杂度：O(n log k)
     * 空间复杂度：O(n)
     */
    public int[] topKFrequent(int[] nums, int k) {
        // TODO: 实现你的解法
        return new int[0];
    }
    
    /**
     * 方法2：桶排序
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     */
    public int[] topKFrequent2(int[] nums, int k) {
        // TODO: 实现你的解法
        return new int[0];
    }
    
    /**
     * 方法3：快速选择
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     */
    public int[] topKFrequent3(int[] nums, int k) {
        // TODO: 实现你的解法
        return new int[0];
    }
    
    public static void main(String[] args) {
        LC347_前K个高频元素 solution = new LC347_前K个高频元素();
        
        // 测试用例
        int[][] testCases = {
            {1, 1, 1, 2, 2, 3}, 2,           // 期望输出: [1,2]
            {1}, 1,                           // 期望输出: [1]
            {1, 1, 2, 2, 3, 3, 3}, 2,        // 期望输出: [3,1] 或 [3,2]
            {1, 2, 3, 4, 5}, 3,              // 期望输出: [1,2,3] 或任意三个元素
            {1, 1, 1, 2, 2, 3, 3, 3, 3}, 2   // 期望输出: [3,1]
        };
        
        for (int i = 0; i < testCases.length; i += 2) {
            int[] nums = testCases[i];
            int k = testCases[i + 1];
            int[] result = solution.topKFrequent(nums, k);
            System.out.println("测试用例 " + (i/2 + 1) + ":");
            System.out.println("输入: nums = " + Arrays.toString(nums) + ", k = " + k);
            System.out.println("输出: " + Arrays.toString(result));
            System.out.println("---");
        }
    }
} 