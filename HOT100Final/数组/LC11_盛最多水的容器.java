/**
 * LC11 - 盛最多水的容器
 * 难度：中等
 * 描述：
 * 给定一个长度为 n 的整数数组 height 。每个元素 height[i] 表示第 i 根柱子的高度。
 * 找出其中的两根柱子，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 * 返回容器可以储存的最大水量。
 */
public class LC11_盛最多水的容器 {

    /**
     * 方法：双指针
     * @param height 输入数组
     * @return 最大水量
     */
    public int maxArea(int[] height) {
        // 实现逻辑
        return 0;
    }

    public static void main(String[] args) {
        LC11_盛最多水的容器 solution = new LC11_盛最多水的容器();
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int result = solution.maxArea(height);
        System.out.println("结果: " + result);
    }
}
