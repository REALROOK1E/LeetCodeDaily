import java.util.*;

/**
 * LeetCode 56 - 合并区间
 * 
 * 题目描述：
 * 以数组 intervals 表示若干个区间的集合，其中单个区间为 intervals[i] = [starti, endi] 。
 * 请你合并所有重叠的区间，并返回一个不重叠的区间数组，该数组需恰好覆盖输入中的所有区间。
 * 
 * 示例：
 * 输入: intervals = [[1,3],[2,6],[8,10],[15,18]]
 * 输出: [[1,6],[8,10],[15,18]]
 * 解释: 区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
 * 
 * 输入: intervals = [[1,4],[4,5]]
 * 输出: [[1,5]]
 * 解释: 区间 [1,4] 和 [4,5] 可被视为重叠区间。
 * 
 * 提示：
 * 1 <= intervals.length <= 10^4
 * intervals[i].length == 2
 * 0 <= starti <= endi <= 10^4
 */
public class LC56_合并区间 {
    
    /**
     * 方法1：排序 + 合并
     * 时间复杂度：O(n log n)
     * 空间复杂度：O(log n)
     */
    public int[][] merge(int[][] intervals) {
        // TODO: 实现你的解法
        return new int[0][0];
    }
    
    /**
     * 方法2：扫描线算法
     * 时间复杂度：O(n log n)
     * 空间复杂度：O(n)
     */
    public int[][] merge2(int[][] intervals) {
        // TODO: 实现你的解法
        return new int[0][0];
    }
    
    /**
     * 方法3：使用TreeMap
     * 时间复杂度：O(n log n)
     * 空间复杂度：O(n)
     */
    public int[][] merge3(int[][] intervals) {
        // TODO: 实现你的解法
        return new int[0][0];
    }
    
    public static void main(String[] args) {
        LC56_合并区间 solution = new LC56_合并区间();
        
        // 测试用例
        int[][][] testCases = {
            {{1, 3}, {2, 6}, {8, 10}, {15, 18}},           // 期望输出: [[1,6],[8,10],[15,18]]
            {{1, 4}, {4, 5}},                               // 期望输出: [[1,5]]
            {{1, 4}, {0, 4}},                               // 期望输出: [[0,4]]
            {{1, 4}, {2, 3}},                               // 期望输出: [[1,4]]
            {{1, 4}, {5, 6}},                               // 期望输出: [[1,4],[5,6]]
            {{1, 4}, {0, 2}, {3, 5}},                      // 期望输出: [[0,5]]
            {{2, 3}, {4, 5}, {6, 7}, {8, 9}, {1, 10}},    // 期望输出: [[1,10]]
            {{1, 3}, {2, 4}, {3, 5}, {4, 6}}              // 期望输出: [[1,6]]
        };
        
        for (int i = 0; i < testCases.length; i++) {
            int[][] intervals = testCases[i];
            int[][] result = solution.merge(intervals);
            System.out.println("测试用例 " + (i + 1) + ":");
            System.out.println("输入: " + Arrays.deepToString(intervals));
            System.out.println("输出: " + Arrays.deepToString(result));
            System.out.println("---");
        }
    }
} 