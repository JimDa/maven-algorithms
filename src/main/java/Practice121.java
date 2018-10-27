import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Practice121 {
    public int maxProfit(int[] prices) {
        if (prices.length == 0 || prices.length == 1) {
            return 0;
        }
        ArrayList<Integer> pricesList = new ArrayList<>();
        Arrays.stream(prices).forEach(v -> pricesList.add(v));
        ArrayList<Integer> differences = new ArrayList<>();
        for (int i = 0; i < prices.length - 1; i++) {
            pricesList.remove(0);
            Integer max = Collections.max(pricesList);
            differences.add(max - prices[i]);
        }
        Integer max = Collections.max(differences);
        return max < 0 ? 0 : max;
    }
}
