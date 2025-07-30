/**
 * LC46 - 全排列
 * 难度：中等
 * 描述：
 * 给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。
 */
import java.util.*;

public class LC46_全排列 {

    /**
     * 方法：回溯算法
     * @param nums 输入数组
     * @return 所有排列
     */
    public List<List<Integer>> permute(int[] nums) {
        // 实现逻辑
        return new ArrayList<>();
    }

    /**
     * 回溯辅助方法
     */
    private void backtrack(int[] nums, List<Integer> current, boolean[] used, List<List<Integer>> result) {
        // 实现逻辑
    }

    public static void main(String[] args) {
        LC46_全排列 solution = new LC46_全排列();
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = solution.permute(nums);
        System.out.println("结果: " + result);
    }
}
