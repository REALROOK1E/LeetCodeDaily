import java.util.*;

/**
 * LeetCode 75 - 颜色分类
 * 
 * 题目描述：
 * 给定一个包含红色、白色和蓝色、共 n 个元素的数组 nums ，原地对它们进行排序，
 * 使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
 * 
 * 我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
 * 
 * 必须在不使用库的sort函数的情况下解决这个问题。
 * 
 * 示例：
 * 输入: nums = [2,0,2,1,1,0]
 * 输出: [0,0,1,1,2,2]
 * 
 * 输入: nums = [2,0,1]
 * 输出: [0,1,2]
 * 
 * 提示：
 * n == nums.length
 * 1 <= n <= 300
 * nums[i] 为 0、1 或 2
 * 
 * 进阶：
 * 你能想出一个仅使用常数空间的一趟扫描算法吗？
 */
public class LC75_颜色分类 {
    
    /**
     * 方法1：三指针（荷兰国旗问题）
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     */
    public void sortColors(int[] nums) {
        // TODO: 实现你的解法
    }
    
    /**
     * 方法2：两次遍历
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     */
    public void sortColors2(int[] nums) {
        // TODO: 实现你的解法
    }
    
    /**
     * 方法3：计数排序
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     */
    public void sortColors3(int[] nums) {
        // TODO: 实现你的解法
    }
    
    /**
     * 方法4：快速排序思想
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     */
    public void sortColors4(int[] nums) {
        // TODO: 实现你的解法
    }
    
    public static void main(String[] args) {
        LC75_颜色分类 solution = new LC75_颜色分类();
        
        // 测试用例
        int[][] testCases = {
            {2, 0, 2, 1, 1, 0},           // 期望输出: [0,0,1,1,2,2]
            {2, 0, 1},                     // 期望输出: [0,1,2]
            {0},                           // 期望输出: [0]
            {1},                           // 期望输出: [1]
            {2},                           // 期望输出: [2]
            {0, 0, 0},                     // 期望输出: [0,0,0]
            {1, 1, 1},                     // 期望输出: [1,1,1]
            {2, 2, 2},                     // 期望输出: [2,2,2]
            {0, 1, 2},                     // 期望输出: [0,1,2]
            {2, 1, 0},                     // 期望输出: [0,1,2]
            {1, 0, 2, 1, 0, 2, 1, 0}      // 期望输出: [0,0,0,1,1,1,2,2]
        };
        
        for (int i = 0; i < testCases.length; i++) {
            int[] nums = testCases[i].clone(); // 克隆数组避免修改原数组
            System.out.println("测试用例 " + (i + 1) + ":");
            System.out.println("输入: " + Arrays.toString(testCases[i]));
            solution.sortColors(nums);
            System.out.println("输出: " + Arrays.toString(nums));
            System.out.println("---");
        }
    }
} 