package Bitree;

import java.util.HashMap;

/**
 * @author: ZeKai
 * @date: 2025/2/21
 * @description:
 **/
public class buildtreewithpreandin {
    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        //就是根据头结点把数量对上 构造左边->右边->递归
        //存中序，根据后续查询
        if (inorder.length == 0 || postorder.length == 0) return null;

       HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return build(inorder,0,inorder.length-1,postorder,0,postorder.length-1,map);
    }

    public static TreeNode build(int[] inorder, int l1, int r1, int[] postorder, int l2, int r2, HashMap<Integer, Integer> map){

        if (l1 > r1||l2>r2) return null;
            /*
        Input: inorder = [9,3,15,20,7], postorder = [9,15,7,20,3]
        Output: [3,9,20,null,null,15,7]
              3
            9   20
               15 7
        pre:3,9,20,15,7
         */
        TreeNode root = new TreeNode(postorder[r2]);//3
        int k = map.get(postorder[r2]);//k=1,k是在中序中头的序号 所以可以知道左右的长度
        /*
        左子树长度是l1到k-1=k-1-l1
        右子树长度是k+1到r1=r1-k-1
        这个长度是通用的
         */
        //左子树有k个 右子树有length-k-1个
        if(l2==r2) return root;//相等的情况下就是一个单独的点了，否则继续构建  通过k表示新的边界
        //后序+子树的长度
        int leftSize = k-l1;
        int rightSize = r1-k;

        root.left=build(inorder,l1,k-1,postorder,l2,l2+leftSize-1,map);//中序0,0  后序0，0
        root.right=build(inorder,k+1,r1,postorder,l2+leftSize,r2-1,map);
        return root;
    }

    public static void main(String[] args) {
       int[] inorder = {9,3,15,20,7};
       int[] postorder = {9,15,7,20,3}; //3,9,20,15,7
       TreeNode t=buildTree(inorder,postorder);
        assert t != null;
        System.out.println(t.toPreorderString());
    }
}
