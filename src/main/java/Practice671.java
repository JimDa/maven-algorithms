public class Practice671 {
    public static void main(String[] args) {
        final TreeNode treeNode1 = new TreeNode(1);
        final TreeNode treeNode2 = new TreeNode(2);
        final TreeNode treeNode3 = new TreeNode(3);
        final TreeNode treeNode4 = new TreeNode(4);
        final TreeNode treeNode5 = new TreeNode(5);
        final TreeNode treeNode7 = new TreeNode(7);
        treeNode1.left= treeNode3;
        treeNode1.right = treeNode2;
        treeNode3.left=treeNode5;
        final Practice671 practice671 = new Practice671();
//        practice671.mergeTrees()
    }
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode resultTreeNode;
        if (t1 != null && t2 != null) {
            resultTreeNode = new TreeNode(t1.val + t2.val);
            resultTreeNode.left = mergeTrees(t1.left, t2.left);
            resultTreeNode.right = mergeTrees(t1.right, t2.right);
        } else {
            if (t1 == null && t2 == null) {
                return null;
            } else {
                return t1 != null ? t1 : t2;
            }
        }
        return resultTreeNode;
    }
}
