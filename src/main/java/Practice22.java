import java.util.ArrayList;

public class Practice22 {
    public static void main(String[] args) {
        Practice22 practice22 = new Practice22();
        int[] nums = {3, 2, 2, 3};
        practice22.removeElement(nums, 3);
    }

    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                count++;
            } else {
                arrayList.add(nums[i]);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (i >= arrayList.size()) {
                nums[i] = val;
            } else {
                nums[i] = arrayList.get(i);
            }
        }
        return nums.length - count;
    }
}
