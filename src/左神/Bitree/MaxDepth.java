package 左神.Bitree;

/**
 * @author: ZeKai
 * @date: 2025/2/20
 * @description:
 **/
public class MaxDepth {

    public int maxDepth(TreeNode root) {
        return root == null? 0: Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
}
}
