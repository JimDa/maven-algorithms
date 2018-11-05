import java.util.ArrayList;

public class Practice206 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        Practice206 practice206 = new Practice206();
        ListNode listNode = practice206.reverseList(l1);
        System.out.println(listNode);
    }

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ArrayList<ListNode> listNodes = new ArrayList<>();
        ListNode root = head;
        listNodes.add(head);
        listNodes.add(head.next);
        head = head.next;
        while (head != null) {
            if (head.next != null) {
                listNodes.add(head.next);
                head.next = listNodes.get(0);
                listNodes.remove(0);
                head = listNodes.get(1);
            } else {
                head.next = listNodes.get(0);
                break;
            }
        }
        root.next = null;
        return head;
    }
}
