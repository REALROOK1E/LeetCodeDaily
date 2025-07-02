package Hot100.Template;

public class monostack {
    /*84. 柱状图中最大的矩形
困难
相关标签
premium lock icon
相关企业
给定 n 个非负整数，用来表示柱状图中各个柱子的高度。每个柱子彼此相邻，且宽度为 1 。
 heights = [2,1,5,6,2,3]
求在该柱状图中，能够勾勒出来的矩形的最大面积。 */

public static int largestRectangleArea(int[] heights) {
    int r = 0;
    int[] stack = new int[100001];
    int ans = 0;
    for (int i = 0; i < heights.length; i++) {
        while (r > 0 && heights[stack[r - 1]] > heights[i]) {
            int h = heights[stack[--r]];
            int w = i - (r == 0 ? -1 : stack[r - 1]) - 1;
            ans = Math.max(ans, h * w);
        }
        stack[r++] = i;
    }
    int end = heights.length;
    while (r > 0) {
        int h = heights[stack[--r]];
        //在左边界的时候额外判断，因为r为0时候不对
        int w = end - (r == 0 ? -1 : stack[r - 1]) - 1;
        ans = Math.max(ans, h * w);
    }
    System.out.println(ans);
    return ans;
}
public static void main(String[] args) {
    largestRectangleArea(new int[] {2,4});
}
}
