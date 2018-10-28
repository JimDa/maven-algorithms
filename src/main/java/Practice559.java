import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Practice559 {
    public int maxDepth(Node root) {
        ArrayList<Integer> depths = new ArrayList<>();
        int count = 0;
        exploreAndCount(root, depths, count);
        return Collections.max(depths);
    }

    private void exploreAndCount(Node root, ArrayList<Integer> depths, Integer count) {
        if (root == null) {
            if (!depths.contains(count)) {
                depths.add(count);
            }
        } else {
            if (!depths.contains(count + 1)) {
                depths.add(count + 1);
            }
            if (root.children != null && root.children.size() > 0) {
                List<Node> children = root.children;
                children.forEach(v -> exploreAndCount(v, depths, count + 1));
            }
        }
    }
}
