

import java.util.*;

public class Practice13 {
    public static void main(String[] args) {
        Practice13 practice13 = new Practice13();
        int arabicNum = practice13.romanToInt("MCMXCIV");
        System.out.println(arabicNum);
    }

    private static HashMap<String, Integer> hashMap = new HashMap<String, Integer>() {
        {
            put("I", 1);
            put("V", 5);
            put("X", 10);
            put("L", 50);
            put("C", 100);
            put("D", 500);
            put("M", 1000);
            put("IV", 4);
            put("IX", 9);
            put("XL", 40);
            put("XC", 90);
            put("CD", 400);
            put("CM", 900);
        }
    };
    private static ArrayList<String> specialComposition = new ArrayList<String>() {
        {
            add("IV");
            add("IX");
            add("XL");
            add("XC");
            add("CD");
            add("CM");
        }
    };

    public int romanToInt(String s) {
        ArrayList<String> containedSpecialComposition = new ArrayList<>();
        LinkedHashSet<String> set = new LinkedHashSet<>();
        Integer sum = 0;
        String after = s;
        set.add(s);
        String left = removeAndCollectContainedSpecialComposition(specialComposition, s, containedSpecialComposition, after);

        for (String str : containedSpecialComposition) {
            sum += hashMap.get(str);
        }
        if (left.equals("")) {
            return sum;
        }
        char[] chars = left.toCharArray();
        for (Character character : chars) {
            sum += hashMap.get(character.toString());
        }
        return sum;

    }

    private String removeAndCollectContainedSpecialComposition(ArrayList<String> allSpecialCompositions, String s, ArrayList<String> containedSpecialComposition, String after) {

        while (s.contains("IV") || s.contains("IX") || s.contains("XL") || s.contains("XC") || s.contains("CD") || s.contains("CM")) {
            for (String str : allSpecialCompositions) {
                after = s.replaceFirst(str, "");
                if (!s.equals(after)) {
                    containedSpecialComposition.add(str);
                }
                s = after;
            }
        }

        return s;
    }
}
