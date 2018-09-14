

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;



public class Practice535 {

    private static HashMap map = new HashMap<String,String>();
    private static Integer atomicInteger = new Integer(1);

    public String encode(String longUrl){
        StringBuilder originalAddress = new StringBuilder();
        StringBuilder stringBuilder = new StringBuilder();
        String[] split = longUrl.split("/");
        for (int i = 0; i < split.length; i++) {
            if (i >= 3) {
                map.put(String.valueOf(atomicInteger), split[i]);
                stringBuilder.append("/" + atomicInteger);
                atomicInteger++;
                continue;
            }
            originalAddress.append("/" + split[i]);

        }
        String result = originalAddress.append(stringBuilder).toString().replaceFirst("/", "");
        if (longUrl.endsWith("/")) {
            result+="/";
        }
        System.out.println(result);
        return result;
//        ArrayList<String> strings = new ArrayList<String>();
//        String s1 = new String("2");
//        strings.add("1");
//        strings.add(s1);
//        strings.add("3");
//        String s = new String("2");
//        System.out.println(strings.contains(s));
//        System.out.println(s1 == s);
//        System.out.println(s.hashCode());
//        System.out.println(s1.hashCode());
//        list.addAll(Arrays.asList(split));
//        String string = Arrays.toString(split);
//        System.out.println(atomicInteger);
//        return string;
    }

    public static void main(String[] args){
//        Practice535 practice535 = new Practice535();
//        String decode = practice535.decode(practice535.encode("https://leetcode.com/problems/design-tinyurl"));
//        System.out.println(decode);
//        UUID uuid = UUID.randomUUID();
//        System.out.println(uuid);

        String s1 = new String("2");
        String s2 = new String("2");
        System.out.println(s1.hashCode() == s2.hashCode());
        System.out.println(System.identityHashCode(s1) == System.identityHashCode(s2));
        TestObject ts1 = new TestObject(1);
        TestObject ts2 = new TestObject(1);
        System.out.println(ts1.hashCode());
        System.out.println(System.identityHashCode(ts1));
        System.out.println("---------------------------------------");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println("---------------------------------------");
        System.out.println(s1.hashCode());
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(s1.hashCode() == s2.hashCode());
        System.out.println(s1.equals(s2));
        System.out.println(s1 ==s2);
        System.out.println("2" == "2");
//        System.out.println(UUID.randomUUID());

    }

    public String decode(String shortUrl) {
        String[] split = shortUrl.split("/");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < split.length; i++) {

            if (i >= 3) {
                String s = (String) map.get(String.valueOf(split[i]));
                System.out.println(s);
                stringBuilder.append( "/" + s);
                continue;
            }
            stringBuilder.append("/" + split[i]);
        }
        if (shortUrl.endsWith("/")) {
            stringBuilder.append("/");
        }
        return stringBuilder.toString().replaceFirst("/" , "");
    }

    static class TestObject {
        private Integer i;

        public TestObject(Integer i) {
            this.i = i;
        }
    }

}
