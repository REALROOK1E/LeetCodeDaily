package 左神.Bitree;
import java.util.*;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return printTree(this);
    }

    private String printTree(TreeNode root) {
        if (root == null) {
            return "";
        }

        // Get the height of the tree
        int height = getHeight(root);

        // Calculate the width of the tree (2^(height+1) - 1)
        int width = (1 << (height + 1)) - 1;

        // Create a 2D array to store the tree structure
        String[][] tree = new String[height + 1][width];
        for (String[] row : tree) {
            Arrays.fill(row, " ");
        }

        // Fill the tree array with values
        fillTree(root, tree, 0, 0, width - 1);

        // Convert the 2D array to a string
        StringBuilder sb = new StringBuilder();
        for (String[] row : tree) {
            for (String s : row) {
                sb.append(s);
            }
            sb.append("\n");
        }

        return sb.toString().trim();
    }

    private int getHeight(TreeNode node) {
        if (node == null) {
            return -1;
        }
        return 1 + Math.max(getHeight(node.left), getHeight(node.right));
    }

    private void fillTree(TreeNode node, String[][] tree, int level, int left, int right) {
        if (node == null) {
            return;
        }

        // Calculate the position of the current node
        int mid = (left + right) / 2;
        tree[level][mid] = String.valueOf(node.val); // Handle multi-digit values

        // Fill left and right subtrees
        fillTree(node.left, tree, level + 1, left, mid - 1);
        fillTree(node.right, tree, level + 1, mid + 1, right);
    }
    public String toPreorderString() {
        StringBuilder sb = new StringBuilder();
        preorderTraversal(this, sb);
        return sb.toString().trim(); // 去掉末尾的空格
    }

    // 先序遍历辅助方法
    private void preorderTraversal(TreeNode node, StringBuilder sb) {
        if (node == null) {
            return;
        }
        // 根 -> 左 -> 右
        sb.append(node.val).append(" "); // 添加当前节点值
        preorderTraversal(node.left, sb);  // 遍历左子树
        preorderTraversal(node.right, sb); // 遍历右子树
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        System.out.println(root);
    }
}