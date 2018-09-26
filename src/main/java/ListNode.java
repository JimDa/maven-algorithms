public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    String getString(StringBuffer stringBuffer , ListNode listNode) {
        if (listNode.next != null) {
            stringBuffer.append("  " + listNode.val);
            return getString(stringBuffer,listNode.next);
        } else {
            return stringBuffer.toString();
        }

    }

//    @Override
//    public String toString() {
//        StringBuffer stringBuffer = new StringBuffer();
//        return getString(stringBuffer,this);
//    }
}
