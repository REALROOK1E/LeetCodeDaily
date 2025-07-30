/**
 * LC114 - 二叉树展开为链表
 * 难度：中等
 * 描述：
 * 给你二叉树的根结点 root ，请你将它展开为一个单链表：
 * - 展开后的单链表应该同样使用 TreeNode ，其中 right 子指针指向链表中下一个结点，而左子指针始终为 null 。
 * - 展开后的单链表应该与二叉树 先序遍历 顺序相同。
 */
import java.util.*;

public class LC114_二叉树展开为链表 {

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

    // 添加上一节点引用
    private TreeNode prev = null;

    /**
     * 方法：递归（反向先序）
     * @param root 根节点
     */
    public void flatten(TreeNode root) {
        prev = null;
        helper(root);
    }

    // 递归辅助方法
    private void helper(TreeNode root) {
        if (root == null) {
            return;
        }
        helper(root.right);
        helper(root.left);
        root.right = prev;
        root.left = null;
        prev = root;
    }

    public static void main(String[] args) {
        LC114_二叉树展开为链表 solution = new LC114_二叉树展开为链表();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(6);
        
        solution.flatten(root);
        System.out.println("二叉树已展开为链表");
    }
}
