/**
 * LC215 - 数组中的第K个最大元素
 * 难度：中等
 * 描述：
 * 给定整数数组 nums 和整数 k，请返回数组中第 k 个最大的元素。
 * 请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
 */
public class LC215_数组中的第K个最大元素 {

    /**
     * 方法：堆排序
     * @param nums 输入数组
     * @param k 第k大
     * @return 第k大的元素
     */
    public int findKthLargest(int[] nums, int k) {
        // 实现逻辑
        return 0;
    }

    public static void main(String[] args) {
        LC215_数组中的第K个最大元素 solution = new LC215_数组中的第K个最大元素();
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        int result = solution.findKthLargest(nums, k);
        System.out.println("结果: " + result);
    }
}
