/**
 * LC104 - 二叉树的最大深度
 * 难度：简单
 * 描述：
 * 给定一个二叉树，找出其最大深度。
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 * 说明: 叶子节点是指没有子节点的节点。
 */
import java.util.*;

public class LC104_二叉树的最大深度 {

    /**
     * Definition for a binary tree node.
     */
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
     * 方法：递归
     * @param root 根节点
     * @return 最大深度
     */
    public int maxDepth(TreeNode root) {
        // 实现逻辑
        return 0;
    }

    public static void main(String[] args) {
        LC104_二叉树的最大深度 solution = new LC104_二叉树的最大深度();
        
        // 构造测试用例：[3,9,20,null,null,15,7]
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        
        int result = solution.maxDepth(root);
        System.out.println("结果: " + result);
    }
}
