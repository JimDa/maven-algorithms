import java.util.Arrays;

public class Practice268 {
    public int missingNumber(int[] nums) {
//        Arrays.sort(nums);
//        int left = 0, right = nums.length, mid;
//        while (left < right) {
//            mid = (left + right) / 2;
//            if (nums[mid] > mid) {
//                right = mid;
//            } else {
//                left = mid + 1;
//            }
//        }
//        return left;

        int res = nums.length;
        for (int i = 0; i < nums.length; i++) {
            //res = res ^ i;
            res ^= i;
            //res = res ^ nums[i];
            res ^= nums[i];
        }
        return res;
    }
}
