import java.util.*;

/**
 * LeetCode 739 - 每日温度
 * 
 * 题目描述：
 * 给定一个整数数组 temperatures ，表示每天的温度，返回一个数组 answer ，
 * 其中 answer[i] 是指对于第 i 天，下一个更高温度出现在几天后。如果气温在这之后都不会升高，请在该位置用 0 来代替。
 * 
 * 示例：
 * 输入: temperatures = [73,74,75,71,69,72,76,73]
 * 输出: [1,1,4,2,1,1,0,0]
 * 
 * 输入: temperatures = [30,40,50,60]
 * 输出: [1,1,1,0]
 * 
 * 输入: temperatures = [30,60,90]
 * 输出: [1,1,0]
 * 
 * 提示：
 * 1 <= temperatures.length <= 10^5
 * 30 <= temperatures[i] <= 100
 */
public class LC739_每日温度 {
    
    /**
     * 方法1：单调栈
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     */
    public int[] dailyTemperatures(int[] temperatures) {
        // TODO: 实现你的解法
        return new int[0];
    }
    
    /**
     * 方法2：暴力解法（超时）
     * 时间复杂度：O(n^2)
     * 空间复杂度：O(1)
     */
    public int[] dailyTemperatures2(int[] temperatures) {
        // TODO: 实现你的解法
        return new int[0];
    }
    
    /**
     * 方法3：从右到左遍历
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     */
    public int[] dailyTemperatures3(int[] temperatures) {
        // TODO: 实现你的解法
        return new int[0];
    }
    
    public static void main(String[] args) {
        LC739_每日温度 solution = new LC739_每日温度();
        
        // 测试用例
        int[][] testCases = {
            {73, 74, 75, 71, 69, 72, 76, 73},  // 期望输出: [1,1,4,2,1,1,0,0]
            {30, 40, 50, 60},                   // 期望输出: [1,1,1,0]
            {30, 60, 90},                       // 期望输出: [1,1,0]
            {55, 38, 53, 81, 61, 93, 97, 32, 43, 78}, // 期望输出: [3,1,1,2,1,1,0,1,1,0]
            {34, 80, 80, 34, 34, 80, 80, 80, 80, 34}, // 期望输出: [1,0,0,2,1,0,0,0,0,0]
            {89, 62, 70, 58, 47, 47, 46, 76, 100, 70} // 期望输出: [8,1,5,4,3,2,1,1,0,0]
        };
        
        for (int i = 0; i < testCases.length; i++) {
            int[] temperatures = testCases[i];
            int[] result = solution.dailyTemperatures(temperatures);
            System.out.println("测试用例 " + (i + 1) + ":");
            System.out.println("输入: " + Arrays.toString(temperatures));
            System.out.println("输出: " + Arrays.toString(result));
            System.out.println("---");
        }
    }
} 