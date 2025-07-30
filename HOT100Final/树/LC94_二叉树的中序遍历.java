/**
 * LC94 - 二叉树的中序遍历
 * 难度：简单
 * 描述：
 * 给定一个二叉树的根节点 root ，返回 它的 中序 遍历 。
 */
import java.util.*;

public class LC94_二叉树的中序遍历 {

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
     * 方法：递归/迭代
     * @param root 根节点
     * @return 中序遍历结果
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        // 实现逻辑
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        LC94_二叉树的中序遍历 solution = new LC94_二叉树的中序遍历();
        
        // 构造测试用例：[1,null,2,3]
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        
        List<Integer> result = solution.inorderTraversal(root);
        System.out.println("结果: " + result);
    }
}
