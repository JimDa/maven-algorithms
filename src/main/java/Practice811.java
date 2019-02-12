import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Practice811 {
    public static void main(String[] args) {
        String[] example = {"9001 discuss.leetcode.com"};
        Practice811 practice811 = new Practice811();
        final List<String> strings = practice811.subdomainVisits(example);
        System.out.println(strings.toString());
    }
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String, Integer> map = new HashMap<>();
        Arrays.stream(cpdomains).forEach(v -> {
            String[] split = v.split(" ");
            Integer num = Integer.valueOf(split[0]);
            String full = split[1];
            if (!map.containsKey(full)) {
                map.put(full, num);
            } else {
                map.put(full, map.get(full) + num);
            }
            String[] domains = full.split("\\.");
            int length = domains.length;
            int count = 0;
            String sub = "";
            while (length > 1) {
                sub = full.replace(domains[count] + ".", "");
                if (map.containsKey(sub)) {
                    map.put(sub,map.get(sub) + num);
                } else {
                    map.put(sub,num);
                }
                count++;
                full = sub;
                length--;
            }
        });
        ArrayList<String> result = new ArrayList<>();
        map.keySet().stream().forEach(v->result.add((String.valueOf(map.get(v))+" ").concat(v)));
        return result;
    }
}
