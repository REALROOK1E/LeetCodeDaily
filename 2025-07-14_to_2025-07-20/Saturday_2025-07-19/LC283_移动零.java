import java.util.*;

/**
 * LeetCode 283 - 移动零
 * 
 * 题目描述：
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * 
 * 请注意，必须在不复制数组的情况下原地对数组进行操作。
 * 
 * 示例：
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * 
 * 输入: [1]
 * 输出: [1]
 * 
 * 说明：
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 */
public class LC283_移动零 {
    
    /**
     * 方法1：双指针
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     */
    public void moveZeroes(int[] nums) {
        // TODO: 实现你的解法
    }
    
    /**
     * 方法2：两次遍历
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     */
    public void moveZeroes2(int[] nums) {
        // TODO: 实现你的解法
    }
    
    /**
     * 方法3：使用额外数组（不符合要求，但可以理解）
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     */
    public void moveZeroes3(int[] nums) {
        // TODO: 实现你的解法
    }
    
    /**
     * 方法4：冒泡排序思想
     * 时间复杂度：O(n^2)
     * 空间复杂度：O(1)
     */
    public void moveZeroes4(int[] nums) {
        // TODO: 实现你的解法
    }
    
    public static void main(String[] args) {
        LC283_移动零 solution = new LC283_移动零();
        
        // 测试用例
        int[][] testCases = {
            {0, 1, 0, 3, 12},           // 期望输出: [1,3,12,0,0]
            {1},                         // 期望输出: [1]
            {0},                         // 期望输出: [0]
            {1, 0},                     // 期望输出: [1,0]
            {0, 1},                     // 期望输出: [1,0]
            {1, 2, 3, 4, 5},           // 期望输出: [1,2,3,4,5]
            {0, 0, 0, 0, 0},           // 期望输出: [0,0,0,0,0]
            {1, 2, 0, 0, 3, 4, 0, 5},  // 期望输出: [1,2,3,4,5,0,0,0]
            {0, 0, 0, 1, 2, 3},        // 期望输出: [1,2,3,0,0,0]
            {1, 0, 2, 0, 3, 0, 4},     // 期望输出: [1,2,3,4,0,0,0]
            {0, 1, 0, 2, 0, 3, 0, 4, 0, 5} // 期望输出: [1,2,3,4,5,0,0,0,0,0]
        };
        
        for (int i = 0; i < testCases.length; i++) {
            int[] nums = testCases[i].clone(); // 克隆数组避免修改原数组
            System.out.println("测试用例 " + (i + 1) + ":");
            System.out.println("输入: " + Arrays.toString(testCases[i]));
            solution.moveZeroes(nums);
            System.out.println("输出: " + Arrays.toString(nums));
            System.out.println("---");
        }
    }
} 