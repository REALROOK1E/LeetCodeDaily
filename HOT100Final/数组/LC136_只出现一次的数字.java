/**
 * LC136 - 只出现一次的数字
 * 难度：简单
 * 描述：
 * 给你一个 非空 整数数组 nums ，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * 你必须设计并实现线性时间复杂度的算法来解决此问题，且该算法只使用常量额外空间。
 */
import java.util.*;

public class LC136_只出现一次的数字 {

    /**
     * 方法：异或运算
     * @param nums 输入数组
     * @return 只出现一次的数字
     */
    public int singleNumber(int[] nums) {
        // 实现逻辑
        return 0;
    }

    public static void main(String[] args) {
        LC136_只出现一次的数字 solution = new LC136_只出现一次的数字();
        int[] nums = {2, 2, 1};
        int result = solution.singleNumber(nums);
        System.out.println("结果: " + result);
    }
}
