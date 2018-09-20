//import java.util.*;
//
///**
// * @author Administrator
// */
//public class Practice20 {
//    public static void main(String[] args) {
//        Practice20 practice20 = new Practice20();
//        System.out.println(practice20.isValid("(([]){})"));
//    }
//
//    private static HashMap<String, String> hashMap = new HashMap<String, String>() {
//        {
//            put("(", ")");
//            put("{", "}");
//            put("[", "]");
//        }
//    };
//    private static ArrayList<String> left = new ArrayList<String>() {
//        {
//            add("(");
//            add("{");
//            add("[");
//        }
//    };
//
//    public boolean isValid(String s) {
//        char[] chars = s.toCharArray();
//        ArrayList<String> all = new ArrayList<>();
//        HashMap<Integer, String> keys = new HashMap<>();
//        HashMap<Integer, String> values = new HashMap<>();
//        if (chars.length % 2 == 0) {
//            for (int i = 0; i < chars.length; i++) {
//                String element = String.valueOf(chars[i]);
//                all.add(element);
//                if (left.contains(element)) {
//                    keys.put(all.indexOf(element), element);
//                } else {
//                    values.put(all.indexOf(element), element);
//                }
//            }
//            if (keys.size() == chars.length / 2) {
//                Set<Map.Entry<Integer, String>> entries = keys.entrySet();
//                ArrayList<String> legalValues = new ArrayList<>();
//                for (Map.Entry<Integer, String> map : entries) {
//                    legalValues.add(map.getValue());
//                }
//                Set<Map.Entry<Integer, String>> entries1 = values.entrySet();
//                for (Map.Entry<Integer, String> map : entries1) {
//                    if (!legalValues.contains(map.getValue())) {
//                        return false;
//                    }
//                }
//
//                for (Map.Entry<Integer, String> map : entries) {
//                    String left = map.getValue();
//                    Integer leftIndex = map.getKey();
//                    if ((all.indexOf(hashMap.get(left)) - leftIndex) == 1) {
//                        continue;
//                    }
//                    if ((leftIndex - all.indexOf(hashMap.get(left))) % 2 == 0) {
//                        return false;
//                    }
//                    for (int i = leftIndex + 1; i < (all.indexOf(hashMap.get(left)) + leftIndex + 1) / 2; i++) {
//
//                    }
//                }
//                return true;
//            }
//        }
//        return false;
//    }
//}
