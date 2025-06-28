package Bitree;

/**
 * @author: ZeKai
 * @date: 2025/6/25
 * @description:
 **/
public class LCA {
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //如果左边有，右边有，那么自己就是
        if(root==p||root==q||root==null) return root;
        //如果一边有，那么就是先找到的那个
        TreeNode left=lowestCommonAncestor(root.left,p,q);
        TreeNode right=lowestCommonAncestor(root.right,p,q);
        if(left==null&&right==null) return null;
        //如果一边有，那么就是先找到的那个
        return left==null?right:left;
    }
    public static TreeNode LCAinsearchTree(TreeNode root, TreeNode p, TreeNode q) {
        //在搜索树里面，如果比root一小一大，必然返回root
        if(root.val==p.val||root.val==q.val||root==null) return root;
        //比root都小或者都大，必然是在左或者右
        if(Math.min(p.val,q.val)>root.val) return LCAinsearchTree(root.right, p, q);
        if(Math.max(p.val,q.val)<root.val) return LCAinsearchTree(root.right, p, q);
        return null;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode root2 = root.left = new TreeNode(2);
        TreeNode root3=  root.right = new TreeNode(3);
        TreeNode root4=  root.left.left = new TreeNode(4);
        TreeNode root5=  root.left.right = new TreeNode(5);
        TreeNode root6=  root.right.left = new TreeNode(6);
        TreeNode root7=  root.right.right = new TreeNode(7);

        System.out.println(lowestCommonAncestor(root,root2,root4).toString());

    }
}
