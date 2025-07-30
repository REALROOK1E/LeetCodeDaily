/**
 * LC124 - 二叉树中的最大路径和
 * 难度：困难
 * 描述：
 * 路径 被定义为一条从树中任意节点出发，沿父节点-子节点连接，达到任意节点的序列。同一个节点在一条路径序列中 至多出现一次 。
 * 该路径 至少包含一个 节点，且不一定经过根节点。
 * 路径和 是路径中各节点值的总和。
 * 给你一个二叉树的根节点 root ，返回其 最大路径和 。
 */
import java.util.*;

public class LC124_二叉树中的最大路径和 {

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

    private int maxSum = Integer.MIN_VALUE;

    /**
     * 方法：递归
     * @param root 根节点
     * @return 最大路径和
     */
    public int maxPathSum(TreeNode root) {
        // 实现逻辑
        return 0;
    }

    public static void main(String[] args) {
        LC124_二叉树中的最大路径和 solution = new LC124_二叉树中的最大路径和();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        
        int result = solution.maxPathSum(root);
        System.out.println("结果: " + result);
    }
}
