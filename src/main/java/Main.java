import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(4);
        listNode2.next = listNode1;
        listNode1.next = listNode;
        ListNode listNodec = new ListNode(1);
        ListNode listNodeb = new ListNode(3);
        ListNode listNodea = new ListNode(4);
        listNodea.next = listNodeb;
        listNodeb.next = listNodec;
        ListNode result = addTwoNumbers(listNode2, listNodea);
        System.out.println(result.toString());

    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1 = addAllNodes(list1, l1);
        list2 = addAllNodes(list2, l2);

        Collections.reverse(list1);
        Collections.reverse(list2);
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        list1.forEach(v -> {
            sb1.append(v);
        });
        list2.forEach(v -> {
            sb2.append(v);
        });
        long sum1 = Long.parseLong(sb1.toString().trim());
        long sum2 = Long.parseLong(sb2.toString().trim());
        long total = sum1 + sum2;
        char[] chars = String.valueOf(total).toCharArray();
        ArrayList<Integer> ints = new ArrayList<>();
        for (Character character : chars) {
            ints.add(Character.getNumericValue(character));
        }
        ListNode result = new ListNode(ints.get(ints.size() - 1));
        ints.remove(ints.size() - 1);
        convertArrayList2ListNode(ints, result);
        return result;

    }

    private static void convertArrayList2ListNode(ArrayList<Integer> ints, ListNode listNode) {
        if (ints.size() > 0) {
            listNode.next = new ListNode(ints.get(ints.size() - 1));
            ints.remove(ints.get(ints.size() - 1));
            convertArrayList2ListNode(ints, listNode.next);
        } else {
            return;
        }

    }

    private static ArrayList<Integer> addAllNodes(ArrayList<Integer> list, ListNode listNode) {
        list.add(listNode.val);
        if (listNode.next == null) {
            return list;
        } else {
            return addAllNodes(list, listNode.next);
        }
    }
}
