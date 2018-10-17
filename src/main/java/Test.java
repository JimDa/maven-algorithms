import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
        String a = null;
        String s = "aaa" + a;
        StringBuilder ss = new StringBuilder("aaa").append(a);
        System.out.println(s);
        System.out.println(ss);
        System.out.println("heheheeheh");
        System.out.println(null != "");
    }
}
