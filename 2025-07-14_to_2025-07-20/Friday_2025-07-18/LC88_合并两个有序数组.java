import java.util.*;

/**
 * LeetCode 88 - 合并两个有序数组
 * 
 * 题目描述：
 * 给你两个按非递减顺序排列的整数数组 nums1 和 nums2，另有两个整数 m 和 n ，
 * 分别表示 nums1 和 nums2 中的元素数目。
 * 
 * 请你合并 nums2 到 nums1 中，使合并后的数组同样按非递减顺序排列。
 * 
 * 注意：最终，合并后数组不应由函数返回，而是存储在数组 nums1 中。
 * 为了应对这种情况，nums1 的初始长度为 m + n，其中前 m 个元素表示应合并的元素，
 * 后 n 个元素为 0 ，应忽略。nums2 的长度为 n 。
 * 
 * 示例：
 * 输入: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * 输出: [1,2,2,3,5,6]
 * 解释: 需要合并 [1,2,3] 和 [2,5,6] 。
 * 合并结果是 [1,2,2,3,5,6] ，其中斜体加粗标注的为 nums1 中的元素。
 * 
 * 输入: nums1 = [1], m = 1, nums2 = [], n = 0
 * 输出: [1]
 * 解释: 需要合并 [1] 和 [] 。
 * 合并结果是 [1] 。
 * 
 * 输入: nums1 = [0], m = 0, nums2 = [1], n = 1
 * 输出: [1]
 * 解释: 需要合并的数组是 [] 和 [1] 。
 * 合并结果是 [1] 。
 * 注意，因为 m = 0 ，所以 nums1 中没有元素。nums1 中仅存的 0 仅仅是为了确保合并结果可以顺利存放到 nums1 中。
 * 
 * 提示：
 * nums1.length == m + n
 * nums2.length == n
 * 0 <= m, n <= 200
 * 1 <= m + n <= 200
 * -10^9 <= nums1[i], nums2[j] <= 10^9
 * 
 * 进阶：你可以设计实现一个时间复杂度为 O(m + n) 的算法解决此问题吗？
 */
public class LC88_合并两个有序数组 {
    
    /**
     * 方法1：从后往前合并
     * 时间复杂度：O(m + n)
     * 空间复杂度：O(1)
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // TODO: 实现你的解法
    }
    
    /**
     * 方法2：从前往后合并
     * 时间复杂度：O(m + n)
     * 空间复杂度：O(m)
     */
    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        // TODO: 实现你的解法
    }
    
    /**
     * 方法3：使用Arrays.sort（不推荐，但可以理解）
     * 时间复杂度：O((m+n) log(m+n))
     * 空间复杂度：O(1)
     */
    public void merge3(int[] nums1, int m, int[] nums2, int n) {
        // TODO: 实现你的解法
    }
    
    public static void main(String[] args) {
        LC88_合并两个有序数组 solution = new LC88_合并两个有序数组();
        
        // 测试用例
        int[][][] testCases = {
            {{1, 2, 3, 0, 0, 0}, {3}, {2, 5, 6}, {3}},     // 期望输出: [1,2,2,3,5,6]
            {{1}, {1}, {}, {0}},                             // 期望输出: [1]
            {{0}, {0}, {1}, {1}},                           // 期望输出: [1]
            {{1, 2, 3, 0, 0, 0}, {3}, {4, 5, 6}, {3}},     // 期望输出: [1,2,3,4,5,6]
            {{4, 5, 6, 0, 0, 0}, {3}, {1, 2, 3}, {3}},     // 期望输出: [1,2,3,4,5,6]
            {{1, 3, 5, 0, 0, 0}, {3}, {2, 4, 6}, {3}},     // 期望输出: [1,2,3,4,5,6]
            {{1, 2, 3, 4, 5, 0}, {5}, {6}, {1}},           // 期望输出: [1,2,3,4,5,6]
            {{1, 0}, {1}, {2}, {1}}                         // 期望输出: [1,2]
        };
        
        for (int i = 0; i < testCases.length; i++) {
            int[] nums1 = testCases[i][0].clone();
            int m = testCases[i][1][0];
            int[] nums2 = testCases[i][2];
            int n = testCases[i][3][0];
            
            System.out.println("测试用例 " + (i + 1) + ":");
            System.out.println("输入: nums1 = " + Arrays.toString(testCases[i][0]) + 
                             ", m = " + m + ", nums2 = " + Arrays.toString(nums2) + 
                             ", n = " + n);
            solution.merge(nums1, m, nums2, n);
            System.out.println("输出: " + Arrays.toString(nums1));
            System.out.println("---");
        }
    }
} 