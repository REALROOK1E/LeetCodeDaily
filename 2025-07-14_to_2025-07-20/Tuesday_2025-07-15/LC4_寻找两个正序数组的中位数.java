/**
 * LeetCode 4 - 寻找两个正序数组的中位数
 * 
 * 题目描述：
 * 给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的中位数。
 * 算法的时间复杂度应该为 O(log (m+n)) 。
 * 
 * 示例：
 * 输入: nums1 = [1,3], nums2 = [2]
 * 输出: 2.00000
 * 解释: 合并数组 = [1,2,3] ，中位数 2
 * 
 * 输入: nums1 = [1,2], nums2 = [3,4]
 * 输出: 2.50000
 * 解释: 合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5
 * 
 * 提示：
 * nums1.length == m
 * nums2.length == n
 * 0 <= m <= 1000
 * 0 <= n <= 1000
 * 1 <= m + n <= 2000
 * -10^6 <= nums1[i], nums2[i] <= 10^6
 */
public class LC4_寻找两个正序数组的中位数 {
    
    /**
     * 方法1：二分查找
     * 时间复杂度：O(log(min(m,n)))
     * 空间复杂度：O(1)
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // TODO: 实现你的解法
        return 0.0;
    }
    
    /**
     * 方法2：合并数组
     * 时间复杂度：O(m+n)
     * 空间复杂度：O(m+n)
     */
    public double findMedianSortedArrays2(int[] nums1, int[] nums2) {
        // TODO: 实现你的解法
        return 0.0;
    }
    
    /**
     * 方法3：双指针
     * 时间复杂度：O(m+n)
     * 空间复杂度：O(1)
     */
    public double findMedianSortedArrays3(int[] nums1, int[] nums2) {
        // TODO: 实现你的解法
        return 0.0;
    }
    
    public static void main(String[] args) {
        LC4_寻找两个正序数组的中位数 solution = new LC4_寻找两个正序数组的中位数();
        
        // 测试用例
        int[][] testCases = {
            {1, 3}, {2},           // 期望输出: 2.0
            {1, 2}, {3, 4},        // 期望输出: 2.5
            {0, 0}, {0, 0},        // 期望输出: 0.0
            {}, {1},               // 期望输出: 1.0
            {2}, {},               // 期望输出: 2.0
            {1, 2, 3}, {4, 5, 6}  // 期望输出: 3.5
        };
        
        for (int i = 0; i < testCases.length; i += 2) {
            int[] nums1 = testCases[i];
            int[] nums2 = testCases[i + 1];
            double result = solution.findMedianSortedArrays(nums1, nums2);
            System.out.println("测试用例 " + (i/2 + 1) + ":");
            System.out.println("输入: nums1 = " + java.util.Arrays.toString(nums1) + 
                             ", nums2 = " + java.util.Arrays.toString(nums2));
            System.out.println("输出: " + result);
            System.out.println("---");
        }
    }
} 