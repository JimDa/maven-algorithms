import java.util.HashSet;

public class Practice141 {
    //HashSet会自动去重，这里会存储每个节点的引用
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> listNodes = new HashSet<>();
        while (head != null) {
            if (!listNodes.contains(head)) {
                listNodes.add(head);
                head = head.next;
            } else {
                return true;
            }
        }
        return false;
    }
}
