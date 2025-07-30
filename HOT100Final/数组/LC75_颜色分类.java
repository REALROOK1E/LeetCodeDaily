/**
 * LC75 - 颜色分类
 * 难度：中等
 * 描述：
 * 给定一个包含红色、白色和蓝色、共 n 个元素的数组 nums ，原地对它们进行排序，使得相同颜色的元素相邻，
 * 并按照红色、白色、蓝色顺序排列。
 * 我们使用整数 0、1 和 2 分别表示红色、白色和蓝色。
 * 必须在不使用库的sort函数的情况下解决这个问题。
 */
import java.util.*;

public class LC75_颜色分类 {

    /**
     * 方法：三指针（荷兰国旗）
     * @param nums 颜色数组
     */
    public void sortColors(int[] nums) {
        // 实现逻辑
    }

    public static void main(String[] args) {
        LC75_颜色分类 solution = new LC75_颜色分类();
        int[] nums = {2, 0, 2, 1, 1, 0};
        System.out.println("原数组: " + Arrays.toString(nums));
        solution.sortColors(nums);
        System.out.println("结果: " + Arrays.toString(nums));
    }
}
