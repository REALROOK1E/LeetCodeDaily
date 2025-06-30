package 左神.BinaryTree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: ZeKai
 * @date: 2025/5/18
 * @description:
 **/
public class Iterate {

    //三种遍历方式
    public static List<Integer> inorderTraversal(TreeNode root) {


List<Integer> res=new ArrayList<>();

dfs(root,res) ;
return res;

    }


    public static void dfs(TreeNode root, List<Integer> ans){
        if(root==null) return;
        dfs(root.left,ans);
        ans.add(root.val);
        dfs(root.right,ans);

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
        node1.left=node2;
        node1.right=node3;
        node2.left=node4;
        node2.right=node5;
        node3.left=node6;

        System.out.println(inorderTraversal(node1));
    }


}
