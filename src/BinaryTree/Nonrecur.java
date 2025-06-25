package BinaryTree;

import java.util.Stack;

/*
 * @author: ZeKai
 * @date: 2025/5/19
 * @description:非递归完成三种遍历方式：
 * 先序：反着压入栈中。
 * 中序，以此遍历子树，然后弹出时候把弹出节点的右树的左子树依次进入，两个while条件，一个管开头，一个管结尾
 */
public class Nonrecur {


    public void HeadFirst(TreeNode node){

        Stack<TreeNode> s=new Stack<>();
        s.push(node);
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
        TreeNode node7=new TreeNode();
        node7.val=7;
        //----------------------
        node1.left=node2;
        node1.right=node3;
        node2.left=node4;
        node2.right=node5;
        node3.left=node6;
        node3.right=node7;
        System.out.println(node1.toString());
    }
}
