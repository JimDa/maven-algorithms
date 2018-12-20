public class Test {
    public static void main(String[] args) {
//        CompositionClass compositionClass = new CompositionClass();
//        A subA = new SubA();
//        subA.call();
//        ArrayList<String> strings = new ArrayList<String>() {
//            {
//                add("1");
//                add("111");
//                add("11");
//            }
//        };
//        Collections.sort(strings,Comparator.comparing(String::length));
//        System.out.println(strings);
//        System.out.println("123".substring(0,10));
//        System.out.println(5/2);
//        A subA = new SubA();
//        subA.call();
//        System.out.println(7 % 10);
//        System.out.println(433 / 10);
//        String a = null;
//        String s = "aaa" + a;
//        StringBuilder ss = new StringBuilder("aaa").append(a);
//        System.out.println(s);
//        System.out.println(ss);
//        System.out.println("heheheeheh");
//        System.out.println(null != "");
//        char[] chars = "Hello World".toCharArray();
//        for (Character c : chars) {
//            System.out.println(c);
//        }

//        String[] split = "Hello World ".split(" ");
//        int num = 1;
//        for (String s : split) {
//            System.out.println(num + ":" +s);
//            num++;
//        }
//        System.out.println("2.33".split("\\.").length);
//        System.out.println(null == null);
//        String[] split = " sss".split(" ");
//        System.out.println(split.length);
//        System.out.println("dffsdf0csacs".toUpperCase());
//        String[] strs = {"sss","ddd","ss"};
//        System.out.println(strs.toString());
//        System.out.println(22 % 26);
//        System.out.println("~");
//        final String[] es = "loveleetcode".split("e");
//        Arrays.stream(es).forEach(v-> System.out.println(v));
//        List<Integer> integers = new ArrayList<>();
//        integers.add(1);
//        integers.add(2);
//        integers.add(3);
//        integers.remove(0);
//        System.out.println(integers);


//        Calendar todayEnd = Calendar.getInstance();
//        todayEnd.set(Calendar.HOUR_OF_DAY, 23);
//        todayEnd.set(Calendar.MINUTE, 59);
//        todayEnd.set(Calendar.SECOND, 59);
//        todayEnd.set(Calendar.MILLISECOND, 999);
//        System.out.println(todayEnd.getTime());

//        ListNode l1 = new ListNode(1);
//        ListNode l2 = new ListNode(2);
//        ListNode l3 = new ListNode(3);
//        ListNode l4 = new ListNode(4);
//        ListNode ll3 = new ListNode(3);
//        ListNode ll2 = new ListNode(2);
//        ListNode ll1 = new ListNode(1);
//        l1.next = l2;
//        l2.next = l3;
//        l3.next = l4;
//        l4.next = ll3;
//        ll3.next = ll2;
//        ll2.next = ll1;
//        Test test = new Test();
//        boolean b = test.isPalindrome(l1);
//        System.out.println(b);
//    }
//
//    public boolean isPalindrome(ListNode head) {
//        if (head == null || head.next == null) {
//            return true;
//        }
//        ListNode slow = head;
//        ListNode fast = head;
//        while (fast.next != null && fast.next.next != null) {
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        ListNode reverseNode = reverseList(slow);
//        while (head != null && reverseNode != null) {
//            if (head.val != reverseNode.val) {
//                return false;
//            }
//            head = head.next;
//            reverseNode = reverseNode.next;
//        }
//        return true;
//    }
//
//    public ListNode reverseList(ListNode head) {
//        if (head == null) {
//            return head;
//        }
//        ListNode pre = head;
//        ListNode cur = head.next;
//        ListNode temp;
//        while (cur != null) {
//            temp = cur.next;
//            cur.next = pre;
//            pre = cur;
//            cur = temp;
//        }
//        head.next = null;
//        return pre;
//    }
//        int[] nms = {1,2,3,4,5};
//        System.out.println(nms.toString());
        System.out.println("1".equals(1));
        System.out.println(new Integer(1).equals("1"));

    }
}
