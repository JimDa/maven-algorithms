import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Practice107 {
    public static void main(String[] args) {
        final TreeNode treeNode1 = new TreeNode(0);
        final TreeNode treeNode2 = new TreeNode(2);
        final TreeNode treeNode3 = new TreeNode(4);
        final TreeNode treeNode4 = new TreeNode(1);
        final TreeNode treeNode5 = new TreeNode(3);
        final TreeNode treeNode6 = new TreeNode(-1);
        final TreeNode treeNode7 = new TreeNode(5);
        final TreeNode treeNode8 = new TreeNode(1);
        final TreeNode treeNode9 = new TreeNode(6);
        final TreeNode treeNode10 = new TreeNode(8);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.left = treeNode5;
        treeNode2.right = treeNode6;
        treeNode6.left = treeNode8;
        Practice107 practice107 = new Practice107();
        List<List<Integer>> lists = practice107.levelOrderBottom(treeNode1);
        System.out.println(lists);
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<List<Integer>> lists = new ArrayList<>();
        lists.add(new ArrayList<Integer>() {{
            add(root.val);
        }});
        ArrayList<Integer> list = new ArrayList<>();
        lists = begin(root.left, root.right, lists, list);
        Collections.reverse(lists);
        return lists;
    }

    private List<List<Integer>> begin(TreeNode left, TreeNode right, List<List<Integer>> lists, ArrayList<Integer> list) {
        ArrayList<Integer> list1 = new ArrayList<>();
        if (left != null) {
            list.add(left.val);
        }
        if (right != null) {
            list.add(right.val);
        }
        if (list.size() != 0 && !lists.contains(list)) {
            lists.add(list);
        }
        if (left != null) {
            begin(left.left, left.right, lists, list1);
        }
        if (right != null) {
            begin(right.left, right.right, lists, list1);
        }
        return lists;
    }
}
