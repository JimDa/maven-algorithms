import java.util.ArrayList;
import java.util.List;

public class Practice589 {
    public List<Integer> preorder(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        recursivePostorder(root, result);
        return result;
    }

    private void recursivePostorder(Node root, ArrayList<Integer> result) {
        if (root == null) {
            return;
        }
        result.add(root.val);
        if (root.children != null) {
            root.children.stream().forEach(v -> recursivePostorder(v, result));
        }
    }
}
