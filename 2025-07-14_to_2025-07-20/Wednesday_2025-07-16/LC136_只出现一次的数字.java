/**
 * LeetCode 136 - 只出现一次的数字
 * 
 * 题目描述：
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * 
 * 说明：
 * 你的算法应该具有线性时间复杂度。你可以不使用额外空间来实现吗？
 * 
 * 示例：
 * 输入: [2,2,1]
 * 输出: 1
 * 
 * 输入: [4,1,2,1,2]
 * 输出: 4
 * 
 * 提示：
 * 1 <= nums.length <= 3 * 10^4
 * -3 * 10^4 <= nums[i] <= 3 * 10^4
 * 除了某个元素只出现一次外，其余每个元素都出现两次
 */
public class LC136_只出现一次的数字 {
    
    /**
     * 方法1：异或运算
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     */
    public int singleNumber(int[] nums) {
        // TODO: 实现你的解法
        return 0;
    }
    
    /**
     * 方法2：哈希表
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     */
    public int singleNumber2(int[] nums) {
        // TODO: 实现你的解法
        return 0;
    }
    
    /**
     * 方法3：数学方法
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     */
    public int singleNumber3(int[] nums) {
        // TODO: 实现你的解法
        return 0;
    }
    
    public static void main(String[] args) {
        LC136_只出现一次的数字 solution = new LC136_只出现一次的数字();
        
        // 测试用例
        int[][] testCases = {
            {2, 2, 1},                    // 期望输出: 1
            {4, 1, 2, 1, 2},             // 期望输出: 4
            {1},                          // 期望输出: 1
            {1, 1, 2, 2, 3},             // 期望输出: 3
            {5, 5, 6, 6, 7, 7, 8},       // 期望输出: 8
            {9, 8, 7, 6, 5, 4, 3, 2, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9} // 期望输出: 0
        };
        
        for (int i = 0; i < testCases.length; i++) {
            int[] nums = testCases[i];
            int result = solution.singleNumber(nums);
            System.out.println("测试用例 " + (i + 1) + ":");
            System.out.println("输入: " + java.util.Arrays.toString(nums));
            System.out.println("输出: " + result);
            System.out.println("---");
        }
    }
} 