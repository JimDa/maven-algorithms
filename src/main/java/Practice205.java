import java.util.HashMap;

public class Practice205 {
    public static void main(String[] args) {
        Practice205 practice205 = new Practice205();
        boolean isomorphic = practice205.isIsomorphic("ab", "aa");
        System.out.println(isomorphic);
    }

    public boolean isIsomorphic(String s, String t) {
        if (!(s != null && t != null)) {
            return false;
        }
        HashMap<Character, Character> map = new HashMap<>();
        char[] chars1 = s.toCharArray();
        char[] chars2 = t.toCharArray();
        for (int i = 0; i < chars1.length; i++) {
            if (map.get(chars1[i]) == null) {
                if (map.containsValue(chars2[i])) {
                    return false;
                }
                map.put(chars1[i], chars2[i]);
            } else {
                if (!String.valueOf(map.get(chars1[i])).equals(String.valueOf(chars2[i]))) {
                    return false;
                }
            }
        }
        return true;
    }
}
