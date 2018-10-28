import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Practice122 {
    public static void main(String[] args) {
        int[] prices = {1, 2, 4, 2, 5, 7, 2, 4, 9, 0};
        Practice122 practice122 = new Practice122();
        int i = practice122.maxProfit(prices);
        System.out.println(i);
    }

    public int maxProfit(int[] prices) {
        int count = 0;
        if (prices == null || prices.length <= 1) {
            return 0;
        }
        HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();
        int from = prices[0];
        int to = prices[0];
        int direct = -1;
        for (int i = 0; i < prices.length; i++) {
            if (i == prices.length - 1) {
                break;
            }
            if (prices[i + 1] >= prices[i]) {
                direct = 0;
                to = prices[i + 1];
                if (i == prices.length - 2) {
                    count++;
                    HashMap<Integer, Integer> hashMap = new HashMap<>();
                    hashMap.put(from, to);
                    map.put(count, hashMap);
                }
                continue;
            } else {
                direct--;
                if (direct == -1) {
                    count++;
                    HashMap<Integer, Integer> hashMap = new HashMap<>();
                    hashMap.put(from, to);
                    map.put(count, hashMap);
                }
                from = prices[i + 1];
            }
        }
        Set<Map.Entry<Integer, HashMap<Integer, Integer>>> entries = map.entrySet();
        Integer sum = 0;
        for (Map.Entry<Integer, HashMap<Integer, Integer>> m : entries) {
            HashMap<Integer, Integer> value = m.getValue();
            Set<Map.Entry<Integer, Integer>> entrySet = value.entrySet();
            for (Map.Entry<Integer, Integer> e : entrySet) {
                sum += (e.getValue() - e.getKey());
            }
        }
        return sum;
    }
}
