//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.stream.Collectors;
//
//public class Practice21 {
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
//
//    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
////        Integer count = 1;
////        if (l1 == null && l2 == null) {
////            return null;
////        }
////        ListNode derivedListNode;
////        if (l1 == null) {
////            derivedListNode = new ListNode(l2.val);
////        } else {
////            derivedListNode = new ListNode(l1.val);
////        }
////        start(derivedListNode, l1, l2, count);
//        ArrayList<ListNode> listNodes = new ArrayList<ListNode>() {
//            {
//                add(l1);
//                add(l2);
//            }
//        };
//        ListNode derivedListNode;
//        if (l1 == null) {
//            derivedListNode = new ListNode(l2.val);
//            listNodes.remove(l1);
//        } else {
//            derivedListNode = new ListNode(l1.val);
//            if (l2 == null) {
//                listNodes.remove(l2);
//            }
//        }
//
//        return start(derivedListNode, listNodes);
//
//    }
//
//    private ListNode start(ListNode derivedListNode, ArrayList<ListNode> listNodes) {
//        for (ListNode listNode : listNodes) {
//            if (listNode == null) {
//                continue;
//            }
//            derivedListNode.val = listNode.val;
//            Collections.replaceAll(listNodes, listNode, listNode.next);
//            return start(derivedListNode, listNodes);
//        }
//        if (listNodes.stream().filter(v -> v != null).collect(Collectors.toList()).size() != 0) {
//            start(derivedListNode, listNodes);
//        }
//    }
//}
