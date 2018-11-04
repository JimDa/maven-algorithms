import java.util.ArrayList;
import java.util.List;

public class Practice590 {
    public static void main(String[] args) {
        Node node5 = new Node(5, new ArrayList<>());
        Node node0 = new Node(0, new ArrayList<>());
        Node node6 = new Node(6, new ArrayList<>());
        Node node10 = new Node(10, new ArrayList<Node>() {{
            add(node5);
            add(node0);
        }});
        Node node3 = new Node(3, new ArrayList<Node>() {
            {
                add(node6);
            }
        });
        Node node1 = new Node(1, new ArrayList<Node>() {{
            add(node10);
            add(node3);
        }});
        Practice590 practice590 = new Practice590();
        List<Integer> list = practice590.postorder(node1);
        System.out.println(list.toString());
    }

//    public List<Integer> postorder(Node root) {
//        if (root == null) {
//            return new ArrayList<Integer>();
//        }
//        int level = 0;
//        ArrayList<Content> result = new ArrayList<>();
//        result.add(new Content() {{
//            this.setLevel(level);
//            this.setVals(new ArrayList<Integer>() {{
//                add(root.val);
//            }});
//        }});
//        exploreAndAdd(level, result, root);
//        result.sort((Content c1, Content c2) -> c2.getLevel().compareTo(c1.getLevel()));
//        ArrayList<Integer> list = new ArrayList<>();
//        result.forEach(v -> {
//            v.getVals().forEach(x -> list.add(x));
//        });
//        return list;
//    }

//    private void exploreAndAdd(int level, ArrayList<Content> result, Node root) {
//        if (root != null) {
//            if (root.children != null && root.children.size() != 0) {
//                Content content = new Content();
//                ArrayList<Integer> integers = new ArrayList<>();
//                root.children.stream().forEach(v -> {
//                    integers.add(v.val);
//                    exploreAndAdd(level + 1, result, v);
//                });
//                content.setLevel(level + 1);
//                content.setVals(integers);
//                result.add(content);
//            }
//        }
//    }
//
//    static class Content {
//        int level;
//        ArrayList<Integer> vals;
//
//        protected void setLevel(Integer level) {
//            this.level = level;
//        }
//
//        protected Integer getLevel() {
//            return this.level;
//        }
//
//        protected void setVals(ArrayList<Integer> vals) {
//            this.vals = vals;
//        }
//
//        protected ArrayList<Integer> getVals() {
//            return this.vals;
//        }
//    }
public List<Integer> postorder(Node root) {
    List<Integer> ansList = new ArrayList<>();
    recursivePostorder(root, ansList);
    return ansList;
}

    void recursivePostorder(Node root, List<Integer> ansList) {
        if (root == null) return;
        if (root.children != null) {
            for (Node tmp : root.children) {
                recursivePostorder(tmp, ansList);
            }
        }
        ansList.add(root.val);
    }
}
