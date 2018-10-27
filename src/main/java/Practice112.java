import java.util.ArrayList;

public class Practice112 {
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
        Practice112 practice112 = new Practice112();
        boolean b = practice112.hasPathSum(treeNode1, 33);
        System.out.println(b);
    }
    public boolean hasPathSum(TreeNode root, int sum) {
        int current = 0;
        if (root == null) {
            return false;
        } else {
            ArrayList<Integer> sums = new ArrayList<>();
            countAndCalculate(root, current, sums);
            return sums.contains(sum);
        }
    }

    private void countAndCalculate(TreeNode root, int current, ArrayList<Integer> sums) {
        if (root != null) {
            if (root.left == null && root.right ==null) {
                sums.add(current + root.val);
            } else {

                countAndCalculate(root.left, current + root.val, sums);
                countAndCalculate(root.right, current + root.val, sums);
            }
        }
    }
}
