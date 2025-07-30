/**
 * LC226 - 翻转二叉树
 * 难度：简单
 * 描述：
 * 给你一棵二叉树的根节点 root ，翻转这棵二叉树，并返回其根节点。
 */
import java.util.*;

public class LC226_翻转二叉树 {

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
     * @return 翻转后的根节点
     */
    public TreeNode invertTree(TreeNode root) {
        // 实现逻辑
        return root;
    }

    /**
     * 辅助方法：中序遍历打印树
     */
    private void inorder(TreeNode root, List<Integer> result) {
        if (root != null) {
            inorder(root.left, result);
            result.add(root.val);
            inorder(root.right, result);
        }
    }

    public static void main(String[] args) {
        LC226_翻转二叉树 solution = new LC226_翻转二叉树();
        
        // 构造测试用例：[4,2,7,1,3,6,9]
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        
        List<Integer> before = new ArrayList<>();
        solution.inorder(root, before);
        System.out.println("翻转前: " + before);
        
        TreeNode result = solution.invertTree(root);
        
        List<Integer> after = new ArrayList<>();
        solution.inorder(result, after);
        System.out.println("翻转后: " + after);
    }
}
