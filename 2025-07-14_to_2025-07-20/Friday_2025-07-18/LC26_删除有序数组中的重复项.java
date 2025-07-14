import java.util.*;

/**
 * LeetCode 26 - 删除有序数组中的重复项
 * 
 * 题目描述：
 * 给你一个非严格递增排列的数组 nums ，请你原地删除重复出现的元素，使每个元素只出现一次 ，
 * 返回删除后数组的新长度。元素的相对顺序应该保持一致。然后返回 nums 中唯一元素的个数。
 * 
 * 考虑 nums 的唯一元素的数量为 k ，你需要做以下事情确保你的题解可以被通过：
 * 
 * 更改数组 nums ，使 nums 的前 k 个元素包含唯一元素，并按照它们最初在 nums 中出现的顺序排列。
 * nums 的其余元素与 nums 的大小不重要。
 * 返回 k 。
 * 
 * 示例：
 * 输入: nums = [1,1,2]
 * 输出: 2, nums = [1,2,_]
 * 解释: 函数应该返回新的长度 2 ，并且原数组 nums 的前两个元素被修改为 1, 2 。
 * 不需要考虑数组中超出新长度后面的元素。
 * 
 * 输入: nums = [0,0,1,1,1,2,2,3,3,4]
 * 输出: 5, nums = [0,1,2,3,4,_,_,_,_,_]
 * 解释: 函数应该返回新的长度 5 ， 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4 。
 * 不需要考虑数组中超出新长度后面的元素。
 * 
 * 提示：
 * 1 <= nums.length <= 3 * 10^4
 * -10^4 <= nums[i] <= 10^4
 * nums 已按非严格递增排列
 */
public class LC26_删除有序数组中的重复项 {
    
    /**
     * 方法1：双指针
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     */
    public int removeDuplicates(int[] nums) {
        // TODO: 实现你的解法
        return 0;
    }
    
    /**
     * 方法2：使用Set（不推荐，但可以理解）
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     */
    public int removeDuplicates2(int[] nums) {
        // TODO: 实现你的解法
        return 0;
    }
    
    /**
     * 方法3：暴力解法
     * 时间复杂度：O(n^2)
     * 空间复杂度：O(1)
     */
    public int removeDuplicates3(int[] nums) {
        // TODO: 实现你的解法
        return 0;
    }
    
    public static void main(String[] args) {
        LC26_删除有序数组中的重复项 solution = new LC26_删除有序数组中的重复项();
        
        // 测试用例
        int[][] testCases = {
            {1, 1, 2},                           // 期望输出: 2, [1,2]
            {0, 0, 1, 1, 1, 2, 2, 3, 3, 4},     // 期望输出: 5, [0,1,2,3,4]
            {1, 1, 1, 1},                        // 期望输出: 1, [1]
            {1, 2, 3, 4, 5},                     // 期望输出: 5, [1,2,3,4,5]
            {1},                                  // 期望输出: 1, [1]
            {},                                   // 期望输出: 0, []
            {1, 1, 2, 2, 3, 3, 4, 4},           // 期望输出: 4, [1,2,3,4]
            {1, 2, 2, 3, 3, 3, 4, 4, 4, 4}     // 期望输出: 4, [1,2,3,4]
        };
        
        for (int i = 0; i < testCases.length; i++) {
            int[] nums = testCases[i].clone(); // 克隆数组避免修改原数组
            System.out.println("测试用例 " + (i + 1) + ":");
            System.out.println("输入: " + Arrays.toString(testCases[i]));
            int result = solution.removeDuplicates(nums);
            System.out.println("输出: " + result + ", nums = " + Arrays.toString(nums));
            System.out.println("---");
        }
    }
} 