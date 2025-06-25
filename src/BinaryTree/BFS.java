package BinaryTree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: ZeKai
 * @date: 2025/5/10
 * @description:
 **/
public class BFS {

    //层序遍历，答案是每一层有个小链表，用List存储
    List<List<Integer>> ans=new ArrayList<>();
    public static TreeNode[] q= new TreeNode[10000];
    int l,r;
    public List<List<Integer>> levelOrder(TreeNode root) {
    l=r=0;

    q[r++]=root;//把根加到队列里
        while(l<r){

            int size=r-l;
            ArrayList <Integer> list=new ArrayList<>();

            for(int i=0;i<size;i++){ //以下操作循环size次
                TreeNode crr=q[l++];//这一步是弹出，
                list.add(crr.val);
                if(crr.left!=null) q[r++]=crr.left;//有左加左
                if(crr.right!=null) q[r++]=crr.right;//有右加右
            }
            ans.add(list);
        }

        return ans;
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
        BFS bfs=new BFS();
        System.out.println(bfs.levelOrder(node1));
    }










}
