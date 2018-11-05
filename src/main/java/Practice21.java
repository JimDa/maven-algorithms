import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Practice21 {
//    public static void main(String[] args) {
//        ListNode l13 = new ListNode(4);
//        ListNode l12 = new ListNode(2);
//        ListNode l11 = new ListNode(1);
//        l11.next = l12;
//        l12.next = l13;
//        ListNode l23 = new ListNode(4);
//        ListNode l22 = new ListNode(3);
//        ListNode l21 = new ListNode(1);
//        l21.next = l22;
//        l22.next = l23;
//        Practice21 practice21 = new Practice21();
//        ListNode listNode = practice21.mergeTwoLists(l11, l21);
//        System.out.println(listNode);
//    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ArrayList<ListNode> listNodes = new ArrayList<>();
        while (l1 != null) {
            listNodes.add(l1);
            l1 = l1.next;
        }
        while (l2 != null) {
            listNodes.add(l2);
            l2 = l2.next;
        }
        if (listNodes.size() == 0) {
            return null;
        }

        Collections.sort(listNodes, new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });

        for (int i = 0; i < listNodes.size() - 1; i++) {
            listNodes.get(i).next = listNodes.get(i + 1);
        }
        return listNodes.get(0);

    }

    //        listNodes.sort((ListNode x1, ListNode x2) -> x1.getVal());
//    static class ListNode {
//        int val;
//        ListNode next;
//
//        ListNode(int x) {
//            val = x;
//        }
//        protected int getVal() {
//            return val;
//        }
//    }
}
