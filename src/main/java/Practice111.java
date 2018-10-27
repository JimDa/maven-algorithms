import java.util.ArrayList;
import java.util.Collections;

public class Practice111 {
    public int minDepth(TreeNode root) {
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) {
            return count;
        } else {
            list = exploreAndCount(root.left, root.right, list, count);
        }
        return Collections.min(list);
    }

    private ArrayList<Integer> exploreAndCount(TreeNode left, TreeNode right, ArrayList<Integer> list, int count) {
        if (left == null && right == null) {
            list.add(count + 1);
        } else {
            if (left != null) {
                exploreAndCount(left.left, left.right, list, count + 1);
            }
            if (right != null) {
                exploreAndCount(right.left, right.right, list, count + 1);
            }
        }
        return list;
    }
}
