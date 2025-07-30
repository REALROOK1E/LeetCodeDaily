/**
 * LC48 - 旋转图像
 * 难度：中等
 * 描述：
 * 给定一个 n × n 的二维矩阵 matrix 表示一个图像。请你将图像顺时针旋转 90 度。
 * 你必须在 原地 旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要 使用另一个矩阵来旋转图像。
 */
import java.util.*;

public class LC48_旋转图像 {

    /**
     * 方法：原地旋转
     * @param matrix 输入矩阵
     */
    public void rotate(int[][] matrix) {
        // 实现逻辑
    }

    public static void main(String[] args) {
        LC48_旋转图像 solution = new LC48_旋转图像();
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("原矩阵: " + Arrays.deepToString(matrix));
        solution.rotate(matrix);
        System.out.println("旋转后: " + Arrays.deepToString(matrix));
    }
}
