/**
 * LC189 - 轮转数组
 * 难度：中等
 * 描述：
 * 给定一个整数数组 nums，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。
 */
import java.util.*;

public class LC189_轮转数组 {

    /**
     * 方法：三次反转
     * @param nums 输入数组
     * @param k 轮转位置
     */
    public void rotate(int[] nums, int k) {
        // 实现逻辑
    }

    public static void main(String[] args) {
        LC189_轮转数组 solution = new LC189_轮转数组();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        System.out.println("原数组: " + Arrays.toString(nums));
        solution.rotate(nums, k);
        System.out.println("结果: " + Arrays.toString(nums));
    }
}
