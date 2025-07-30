/**
 * LC84 - 柱状图中最大的矩形
 * 难度：困难
 * 描述：
 * 给定 n 个非负整数，用来表示柱状图中各个柱子的高度。每个柱子彼此相邻，且宽度为 1 。
 * 求在该柱状图中，能够勾勒出来的矩形的最大面积。
 */
import java.util.*;

public class LC84_柱状图中最大的矩形 {

    /**
     * 方法：单调栈
     * @param heights 柱子高度数组
     * @return 最大矩形面积
     */
    public int largestRectangleArea(int[] heights) {
        // 实现逻辑
        return 0;
    }

    public static void main(String[] args) {
        LC84_柱状图中最大的矩形 solution = new LC84_柱状图中最大的矩形();
        int[] heights = {2, 1, 5, 6, 2, 3};
        int result = solution.largestRectangleArea(heights);
        System.out.println("结果: " + result);
    }
}
