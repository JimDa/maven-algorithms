import java.util.ArrayList;
import java.util.Collections;

public class Practice344 {
    public String reverseString(String s) {
        char[] chars = s.toCharArray();
        ArrayList<Character> characters = new ArrayList<Character>();
        for (Character ch : chars) {
            characters.add(ch);
        }
        Collections.reverse(characters);
        StringBuilder sb = new StringBuilder();
        characters.forEach(v -> sb.append(v));
        return sb.toString();
    }
}
