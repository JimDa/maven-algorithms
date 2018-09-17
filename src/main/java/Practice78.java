//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class Practice78 {
//    public List<List<Integer>> subsets(int[] nums) {
//        final ArrayList<List<Integer>> lists = new ArrayList<>();
//        for (int i = 0; i <= nums.length; i++) {
//            final ArrayList<Integer> list = new ArrayList<>(i);
//            for (int j = 0; j < nums.length; j++) {
//                if (list.size() == i) {
//                    continue;
//                } else {
//                    list.add(nums[j]);
//                }
//                lists.add(list);
//            }
//            if (lists.stream().filter(v->v.size() == i).collect(Collectors.toList()).size() < i) {
//                i--;
//            }
//        }
//    }
//}
