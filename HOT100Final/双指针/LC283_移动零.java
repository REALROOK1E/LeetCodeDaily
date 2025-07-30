/**
 * LC283 - 移动零
 * 难度：简单
 * 描述：
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
 */
import java.util.*;

public class LC283_移动零 {

    /**
     * 方法：双指针
     * @param nums 输入数组
     */
    public void moveZeroes(int[] nums) {
        // 实现逻辑
    }

    public static void main(String[] args) {
        LC283_移动零 solution = new LC283_移动零();
        int[] nums = {0, 1, 0, 3, 12};
        System.out.println("原数组: " + Arrays.toString(nums));
        solution.moveZeroes(nums);
        System.out.println("结果: " + Arrays.toString(nums));
    }
}
