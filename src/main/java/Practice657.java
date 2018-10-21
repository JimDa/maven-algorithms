import java.util.HashMap;

public class Practice657 {
    public static void main(String[] args) {
        final Practice657 practice657 = new Practice657();
        final boolean judge = practice657.judgeCircle("ud");
        System.out.println(judge);
    }

    public boolean judgeCircle(String moves) {
        char[] chars = moves.toCharArray();
        HashMap<String, Integer> map = new HashMap<>();
        for (Character c : chars) {
            String sc = String.valueOf(c);
            if (!map.containsKey(sc)) {
                map.put(sc, 1);
            } else {
                map.put(sc, map.get(sc) + 1);
            }
        }
        if ((map.get("U") == null ? 0 : map.get("U")) == (map.get("D") == null ? 0 : map.get("D")) && (map.get("L") == null ? 0 : map.get("L")) == (map.get("R") == null ? 0 : map.get("R"))) {
            return true;
        } else {
            return false;
        }
    }
}
