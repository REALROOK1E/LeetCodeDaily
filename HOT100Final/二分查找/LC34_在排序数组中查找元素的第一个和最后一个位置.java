/**
 * LC34 - 在排序数组中查找元素的第一个和最后一个位置
 * 难度：中等
 * 描述：
 * 给你一个按照非递减顺序排列的整数数组 nums，和一个目标值 target。请你找出给定目标值在数组中的开始位置和结束位置。
 * 如果数组中不存在目标值 target，返回 [-1, -1]。
 * 你必须设计并实现时间复杂度为 O(log n) 的算法解决此问题。
 */
import java.util.*;

public class LC34_在排序数组中查找元素的第一个和最后一个位置 {

    /**
     * 方法：二分查找
     * @param nums 排序数组
     * @param target 目标值
     * @return 第一个和最后一个位置
     */
    public int[] searchRange(int[] nums, int target) {
        // 实现逻辑
        return new int[]{-1, -1};
    }

    /**
     * 查找左边界
     */
    private int findLeft(int[] nums, int target) {
        // 实现逻辑
        return -1;
    }

    /**
     * 查找右边界
     */
    private int findRight(int[] nums, int target) {
        // 实现逻辑
        return -1;
    }

    public static void main(String[] args) {
        LC34_在排序数组中查找元素的第一个和最后一个位置 solution = new LC34_在排序数组中查找元素的第一个和最后一个位置();
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result = solution.searchRange(nums, target);
        System.out.println("结果: " + Arrays.toString(result));
    }
}
