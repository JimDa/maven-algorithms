import java.util.ArrayList;
import java.util.HashMap;

public class Practice26 {
    public static void main(String[] args) {
        int[] integers = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        Practice26 practice26 = new Practice26();
        int i = practice26.removeDuplicates(integers);
        System.out.println(i);
    }

    public int removeDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>(nums.length);
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == null) {
                map.put(nums[i], 1);
                integers.add(nums[i]);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }
        for (int i = 0; i < integers.size(); i++) {
            nums[i] = integers.get(i);
        }
        return map.size();
    }
}
