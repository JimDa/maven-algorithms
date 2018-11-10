import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Practice283 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        Practice283 practice283 = new Practice283();
        practice283.moveZeroes(arr);
        System.out.println(arr);
    }

    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 1) {
            return;
        }
        ArrayList<Integer> integers = new ArrayList<>();
        Arrays.stream(nums).forEach(v->{
            if (v!= 0) {
                integers.add(v);
            }
        });
        for (int i = 0; i < nums.length; i++) {
            if (i < integers.size()) {
                nums[i] = integers.get(i);
            } else {
                nums[i] = 0;
            }
        }
    }
}
