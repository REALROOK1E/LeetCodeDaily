/**
 * LC88 - 合并两个有序数组
 * 难度：简单
 * 描述：
 * 给你两个按 非递减顺序 排列的整数数组 nums1 和 nums2，另有两个整数 m 和 n ，分别表示 nums1 和 nums2 中元素的数目。
 * 请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。
 * 注意：最终，合并后数组不应由函数返回，而是存储在数组 nums1 中。
 * 为了应对这种情况，nums1 的初始长度为 m + n，其中前 m 个元素表示应合并的元素，后 n 个元素为 0 ，应忽略。
 * nums2 的长度为 n 。
 */
import java.util.*;

public class LC88_合并两个有序数组 {

    /**
     * 方法：从后往前合并
     * @param nums1 数组1
     * @param m 数组1有效元素个数
     * @param nums2 数组2
     * @param n 数组2有效元素个数
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // 实现逻辑
    }

    public static void main(String[] args) {
        LC88_合并两个有序数组 solution = new LC88_合并两个有序数组();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        
        System.out.println("合并前 nums1: " + Arrays.toString(nums1));
        System.out.println("nums2: " + Arrays.toString(nums2));
        
        solution.merge(nums1, m, nums2, n);
        System.out.println("合并后 nums1: " + Arrays.toString(nums1));
    }
}
