public class Practice226 {
    public static void main(String[] args) {
        final TreeNode treeNode1 = new TreeNode(3);
        final TreeNode treeNode2 = new TreeNode(9);
        final TreeNode treeNode3 = new TreeNode(20);
        final TreeNode treeNode4 = new TreeNode(15);
        final TreeNode treeNode5 = new TreeNode(7);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode3.left = treeNode4;
        treeNode3.right = treeNode5;
        final Practice226 practice226 = new Practice226();
        final TreeNode treeNode = practice226.invertTree(treeNode1);
        System.out.println(treeNode1);
    }
    public TreeNode invertTree(TreeNode root) {
        if (root != null) {
            final TreeNode left = root.left;
            final TreeNode right = root.right;
            root.left = right;
            root.right = left;
            invertTree(root.left);
            invertTree(root.right);
        }
        return root;
    }
}
