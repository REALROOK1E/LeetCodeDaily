/**
 * LC238 - 除自身以外数组的乘积
 * 难度：中等
 * 描述：
 * 给你一个整数数组 nums，返回 数组 answer ，其中 answer[i] 等于 nums 中除 nums[i] 之外其余各元素的乘积 。
 * 题目数据 保证 数组 nums之中任意元素的全部前缀元素和后缀元素的乘积都在  32 位 整数范围内。
 * 请不要使用除法，且在 O(n) 时间复杂度内完成此题。
 */
import java.util.*;

public class LC238_除自身以外数组的乘积 {

    /**
     * 方法：左右乘积
     * @param nums 输入数组
     * @return 乘积数组
     */
    public int[] productExceptSelf(int[] nums) {
        // 实现逻辑
        return new int[nums.length];
    }

    public static void main(String[] args) {
        LC238_除自身以外数组的乘积 solution = new LC238_除自身以外数组的乘积();
        int[] nums = {1, 2, 3, 4};
        int[] result = solution.productExceptSelf(nums);
        System.out.println("结果: " + Arrays.toString(result));
    }
}
