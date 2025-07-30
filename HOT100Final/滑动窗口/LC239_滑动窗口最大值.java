/**
 * LC239 - 滑动窗口最大值
 * 难度：困难
 * 描述：
 * 给你一个整数数组 nums，有一个大小为 k 的滑动窗口从数组的最左侧移动到数组的最右侧。
 * 你只可以看到在滑动窗口内的 k 个数字。滑动窗口每次只向右移动一位。
 * 返回滑动窗口中的最大值。
 */
import java.util.*;

public class LC239_滑动窗口最大值 {

    /**
     * 方法：单调队列
     * @param nums 输入数组
     * @param k 窗口大小
     * @return 滑动窗口最大值数组
     */
    public int[] maxSlidingWindow(int[] nums, int k) {
        // 实现逻辑
        return new int[nums.length - k + 1];
    }

    public static void main(String[] args) {
        LC239_滑动窗口最大值 solution = new LC239_滑动窗口最大值();
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] result = solution.maxSlidingWindow(nums, k);
        System.out.println("结果: " + Arrays.toString(result));
    }
}
