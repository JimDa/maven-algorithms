import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Test {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, UnsupportedEncodingException, BadPaddingException, IllegalBlockSizeException {
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
//        System.out.println("1".equals(1));
//        System.out.println(new Integer(1).equals("1"));
//        System.out.println(Calendar.getInstance().get(Calendar.MONTH));
//        int i = new Random().nextInt(3);
//        System.out.println(i);
//        System.out.println((Object)"3" + "0");
//
//
//        List<String> strings = Arrays.asList("sss", "sss1", "ddd");
//        ArrayList<String> strings1 = new ArrayList<>(strings);
//        //1.
//        for (String str :strings) {
//            if (str.contains("d")) {
//                strings.remove(str);
//            }
//        }

        //2.
//        for (String str : strings1) {
//            if (str.contains("d")) {
//                strings1.remove(str);
//            }
//        }

        //3.
//        System.out.println("ddd".contains("d"));
//        for (int j = 0; j < strings1.size(); j++) {
//            if (strings1.get(j).contains("d")) {
//                strings1.remove(j);
//            }
//        }
//        System.out.println(strings1.toString());

        HashMap<String, String> map = new HashMap() {{
            put("1", "aa");
            put("2", "bb");
            put("3", "ac");
            put("4", "bc");
        }};
        ConcurrentHashMap concurrentMap = new ConcurrentHashMap(map);
        Set<Map.Entry<String, String>> entries = map.entrySet();
        ArrayList<Map.Entry<String, String>> list = new ArrayList<>(entries);
        //1.
//        for (int j = 0; j < list.size(); j++) {
//            if (!list.get(j).getValue().contains("a")) {
//                map.remove(list.get(j).getKey());
//            }
//        }

        //2.
        for (Map.Entry<String, String> entry : list) {
            if (!entry.getValue().contains("a")) {
                map.remove(entry.getKey());
            }
        }

        //3.
//        for (Map.Entry<String, String> entry : list) {
//            if (!entry.getValue().contains("a")) {
//                concurrentMap.remove(entry.getKey());
//            }
//        }
//        System.out.println(map.size());
//        System.out.println(concurrentMap.size());
//        Integer x = new Integer(1);
//        final Integer a = x;
//        x--;
//        System.out.println(Byte.valueOf("0"));
//        System.out.println((byte)1);
//        byte b = new Integer(1).byteValue();
//        System.out.println(b);
//        System.out.println(String.format("https://parent-test.zhangmen.com/#/growthReport?param=%s","123"));
//        System.out.println(System.currentTimeMillis());
//        System.out.println(new Date());
//        LocalDateTime localDateTime = LocalDateTime.now();
//        int dayOfMonth = localDateTime.getDayOfMonth();
//        System.out.println(dayOfMonth);
//        System.out.println(localDateTime.getYear());
//        System.out.println(localDateTime.getMonthValue());
//        int dayOfYear = localDateTime.getDayOfYear();
//        System.out.println(dayOfYear);
//        LocalDateTime localDateTime1 = localDateTime.withYear(2018).withMonth(11);
//        LocalDateTime of = LocalDateTime.of(2018, 11, 1, 0, 0);
//        String yyyyMMdd = of.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
//        System.out.println(yyyyMMdd);
//        Float f = 0.6f;
//        System.out.println(String.valueOf(f * 100).concat("%"));
//        String s = String.valueOf(f);
//        String[] split = s.split("\\.");
//        System.out.println(split[1]);
//        System.out.println("0".endsWith("0"));
//        System.out.println(String.valueOf(f*100));

//        float p1 = 0.60000004f;
//        DecimalFormat df = new DecimalFormat("#.##");
//        System.out.println(df.format(p1 * 100));
//
//        System.out.println(Byte.valueOf("0").equals(null));
//        System.out.println(Byte.valueOf("0").byteValue() == 0);
//        System.out.println(new Byte("0").equals((byte)0));
//        System.out.println(LocalDateTime.now().getMonthValue());
//        System.out.println(LocalDateTime.now().minusMonths(1).getMonthValue());
//        LocalDateTime localDateTime = LocalDateTime.now().minusMonths(1);
//        int year = localDateTime.getYear();
//        int month = localDateTime.getMonthValue();
//        System.out.println(year);
//        System.out.println(month);
//
//        Object o = new Object();
//        Object o2 = new Object();
//        Object o3 = new Object();
//        Object o4 = new Object();

//        String mobile = "15295752976";
//        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
//        byte[] key = "phone-decrypt-recommend-2018A".getBytes("UTF-8");
//        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
//        MessageDigest sha = MessageDigest.getInstance("SHA-1");
//        key = sha.digest(key);
//        key = Arrays.copyOf(key, 16); // use only first 128 bit
//        try {
//            cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(key, "AES"));
//            byte[] bytes = cipher.doFinal(mobile.getBytes("UTF-8"));
//            String s = DatatypeConverter.printHexBinary(bytes);
//            System.out.println(s);
//        } catch (InvalidKeyException e) {
//            e.printStackTrace();
//        }

//        ArrayList<Integer> integers = new ArrayList<>();
//        List<Integer> collect = integers.stream().filter(v -> {return v.intValue()>0;}).collect(Collectors.toList());
//        System.out.println(collect.size());
//        System.out.println(collect.hashCode());

//        try {
//            String cipherText = AES4NodeJsUtils.encrypt("15295752976", "phone-decrypt-recommend-2018A");
//            System.out.println(cipherText);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        try {
//            String decrypt = Demo.decrypt("phone-decrypt-recommend-2018A", "21b4ff05610fa733cebd3369a04ea07b");
//            System.out.println(decrypt);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] thedigest = md.digest("phone-decrypt-recommend-2018A".getBytes("UTF-8"));
        KeyGenerator keygen = KeyGenerator.getInstance("AES");
//        SecureRandom secureRandom = new SecureRandom(thedigest);
        keygen.init(192);
//        SecretKey secretKey = keygen.generateKey();
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        byte[] input = "15295752976".getBytes("UTF-8");
        try {
//            byte[] encoded = secretKey.getEncoded();
            SecretKeySpec skeySpec = new SecretKeySpec(thedigest, "AES");
            cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
//            byte[] cipherText = new byte[cipher.getOutputSize(input.length)];
//
//            int ctLength = cipher.update(input, 0, input.length, cipherText, 0);
//
//            ctLength += cipher.doFinal(cipherText, ctLength);
            byte[] bytes = cipher.doFinal(input);

            String s = parseByte2HexStr(bytes);
            String s1 = new String(bytes);
            String s2 = DatatypeConverter.printHexBinary(bytes);
            String s3 = Base64.getEncoder().encodeToString(bytes);
            System.out.println("工具类转换的十六进制为-----------------" + s);
            System.out.println("DatatypeConverter转换的十六进制为-----" + s2);
            System.out.println("二进制为-----------------------------" + s1);
            System.out.println("Base64为-----------------------------" + s3);
//            cipher.init(Cipher.DECRYPT_MODE,secretKey);
//            byte[] bytes = s.getBytes("UTF-8");
//            byte[] cipherText1 = new byte[cipher.getOutputSize(bytes.length)];
//            int length = cipher.update(bytes, 0, bytes.length, cipherText1, 0);
//            ctLength += cipher.doFinal(cipherText1, length);
//            String s4 = parseByte2HexStr(cipherText1);
//            System.out.println(s4);
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        }

        System.out.println("sdfcom".contains("."));

        long yes = 1234567890123L;
        boolean acrossDay = Duration.between(LocalDateTime.ofInstant(new Date(yes).toInstant(), ZoneId.systemDefault()), LocalDateTime.now()).toDays() > 0;

        System.out.println("2.5.5".contains("2.5.5"));


    }

    private static String parseByte2HexStr(byte buf[]) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < buf.length; i++) {
            String hex = Integer.toHexString(buf[i] & 0xFF);
            if (hex.length() == 1) {
                hex = '0' + hex;
            }
            sb.append(hex);
        }
        return sb.toString();
    }



}
