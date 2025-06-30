package 左神.Bitree;

/**
 * @author: ZeKai
 * @date: 2025/2/21
 * @description:
 **/
public class minDepth {
    public int MinDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        int left=Integer.MAX_VALUE;
        int right=Integer.MAX_VALUE;

        if (root.left != null) {
            left=MinDepth(root.left);
        }
        if (root.right != null) {
            right=MinDepth(root.right);
        }
        return Math.max(left,right) + 1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3, null, new TreeNode(6)));

        System.out.println(root.toString());
    }
}
