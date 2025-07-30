/**
 * LC207 - 课程表
 * 难度：中等
 * 描述：
 * 你这个学期必须选修 numCourses 门课程，记为 0 到 numCourses - 1 。
 * 在选修某些课程之前需要一些先修课程。 先修课程按数组 prerequisites 给出，
 * 其中 prerequisites[i] = [ai, bi] ，表示如果要学习课程 ai 则 必须 先学习课程  bi 。
 * 例如，先修课程对 [0, 1] 表示：想要学习课程 0 ，你需要先完成课程 1 。
 * 请你判断是否可能完成所有课程的学习？如果可以，返回 true ；否则，返回 false 。
 */
import java.util.*;

public class LC207_课程表 {

    /**
     * 方法：拓扑排序
     * @param numCourses 课程数量
     * @param prerequisites 先修课程
     * @return 是否可以完成所有课程
     */
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // 实现逻辑
        return false;
    }

    public static void main(String[] args) {
        LC207_课程表 solution = new LC207_课程表();
        int numCourses = 2;
        int[][] prerequisites = {{1, 0}};
        boolean result = solution.canFinish(numCourses, prerequisites);
        System.out.println("结果: " + result);
    }
}
