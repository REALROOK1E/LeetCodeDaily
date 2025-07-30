/**
 * LC56 - 合并区间
 * 难度：中等
 * 描述：
 * 以数组 intervals 表示若干个区间的集合，其中单个区间为 intervals[i] = [starti, endi] 。
 * 请你合并所有重叠的区间，并返回一个不重叠的区间数组，该数组需要覆盖输入中的所有区间。
 */
import java.util.*;

public class LC56_合并区间 {

    /**
     * 方法：排序+合并
     * @param intervals 区间数组
     * @return 合并后的区间数组
     */
    public int[][] merge(int[][] intervals) {
        // 实现逻辑
        return new int[0][0];
    }

    public static void main(String[] args) {
        LC56_合并区间 solution = new LC56_合并区间();
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] result = solution.merge(intervals);
        
        System.out.print("结果: ");
        for (int[] interval : result) {
            System.out.print("[" + interval[0] + "," + interval[1] + "] ");
        }
        System.out.println();
    }
}
