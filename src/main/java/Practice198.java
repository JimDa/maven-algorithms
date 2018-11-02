//public class Practice198 {
//    public static void main(String[] args) {
//        Practice198 practice198 = new Practice198();
//        int[] array = {1,2,3,1};
//        int rob = practice198.rob(array);
//        System.out.println(rob);
//    }
//    public int rob(int[] nums) {
//        if (nums == null || nums.length == 0) {
//            return 0;
//        }
//        if (nums.length <= 3) {
//            return nums[2] >= nums[1] + nums[3] ? nums[2] : nums[1] + nums[3];
//        }
//        int sum1 = nums[0];
//        int sum2 = nums[1];
//        int index1 = 0;
//        int index2 = 1;
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] < 0) {
//                continue;
//            } else {
//                if (i - index1 > 1) {
//                    sum1 = sum1 + nums[i];
//                    index1 = i;
//                } else {
//                    continue;
//                }
//
//            }
//        }
//        for (int i = 3; i < nums.length; i++) {
//            if (nums[i] < 0) {
//                continue;
//            } else {
//                if (i - index2 > 1) {
//                    sum2 = sum2 + nums[i];
//                    index2 = i;
//                } else {
//                    continue;
//                }
//
//            }
//        }
//        return sum1 >= sum2 ? sum1 : sum2;
//    }
//}
