import java.util.ArrayList;

public class StringTest {
    public static void main(String[] args) {
        final String str = new String("3");
        String s1 = str;
        String s2 = str;
        System.out.println(s1.hashCode() == s2.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(Integer.toHexString(s1.hashCode()));
        System.out.println(Integer.toHexString(s2.hashCode()));
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
        System.out.println("-----------------------------");

        final ArrayList<Object> objects = new ArrayList<>(3);
        System.out.println(objects.size());
        objects.add(1);
        System.out.println(objects.size());
//        Object o1 = (Object)s1;
//        Object o2 = (Object)s2;
//        System.out.println(s1.getBytes());
//        System.out.println(s2.getBytes());
    }
}
