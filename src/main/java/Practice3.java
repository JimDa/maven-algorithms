import java.util.*;


public class Practice3 {
    public static void main(String[] args) {
        Practice3 practice3 = new Practice3();
        int i = practice3.lengthOfLongestSubstring("bbtablud");
        System.out.println(i);
    }

    public int lengthOfLongestSubstring(String s) {
        if (s.equals("")) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }
        char[] chars = s.toCharArray();
        ArrayList<Character> uniqueChars = new ArrayList<>();
        uniqueChars.add(0, chars[0]);
        ArrayList<Integer> maxLengths = new ArrayList<>(s.length());
        int count = 1;
        for (int i = 1; i < chars.length; i++) {
            if (!uniqueChars.contains(chars[i]) && chars[i] != chars[i - 1]) {
                uniqueChars.add(i, chars[i]);
                maxLengths.add(count);
            } else {
                Integer index = uniqueChars.indexOf(chars[i]);
                for (int j = 0; j < uniqueChars.size(); j++) {
                    if (j <= index && uniqueChars.get(j) != null) {
                        uniqueChars.set(j, null);
                    }
                }
                if (chars[i] == chars[i - 1]) {
                    count = 1;
                } else {
                    count = i - uniqueChars.indexOf(chars[i]);
                }
                uniqueChars.add(i, chars[i]);
                maxLengths.add(count);
            }
            count++;
        }
        return Collections.max(maxLengths);
    }
}
