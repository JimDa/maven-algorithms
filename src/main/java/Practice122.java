import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Practice122 {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        Practice122 practice122 = new Practice122();
        int i = practice122.maxProfit(prices);
        System.out.println(i);
    }
    public int maxProfit(int[] prices) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int from = prices[0];
        int to = prices[0];
        int direct = 0;
        for (int i = 0; i < prices.length; i++) {
            if (i == prices.length - 2) {
                break;
            }
            if (prices[i + 1] >= prices[i]) {
                direct = 0;
                to = prices[i + 1];
                continue;
            } else {
                direct--;
                if (direct == -1) {
                    map.put(from,to);
                }
                from = prices[i + 1];
            }
        }
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        Integer sum = 0;
        for (Map.Entry<Integer, Integer> m : entries) {
            sum += (m.getValue() - m.getKey());
        }
        return sum;
    }
}
