/**
 * LC15 - 三数之和
 * 难度：中等
 * 描述：
 * 给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]] 满足 i != j、i != k 且 j != k ，
 * 同时还满足 nums[i] + nums[j] + nums[k] == 0 。请你返回所有和为 0 且不重复的三元组。
 * 注意：答案中不可以包含重复的三元组。
 */
public class LC15_三数之和 {

    /**
     * 方法：双指针
     * @param nums 输入数组
     * @return 所有满足条件的三元组
     */
    public List<List<Integer>> threeSum(int[] nums) {
        // 实现逻辑
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        LC15_三数之和 solution = new LC15_三数之和();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = solution.threeSum(nums);
        System.out.println("结果: " + result);
    }
}
