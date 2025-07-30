/**
 * LC4 - 寻找两个正序数组的中位数
 * 难度：困难
 * 描述：
 * 给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。
 * 请你找出并返回这两个正序数组的中位数。
 * 算法的时间复杂度应该为 O(log (m+n)) 。
 */
public class LC4_寻找两个正序数组的中位数 {

    /**
     * 方法：二分查找
     * @param nums1 数组1
     * @param nums2 数组2
     * @return 中位数
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // 实现逻辑
        return 0.0;
    }

    public static void main(String[] args) {
        LC4_寻找两个正序数组的中位数 solution = new LC4_寻找两个正序数组的中位数();
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        double result = solution.findMedianSortedArrays(nums1, nums2);
        System.out.println("结果: " + result);
    }
}
