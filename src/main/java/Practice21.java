
public class Practice21 {
    public static void main(String[] args) {
        ListNode l13 = new ListNode(4);
        ListNode l12 = new ListNode(2);
        ListNode l11 = new ListNode(1);
        l11.next = l12;
        l12.next = l13;
        ListNode l23 = new ListNode(4);
        ListNode l22 = new ListNode(3);
        ListNode l21 = new ListNode(1);
        l21.next = l22;
        l22.next = l23;
        Practice21 practice21 = new Practice21();
        ListNode listNode = practice21.mergeTwoLists(l11, l21);
        System.out.println(listNode);
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        Integer count = 1;
        if (l1 == null && l2 == null) {
            return null;
        }
        ListNode derivedListNode;
        if (l1 == null) {
            derivedListNode = new ListNode(l2.val);
        } else {
            derivedListNode = new ListNode(l1.val);
        }
        start(derivedListNode, l1, l2, count);
        return derivedListNode;

    }

    private void start(ListNode derivedListNode, ListNode l1, ListNode l2, Integer count) {
        if (count % 2 == 0) {
            if (l1 != null) {
                count++;
                derivedListNode.next = new ListNode(l1.val);
                start(derivedListNode.next, l1.next, l2, count);
            } else if (l2 != null) {
                count++;
                derivedListNode.next = new ListNode(l2.val);
                start(derivedListNode.next, null, l2.next, count);
            }
        } else {
            if (l2 != null) {
                count++;
                if (count == 2) {
                    if (l1 == null) {
                        if (l2.next == null) {
                            return;
                        }
                        derivedListNode.next = new ListNode(l2.next.val);
                        start(derivedListNode.next, null, l2.next, count);
                    }
                } else {
                    derivedListNode.next = new ListNode(l2.val);
                    start(derivedListNode.next, l1, l2.next, count);
                }
            } else if (l1 != null) {
                count++;
                derivedListNode.next = new ListNode(l1.val);
                start(derivedListNode.next, l1.next, null, count);
            }
        }
    }
}
