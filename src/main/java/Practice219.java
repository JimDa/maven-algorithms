import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Practice219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(nums[i], list);
            } else {
                ArrayList<Integer> list = map.get(nums[i]);
                list.add(i);
                map.put(nums[i], list);
            }
        }
        Set<Map.Entry<Integer, ArrayList<Integer>>> entries = map.entrySet();
        for (Map.Entry<Integer, ArrayList<Integer>> entry : entries) {
            ArrayList<Integer> indexesList = entry.getValue();
            if (indexesList.size() >= 2) {
                for (int i = 0; i < indexesList.size() - 1; i++) {
                    Integer x1 = indexesList.get(i);
                    for (int j = i + 1; j < indexesList.size(); j++) {
                        Integer x2 = indexesList.get(j);
                        if (x1 >= x2) {
                            if ((x1 - x2) <= k) {
                                return true;
                            }
                        } else {
                            if ((x2 - x1) <= k) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
