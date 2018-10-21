import java.util.ArrayList;
import java.util.Collections;

public class Practice104 {
    public static void main(String[] args) {
        Practice104 practice104 = new Practice104();
        final TreeNode treeNode1 = new TreeNode(3);
        final TreeNode treeNode2 = new TreeNode(9);
        final TreeNode treeNode3 = new TreeNode(20);
        final TreeNode treeNode4 = new TreeNode(15);
        final TreeNode treeNode5 = new TreeNode(7);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode3.left = treeNode4;
        treeNode3.right = treeNode5;
        final int i = practice104.maxDepth(treeNode1);
        System.out.println(i);
    }
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int count = 1;
        ArrayList<Integer> depths = new ArrayList<>();
        depths = exploreAndCountDepth(count, root, depths);
        return Collections.max(depths);
    }

    private ArrayList<Integer> exploreAndCountDepth(Integer count, TreeNode root, ArrayList<Integer> depths) {
        if (root.left == null && root.right == null) {
            depths.add(count);
            return depths;
        }
        if (root.left != null) {
            int i = count + 1;
            exploreAndCountDepth(i, root.left, depths);
        }
        if (root.right != null) {
            int j = count + 1;
            exploreAndCountDepth(j, root.right, depths);
        }
        return depths;
    }
}
