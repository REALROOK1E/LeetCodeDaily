/**
 * LC26 - 删除有序数组中的重复项
 * 难度：简单
 * 描述：
 * 给你一个 升序排列 的数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。
 * 元素的 相对顺序 应该保持 一致 。然后返回 nums 中唯一元素的个数。
 * 考虑 nums 的唯一元素的数量为 k ，你需要做以下事情确保你的题解可以被通过：
 * - 更改数组 nums ，使 nums 的前 k 个元素包含唯一元素，并按照它们最初在 nums 中出现的顺序排列。
 * - nums 的其余元素与 nums 的大小不重要。
 * - 返回 k 。
 */
import java.util.*;

public class LC26_删除有序数组中的重复项 {

    /**
     * 方法：双指针
     * @param nums 有序数组
     * @return 不重复元素的个数
     */
    public int removeDuplicates(int[] nums) {
        // 实现逻辑
        return 0;
    }

    public static void main(String[] args) {
        LC26_删除有序数组中的重复项 solution = new LC26_删除有序数组中的重复项();
        int[] nums = {1, 1, 2};
        System.out.println("原数组: " + Arrays.toString(nums));
        int k = solution.removeDuplicates(nums);
        System.out.println("不重复元素个数: " + k);
        System.out.println("修改后数组: " + Arrays.toString(Arrays.copyOf(nums, k)));
    }
}
