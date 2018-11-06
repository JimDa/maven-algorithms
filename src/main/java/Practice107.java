//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.HashMap;
//import java.util.List;
//
//public class Practice107 {
//    public static void main(String[] args) {
//        final TreeNode treeNode1 = new TreeNode(0);
//        final TreeNode treeNode2 = new TreeNode(2);
//        final TreeNode treeNode3 = new TreeNode(4);
//        final TreeNode treeNode4 = new TreeNode(1);
//        final TreeNode treeNode5 = new TreeNode(3);
//        final TreeNode treeNode6 = new TreeNode(-1);
//        final TreeNode treeNode7 = new TreeNode(5);
//        final TreeNode treeNode8 = new TreeNode(1);
//        final TreeNode treeNode9 = new TreeNode(6);
//        final TreeNode treeNode10 = new TreeNode(8);
//        treeNode1.left = treeNode2;
//        treeNode1.right = treeNode3;
//        treeNode2.left = treeNode4;
//        treeNode2.left = treeNode5;
//        treeNode2.right = treeNode6;
//        treeNode6.left = treeNode8;
//        Practice107 practice107 = new Practice107();
//        List<List<Integer>> lists = practice107.levelOrderBottom(treeNode1);
//        System.out.println(lists);
//    }
//
//    public List<List<Integer>> levelOrderBottom(TreeNode root) {
//        Integer level = 0;
//        List<HashMap<Integer, ArrayList<Integer>>> maps = new ArrayList<>();
//        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
//        exploreAndAdd(root, map, maps, level);
//
//        return lists;
//
//    }
//
//    private void exploreAndAdd(TreeNode root, HashMap<Integer, ArrayList<Integer>> map, List<HashMap<Integer, ArrayList<Integer>>> maps, Integer level) {
//        if (root == null) return;
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(root.val);
//        map.put(level + 1, list);
//        maps.add(map);
//        if (!maps.contains(map)) {
//            maps.add(map);
//        } else {
//
//        }
//        ArrayList<Integer> subList = new ArrayList<>();
//        exploreAndAdd(root.left, subList, lists);
//        exploreAndAdd(root.right, subList, lists);
//    }
//}
