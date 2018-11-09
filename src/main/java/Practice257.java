import java.util.ArrayList;
import java.util.List;

public class Practice257 {
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> paths = new ArrayList<>();
        if (root == null) {
            return paths;
        }
        String path = String.valueOf(root.val);
        paths.add(path);
        exploreAndConcat(root.left, path, paths);
        exploreAndConcat(root.right, path, paths);
        if (paths.size() > 1) {
            paths.remove(0);
        }
        return paths;
    }

    private void exploreAndConcat(TreeNode root, String path, ArrayList<String> paths) {
        if (root == null) {
            return;
        } else {
            path = path.concat("->" + root.val);
            if (root.left == null && root.right == null) {
                paths.add(path);
            } else {
                exploreAndConcat(root.left, path, paths);
                exploreAndConcat(root.right, path, paths);
            }
        }
    }
}
