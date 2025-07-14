import java.util.*;

/**
 * LeetCode 80 - 删除有序数组中的重复项II
 * 
 * 题目描述：
 * 给你一个有序数组 nums ，请你原地删除重复出现的元素，使每个元素最多出现两次 ，
 * 返回删除后数组的新长度。
 * 
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 * 
 * 说明：
 * 为什么返回数值是整数，但输出的答案是数组呢？
 * 请注意，输入数组是以「引用」方式传递的，这意味着在函数里修改输入数组对于调用者是可见的。
 * 
 * 你可以想象内部操作如下:
 * // nums 是以"引用"方式传递的。也就是说，不对实参做任何拷贝
 * int len = removeDuplicates(nums);
 * 
 * // 在函数里修改输入数组对于调用者是可见的。
 * // 根据你的函数返回的长度, 它会打印出数组中该长度范围内的所有元素。
 * for (int i = 0; i < len; i++) {
 *     print(nums[i]);
 * }
 * 
 * 示例：
 * 输入: nums = [1,1,1,2,2,3]
 * 输出: 5, nums = [1,1,2,2,3,_]
 * 解释: 函数应返回新长度 length = 5, 并且原数组的前五个元素被修改为 1, 1, 2, 2, 3 。
 * 不需要考虑数组中超出新长度后面的元素。
 * 
 * 输入: nums = [0,0,1,1,1,1,2,3,3]
 * 输出: 7, nums = [0,0,1,1,2,3,3,_,_]
 * 解释: 函数应返回新长度 length = 7, 并且原数组的前五个元素被修改为 0, 0, 1, 1, 2, 3, 3 。
 * 不需要考虑数组中超出新长度后面的元素。
 * 
 * 提示：
 * 1 <= nums.length <= 3 * 10^4
 * -10^4 <= nums[i] <= 10^4
 * nums 已按非严格递增排列
 */
public class LC80_删除有序数组中的重复项II {
    
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
     * 方法2：通用解法（最多保留k个）
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     */
    public int removeDuplicates2(int[] nums) {
        // TODO: 实现你的解法
        return 0;
    }
    
    /**
     * 方法3：计数法
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     */
    public int removeDuplicates3(int[] nums) {
        // TODO: 实现你的解法
        return 0;
    }
    
    public static void main(String[] args) {
        LC80_删除有序数组中的重复项II solution = new LC80_删除有序数组中的重复项II();
        
        // 测试用例
        int[][] testCases = {
            {1, 1, 1, 2, 2, 3},                 // 期望输出: 5, [1,1,2,2,3]
            {0, 0, 1, 1, 1, 1, 2, 3, 3},        // 期望输出: 7, [0,0,1,1,2,3,3]
            {1, 1, 1, 1},                        // 期望输出: 2, [1,1]
            {1, 2, 3, 4, 5},                     // 期望输出: 5, [1,2,3,4,5]
            {1},                                  // 期望输出: 1, [1]
            {1, 1, 2, 2, 3, 3},                 // 期望输出: 6, [1,1,2,2,3,3]
            {1, 1, 1, 2, 2, 2, 3, 3, 3},        // 期望输出: 6, [1,1,2,2,3,3]
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}     // 期望输出: 2, [0,0]
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