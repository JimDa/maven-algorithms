import java.util.ArrayList;
import java.util.Collections;

public class Practice88 {
    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        Practice88 practice88 = new Practice88();
        practice88.merge(nums1, m, nums2, n);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> allNums = new ArrayList<>(m + n);
        for (int i = 0; i < m; i++) {
            allNums.add(nums1[i]);
        }
        for (int i = 0; i < n; i++) {
            allNums.add(nums2[i]);
        }
        Collections.sort(allNums);
        for (int i = 0; i < allNums.size(); i++) {
            nums1[i] = allNums.get(i);
        }
    }
}
