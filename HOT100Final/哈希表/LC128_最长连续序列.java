/**
 * LC128 - 最长连续序列
 * 难度：中等
 * 描述：
 * 给定一个未排序的整数数组 nums ，找出数字连续的最长序列（不要求序列元素在原数组中连续）的长度。
 * 请你设计并实现时间复杂度为 O(n) 的算法解决此问题。
 */
import java.util.*;

public class LC128_最长连续序列 {

    /**
     * 方法：哈希表
     * @param nums 输入数组
     * @return 最长连续序列长度
     */
    public int longestConsecutive(int[] nums) {
        // 实现逻辑
        return 0;
    }

    public static void main(String[] args) {
        LC128_最长连续序列 solution = new LC128_最长连续序列();
        int[] nums = {100, 4, 200, 1, 3, 2};
        int result = solution.longestConsecutive(nums);
        System.out.println("结果: " + result);
    }
}
