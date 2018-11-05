import java.util.HashSet;

public class Practice217 {
    public static void main(String[] args) {
        Practice217 practice217 = new Practice217();
        int[] arr = {1, 2, 3, 1};
        boolean b = practice217.containsDuplicate(arr);
        System.out.println(b);
    }

    public boolean containsDuplicate(int[] nums) {
        if (nums == null) {
            return false;
        }
        if (nums.length == 0) {
            return false;
        }
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashSet.contains(nums[i])) {
                return true;
            } else {
                hashSet.add(nums[i]);
            }
        }
        return false;
    }
}
