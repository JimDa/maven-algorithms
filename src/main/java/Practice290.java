import java.util.ArrayList;
import java.util.HashMap;

public class Practice290 {
    public static void main(String[] args) {
        Practice290 ex = new Practice290();
        System.out.println(ex.wordPattern("abba", "dog dog dog dog"));
    }

    public boolean wordPattern(String pattern, String str) {
        int pl = pattern.length();
        int sl = str.split(" ").length;
        if (pl != sl) {
            return false;
        }
        char[] pchars = pattern.toCharArray();
        String[] split = str.split(" ");
        HashMap<Character, String> hashMap = new HashMap<>();
        ArrayList<Character> keys = new ArrayList<>();
        for (int i = 0; i < pchars.length; i++) {
            if (!keys.contains(pchars[i])) {
                keys.add(pchars[i]);
                if (hashMap.containsValue(split[i])) {
                    return false;
                }
                hashMap.put(pchars[i], split[i]);
            } else {
                if (i == 0) {
                    hashMap.put(pchars[i], split[i]);
                } else {
                    if (!split[i].equals(hashMap.get(pchars[i]))) {
                        return false;
                    } else {
                        continue;
                    }

                }
            }
        }
        return true;
    }
}
