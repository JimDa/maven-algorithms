import java.util.ArrayList;
import java.util.Collections;

public class Practice4 {
    public static void main(String[] args) {
        Practice4 practice4 = new Practice4();
        int[] a1 = {1, 2};
        int[] a2 = {3,4};
        double d = practice4.findMedianSortedArrays(a1, a2);
        System.out.println(d);
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Double> numsList1 = new ArrayList<>();
        ArrayList<Double> numsList2 = new ArrayList<>();
        for (Integer num1 : nums1) {
            numsList1.add(new Double(num1));
        }
        for (Integer num2 : nums2) {
            numsList2.add(new Double(num2));
        }
        numsList1.addAll(numsList2);
        Collections.sort(numsList1);
        if (numsList1.size() % 2 == 0) {
            return (numsList1.get(numsList1.size() / 2 - 1) + numsList1.get(numsList1.size() / 2)) / 2;
        } else {
            return numsList1.get(numsList1.size()/2);
        }
    }
}
