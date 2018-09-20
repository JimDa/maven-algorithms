//import java.util.*;
//
////该解法超时了
//public class Practice15 {
//    public static void main(String[] args) {
//        Practice15 practice15 = new Practice15();
//        int[] nums = {-13,10,11,-3,8,11,-4,8,12,-13,5,-6,-4,-2,12,11,7,-7,-3,10,12,13,-3,-2,6,-1,14,7,-13,8,14,-10,-4,10,-6,11,-2,-3,4,-13,0,-14,-3,3,-9,-6,-9,13,-6,3,1,-9,-6,13,-4,-15,-11,-12,7,-9,3,-2,-12,6,-15,-10,2,-2,-6,13,1,9,14,5,-11,-10,14,-5,11,-6,6,-3,-8,-15,-13,-4,7,13,-1,-9,11,-13,-4,-15,9,-4,12,-4,1,-9,-5,9,8,-14,-1,4,14};
//        List<List<Integer>> lists = practice15.threeSum(nums);
//        System.out.println(lists);
//    }
//    public List<List<Integer>> threeSum(int[] nums) {
//        if (nums.length < 3) {
//            return Collections.EMPTY_LIST;
//        }
//        ArrayList<Integer> indexes = new ArrayList<>();
//        ArrayList<Integer> original = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            original.add(nums[i]);
//        }
//        Collections.sort(original);
//        int minimum = original.get(0);
//        int maximum = original.get(original.size() - 1);
//        HashSet<ArrayList<Integer>> resultSet = new HashSet<>();
//        for (int i = 0; i < nums.length; i++) {
//            indexes.add(i);
//            for (int j = 0; j < nums.length; j++) {
//                if (j == i) {
//                    continue;
//                }
//                if (nums[i] + nums[j] > maximum || nums[i] + nums[j] < minimum) {
//                    continue;
//                }
//                indexes.add(j);
//                for (int k = 0; k < nums.length; k++) {
//                    if (indexes.contains(k)) {
//                        continue;
//                    }
//                    if (nums[i] + nums[j] + nums[k] == 0) {
//                        ArrayList<Integer> list = new ArrayList<>();
//                        list.add(nums[i]);
//                        list.add(nums[j]);
//                        list.add(nums[k]);
//                        Collections.sort(list);
//                        resultSet.add(list);
//                    }
//                }
//
//            }
//            indexes.clear();
//        }
//        return new ArrayList<>(resultSet);
//    }
//}
