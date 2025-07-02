package Hot100;

import java.util.Stack;

public class 柱状图中最大的矩形 {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] newHeights = new int[n + 2];
        System.arraycopy(heights, 0, newHeights, 1, n);
        // newHeights[0] = 0, newHeights[n+1] = 0

        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        for (int i = 0; i < newHeights.length; i++) {
            while (!stack.isEmpty() && newHeights[i] < newHeights[stack.peek()]) {
                int h = newHeights[stack.pop()];
                int w = i - stack.peek() - 1;
                maxArea = Math.max(maxArea, h * w);
            }
            stack.push(i);
        }
        return maxArea;
    }

    public static void main(String[] args) {
        柱状图中最大的矩形 s = new 柱状图中最大的矩形();
        System.out.println(s.largestRectangleArea(new int[]{2,1,5,6,2,3})); // 输出10
    }
} 