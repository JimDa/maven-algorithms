import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Practice561 {
    public int arrayPairSum(int[] nums) {
//        final ArrayList<Integer> list = new ArrayList<>();
//        Arrays.stream(nums).forEach(v -> list.add(v));
//        Collections.sort(list);
//        int sum = 0;
//        for (int i = 0; i < list.size(); i++) {
//            if (i % 2 != 1) {
//                sum += list.get(i);
//            }
//        }
//        return sum;
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 != 1) {
                sum += nums[i];
            }
        }
        return sum;
    }
}
