/**
 * LC78 - 子集
 * 难度：中等
 * 描述：
 * 给你一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的子集（幂集）。
 * 解集 不能 包含重复的子集。你可以按 任意顺序 返回解集。
 */
import java.util.*;

public class LC78_子集 {

    /**
     * 方法：回溯算法
     * @param nums 输入数组
     * @return 所有子集
     */
    public List<List<Integer>> subsets(int[] nums) {
        // 实现逻辑
        return new ArrayList<>();
    }

    /**
     * 回溯辅助方法
     */
    private void backtrack(int[] nums, int start, List<Integer> current, List<List<Integer>> result) {
        // 实现逻辑
    }

    public static void main(String[] args) {
        LC78_子集 solution = new LC78_子集();
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = solution.subsets(nums);
        System.out.println("结果: " + result);
    }
}
