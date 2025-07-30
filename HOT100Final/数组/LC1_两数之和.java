/**
 * LC1 - 两数之和
 * 难度：简单
 * 描述：
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出和为目标值 target 的那两个整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * 你可以按任意顺序返回答案。
 */
public class LC1_两数之和 {

    /**
     * 方法：哈希表
     * @param nums 输入数组
     * @param target 目标值
     * @return 两数下标
     */
    public int[] twoSum(int[] nums, int target) {
        // 实现逻辑
        return new int[0];
    }

    public static void main(String[] args) {
        LC1_两数之和 solution = new LC1_两数之和();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        System.out.println("结果: [" + result[0] + ", " + result[1] + "]");
    }
}
