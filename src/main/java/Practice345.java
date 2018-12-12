import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice345 {
//    private static final List<Character> VOWELS = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
//    public String reverseVowels(String s) {
//        if (null == s || s == "") {
//            return null;
//        }
//        char[] chars = s.toCharArray();
//        ArrayList<Integer> indexes = new ArrayList<>();
//        ArrayList<Character> characters = new ArrayList<>();
//        for (int i = 0; i < chars.length; i++) {
//            if (' ' == chars[i]) {
//                continue;
//            }
//            if (VOWELS.contains(chars[i])) {
//                indexes.add(i);
//                characters.add(chars[i]);
//            }
//        }
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < chars.length; i++) {
//            if (indexes.contains(i)) {
//                sb.append(characters.get(characters.size() - 1));
//                characters.remove(characters.size() - 1);
//            } else {
//                sb.append(chars[i]);
//            }
//        }
//        return sb.toString();
//    }

    public static final String VOWELS = "aeiouAEIOU";

    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            if (!VOWELS.contains(String.valueOf(chars[left]))) {
                left++;
                continue;
            }
            if (!VOWELS.contains(String.valueOf(chars[right]))) {
                right--;
                continue;
            }
            char temp;
            temp = chars[right];
            chars[right] = chars[left];
            chars[left] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }

}
