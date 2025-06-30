package 左神.BinaryTree;

/**
 * @author: ZeKai
 * @date: 2025/5/18
 * @description:
 **/
public class MaxRouteTree {
    public static int diameterOfBinaryTree(TreeNode root) {

        return Math.max(Math.max(dia(root.left),dia(root.right)),dia(root));
    }
    public static  int dia(TreeNode root) {
        if(root.left==null) return maxDepth(root.right);
        if(root.right==null) return maxDepth(root.left);
        return maxDepth(root.left)+maxDepth(root.right);
    }
    public static int  maxDepth(TreeNode root) {

        if(root==null) return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;

    }
    public static void main(String[] args) {
        TreeNode node1=new TreeNode();
        node1.val=1;
        TreeNode node2=new TreeNode();
        node2.val=2;
        TreeNode node3=new TreeNode();
        node3.val=3;
        TreeNode node4=new TreeNode();
        node4.val=4;
        TreeNode node5=new TreeNode();
        node5.val=5;
        TreeNode node6=new TreeNode();
        node6.val=6;
        TreeNode node8=new TreeNode();
        node8.val=8;
        node1.left=node2;
        node1.right=node3;
        node2.left=node4;
        node2.right=node5;
        node3.left=node6;
        node4.left=node8;

        System.out.println(diameterOfBinaryTree(node1));
    }
}
