import java.util.HashMap;

public class Practice100 {
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
        Practice100 practice100 = new Practice100();
        boolean result = practice100.isSameTree(treeNode1, treeNode4);
        System.out.println(result);
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        HashMap<Boolean, Integer> map = new HashMap<>(2);
        return compare(p, q, map);
    }

    private boolean compare(TreeNode p, TreeNode q, HashMap<Boolean, Integer> map) {
        if (p != null && q != null) {
            if (p.val == q.val) {
                compare(p.left, q.left, map);
                compare(p.right, q.right, map);
            } else {
                map.put(false, 1);
                return false;
            }
        } else {
            if (p == null && q == null) {
                map.put(true, 1);
                return true;
            } else {
                map.put(false, 1);
                return false;
            }
        }
        return !map.containsKey(false);
    }
}
