import java.util.ArrayList;
import java.util.HashMap;

public class Practice804 {
    public static void main(String[] args) {
        String[] words = {"gin", "zen", "gig", "msg"};
        final Practice804 practice804 = new Practice804();
        final int i = practice804.uniqueMorseRepresentations(words);
        System.out.println(i);
    }
    String characterString = "abcdefghijklmnopqrstuvwxyz";
    String[] array = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

    public int uniqueMorseRepresentations(String[] words) {
        final ArrayList<String> morseCodesList = new ArrayList<>();
        for (String s : array) {
            morseCodesList.add(s);
        }
        final char[] chars = characterString.toCharArray();
        final ArrayList<Character> characterList = new ArrayList<>();
        for (Character c : chars) {
            characterList.add(c);
        }
        final HashMap<String, Integer> map = new HashMap<>();
        for (String s : words) {
            final StringBuilder sb = new StringBuilder();
            char[] wordCharacters = s.toCharArray();
            for (Character c : wordCharacters) {
                sb.append(morseCodesList.get(characterList.indexOf(c)));
            }
            if (map.get(String.valueOf(sb)) == null) {
                map.put(String.valueOf(sb),1);
            } else {
                map.put(String.valueOf(sb),map.get(String.valueOf(sb)) + 1);
            }
        }
        return map.size();
    }
}
