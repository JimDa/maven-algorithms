import java.util.ArrayList;
import java.util.Collections;

public class Practice3 {
    public static void main(String[] args) {
        Practice3 practice3 = new Practice3();
        int i = practice3.lengthOfLongestSubstring("au");
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
        uniqueChars.add(chars[0]);
        ArrayList<Integer> maxLengths = new ArrayList<>();
        int count = 1;
        for (int i = 1; i < chars.length; i++) {
            if (!uniqueChars.contains(chars[i]) && chars[i] != chars[i - 1]) {
                count++;
                uniqueChars.add(chars[i]);
                maxLengths.add(count);
            } else {
                maxLengths.add(count);
                uniqueChars.clear();
                uniqueChars.add(chars[i]);
                count = 1;
            }
        }
        return Collections.max(maxLengths);
    }
}
