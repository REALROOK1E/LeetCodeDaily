/**
 * LC169 - 多数元素
 * 难度：简单
 * 描述：
 * 给定一个大小为 n 的数组 nums ，返回其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 */
import java.util.*;

public class LC169_多数元素 {

    /**
     * 方法：Boyer-Moore投票算法
     * @param nums 输入数组
     * @return 多数元素
     */
    public int majorityElement(int[] nums) {
        // 实现逻辑
        return 0;
    }

    public static void main(String[] args) {
        LC169_多数元素 solution = new LC169_多数元素();
        int[] nums = {3, 2, 3};
        int result = solution.majorityElement(nums);
        System.out.println("结果: " + result);
    }
}
