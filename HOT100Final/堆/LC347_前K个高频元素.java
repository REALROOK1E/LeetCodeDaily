/**
 * LC347 - 前 K 个高频元素
 * 难度：中等
 * 描述：
 * 给你一个整数数组 nums 和一个整数 k ，请你返回其中出现频率前 k 高的元素。你可以按 任意顺序 返回答案。
 */
import java.util.*;

public class LC347_前K个高频元素 {

    /**
     * 方法：堆（优先队列）
     * @param nums 输入数组
     * @param k 前k个
     * @return 前k个高频元素
     */
    public int[] topKFrequent(int[] nums, int k) {
        // 实现逻辑
        return new int[k];
    }

    public static void main(String[] args) {
        LC347_前K个高频元素 solution = new LC347_前K个高频元素();
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        int[] result = solution.topKFrequent(nums, k);
        System.out.println("结果: " + Arrays.toString(result));
    }
}
