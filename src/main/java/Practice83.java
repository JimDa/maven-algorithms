import java.util.HashMap;

public class Practice83 {
    public ListNode deleteDuplicates(ListNode head) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        addDistinctValuesAndRemoveDuplicates(null, head, map);
        return head;
    }

    private void addDistinctValuesAndRemoveDuplicates(ListNode father, ListNode current, HashMap<Integer, Boolean> map) {
        if (current != null) {
            if (!map.containsKey(current.val)) {
                map.put(current.val, true);
                addDistinctValuesAndRemoveDuplicates(current, current.next, map);
            } else {
                father.next = current.next;
                addDistinctValuesAndRemoveDuplicates(father, current.next, map);
            }
        }
    }
}
