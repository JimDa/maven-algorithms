import java.util.ArrayList;
import java.util.Arrays;

public class Practice108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        ArrayList<Integer> numsList = new ArrayList<>();
        Arrays.stream(nums).forEach(v -> numsList.add(v));
        if (nums.length > 0) {
            TreeNode root = new TreeNode(nums[nums.length - 1]);
            numsList.remove(numsList.size()-1);
            return allocateNodes(root.left,root.right,numsList);
        } else {
            return null;
        }
    }

    private TreeNode allocateNodes(TreeNode left, TreeNode right, ArrayList<Integer> numsList) {
        return null;
    }
}
