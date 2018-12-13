import java.util.ArrayList;
import java.util.HashSet;

public class Practice349 {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        Practice349 practice349 = new Practice349();
        int[] result = practice349.intersection(nums1, nums2);
        System.out.println(result.toString());
    }
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            set2.add(nums2[i]);
        }
        HashSet<Integer> shortSet = set1.size() < set2.size() ? set1 : set2;
        HashSet<Integer> longSet = set1.size() < set2.size() ? set2 : set1;
        int size = 0;
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer i : shortSet) {
            if (longSet.contains(i)) {
                size++;
                result.add(i);
            }
        }
        int[] ints = new int[size];
        for (int i = 0; i < size; i++) {
            ints[i] = result.get(i);
        }
        return ints;
    }
}
