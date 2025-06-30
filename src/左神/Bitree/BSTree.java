package 左神.Bitree;

class BSTree {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int x) { val = x; }
    }

    TreeNode root;

    // 插入节点
    public void insert(int val) {
        root = insert(root, val);
    }
    private TreeNode insert(TreeNode node, int val) {
        if (node == null) return new TreeNode(val);
        if (val < node.val) node.left = insert(node.left, val);
        else if (val > node.val) node.right = insert(node.right, val);
        return node;
    }

    // 查找节点
    public boolean search(int val) {
        return search(root, val);
    }
    private boolean search(TreeNode node, int val) {
        if (node == null) return false;
        if (node.val == val) return true;
        if (val < node.val) return search(node.left, val);
        else return search(node.right, val);
    }

    // 删除节点
    public void delete(int val) {
        root = delete(root, val);
    }
    private TreeNode delete(TreeNode node, int val) {
        if (node == null) return null;
        if (val < node.val) node.left = delete(node.left, val);
        else if (val > node.val) node.right = delete(node.right, val);
        else {
            if (node.left == null) return node.right;
            if (node.right == null) return node.left;
            TreeNode minNode = getMin(node.right);
            node.val = minNode.val;
            node.right = delete(node.right, minNode.val);
        }
        return node;
    }
    private TreeNode getMin(TreeNode node) {
        while (node.left != null) node = node.left;
        return node;
    }

    // 中序遍历
    public void inorder() {
        inorder(root);
        System.out.println();
    }
    private void inorder(TreeNode node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.val + " ");
        inorder(node.right);
    }

    public static void main(String[] args) {
        BSTree bst = new BSTree();
        int[] nums = {5, 3, 7, 2, 4, 6, 8};
        for (int num : nums) bst.insert(num);
        System.out.print("中序遍历: ");
        bst.inorder();
        System.out.println("查找4: " + bst.search(4));
        System.out.println("查找10: " + bst.search(10));
        bst.delete(3);
        System.out.print("删除3后中序遍历: ");
        bst.inorder();
    }
} 