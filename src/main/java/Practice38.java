import java.util.HashMap;

public class Practice38 {
    private static HashMap<Integer, String> container = new HashMap<>();

    public String countAndSay(int n) {
        int x = n;
        if (container.get(x) != null) {
            return container.get(x);
        } else {
            x--;
        }
        while ( x > 1) {
            if (container.get(x) == null) {
                x--;
            } else {

            }
        }

        return container.get(n);
    }
}
