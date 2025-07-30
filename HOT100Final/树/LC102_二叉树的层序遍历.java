/**
 * LC102 - 二叉树的层序遍历
 * 难度：中等
 * 描述：
 * 给你二叉树的根节点 root ，返回其节点值的 层序遍历 。 （即逐层地，从左到右访问所有节点）。
 */
import java.util.*;

public class LC102_二叉树的层序遍历 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    /**
     * 方法：BFS
     * @param root 根节点
     * @return 层序遍历结果
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        // 实现逻辑
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        LC102_二叉树的层序遍历 solution = new LC102_二叉树的层序遍历();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        
        List<List<Integer>> result = solution.levelOrder(root);
        System.out.println("结果: " + result);
    }
}
