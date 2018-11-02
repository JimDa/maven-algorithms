import java.util.ArrayList;


public class Practice203 {
    public static void main(String[] args) {
        Practice203 practice203 = new Practice203();
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l6 = new ListNode(6);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next = l2;
        l2.next = l6;
        l6.next = l3;
        l3.next = l4;
        l4.next = l5;
        ListNode listNode = new ListNode(6);
        l5.next = listNode;
        ListNode listNode1 = practice203.removeElements(l1, 6);
        System.out.println(listNode1);
    }

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ArrayList<ListNode> list = new ArrayList<>();
        while (head != null) {
            if (head.val != val) {
                list.add(head);
            }
            head = head.next;
        }
        if (list.size() > 1) {
            for (int i = 0; i < list.size() - 1; i++) {
                list.get(i).next = list.get(i + 1);
            }
            ListNode last = list.get(list.size() - 1);
            if (last.next != null && last.next.val == val) {
                last.next = null;
            }
            return list.get(0);
        } else {
            if (list.size() == 1) {
                if (list.get(0).next != null && list.get(0).next.val == val) {
                    list.get(0).next = null;

                }
                return list.get(0);
            } else {
                return null;
            }
        }
    }

}
