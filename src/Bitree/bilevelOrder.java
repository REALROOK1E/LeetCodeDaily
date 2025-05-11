package Bitree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: ZeKai
 * @date: 2025/2/20
 * @description:
 **/
public class bilevelOrder {
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();

    //用一个数组，size=1，弹出a，有左加左，有右加右，重复size次
    TreeNode[] nodes=new TreeNode[2001];
    int l=0;
    int r=0;
    if(root==null) return result;
    nodes[r++]=root;//统一用后缀，后增加
        boolean reverse =false;
    while(l<r)//代表着数组里是有东西的
    {
        int size=r-l;
        List<Integer> temp=new ArrayList<>();
        //这里的问题：只要是放数据时候反就行，读数据正常读取
        //j作为信号，和i对应   因为i的两种情况运算条件不同，直接把他和次数分开表示，用k表示次数
        for(int i=reverse?r-1:l,j=reverse?-1:1,k=0;k<size;i+=j,k++)//for 的第一个位置是一个舞台
        {
            TreeNode node=nodes[i];
            temp.add(node.val);
        }
//因为进入队列的逻辑不一样，所以把进入和弹出分开写，解耦
        for(int i=0;i<size;i++){
            TreeNode node=nodes[l++];
            if(node.left!=null) nodes[r++]=node.left;
            if(node.right!=null) nodes[r++]=node.right;
        }
        reverse =!reverse;
        result.add(temp);
    }

        System.out.println(result);
    return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
//        root.right.left = new TreeNode(15);
//        root.right.right = new TreeNode(7);
        zigzagLevelOrder(root);
    }
}
