import java.util.Arrays;
import java.util.HashMap;

public class Practice929 {
    public static void main(String[] args) {
        Practice929 practice929 = new Practice929();
        String[] strings = {"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};
        final int i = practice929.numUniqueEmails(strings);
        System.out.println(i);
    }

    public int numUniqueEmails(String[] emails) {
        if (emails == null || emails.length == 0) {
            return 0;
        }
        HashMap<String, Integer> map = new HashMap<>();
        Arrays.stream(emails).forEach(v -> handleString(v, map));
        return map.size();
    }

    private HashMap<String, Integer> handleString(String v, HashMap<String, Integer> map) {
        String[] nameAndHost = v.split("@");
        String name = nameAndHost[0];
        String host = nameAndHost[1];
        String[] names = name.split("\\+");
        String replace = names[0].replace(".", "");
        String result = replace.concat("@" + host);
        if (!map.containsKey(result)) {
            map.put(result, 1);
        }
        return map;
    }
}
