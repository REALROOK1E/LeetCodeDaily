/**
 * LC108 - 将有序数组转换为二叉搜索树
 * 难度：简单
 * 描述：
 * 给你一个整数数组 nums ，其中元素已经按 升序 排列，请你将其转换为一棵 高度平衡 二叉搜索树。
 * 高度平衡 二叉树是一棵满足「每个节点的左右两个子树的高度差的绝对值不超过 1 」的二叉树。
 */
import java.util.*;

public class LC108_将有序数组转换为二叉搜索树 {

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
     * @param nums 有序数组
     * @return 二叉搜索树根节点
     */
    public TreeNode sortedArrayToBST(int[] nums) {
        // 实现逻辑
        return null;
    }

    public static void main(String[] args) {
        LC108_将有序数组转换为二叉搜索树 solution = new LC108_将有序数组转换为二叉搜索树();
        int[] nums = {-10, -3, 0, 5, 9};
        TreeNode result = solution.sortedArrayToBST(nums);
        System.out.println("二叉搜索树已创建");
    }
}
