public class Practice101 {
    public static void main(String[] args) {
        final TreeNode treeNode1 = new TreeNode(3);
        final TreeNode treeNode2 = new TreeNode(9);
        final TreeNode treeNode3 = new TreeNode(20);
        final TreeNode treeNode4 = new TreeNode(3);
        final TreeNode treeNode5 = new TreeNode(9);
        final TreeNode treeNode6 = new TreeNode(20);
        final TreeNode treeNode7 = new TreeNode(21);
        final TreeNode treeNode8 = new TreeNode(22);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode4.left = treeNode5;
        treeNode4.right = treeNode6;
        treeNode3.left = treeNode7;
        treeNode6.left = treeNode8;
        Practice101 practice101 = new Practice101();
        boolean init = false;
        boolean symmetric = practice101.isSymmetric(treeNode1);
        System.out.println(symmetric);
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.left != null && root.right != null) {
            return compare(root.left, root.right);
        } else {
            return root.left == root.right;
        }
    }

    private boolean compare(TreeNode left, TreeNode right) {
        if (left != null && right != null) {
            return left.val != right.val ? false : compare(left.left, right.right) && compare(left.right, right.left);
        } else {
            return left == right;
        }
    }
}
