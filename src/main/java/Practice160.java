import java.util.HashSet;

public class Practice160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        } else {
            HashSet<ListNode> listNodes = new HashSet<>();
            while (headA.next != null) {
                listNodes.add(headA);
                headA = headA.next;
            }
            listNodes.add(headA);
            if (listNodes.contains(headB)) {
                return headB;
            } else {
                while (headB.next != null) {
                    if (listNodes.contains(headB)) {
                        return headB;
                    } else {
                        headB = headB.next;
                    }
                }
                if (listNodes.contains(headB)) {
                    return headB;
                }
            }
            return null;
        }
    }
}
