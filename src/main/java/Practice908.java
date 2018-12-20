import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Practice908 {
    public static void main(String[] args) {
        Practice908 practice908 = new Practice908();
        int[] A = {0, 10};
        int K = 2;
        int i = practice908.smallestRangeI(A, K);
        System.out.println(i);
    }

    public int smallestRangeI(int[] A, int K) {
        if (A == null || A.length == 0 || A.length == 1) {
            return 0;
        }
        Arrays.sort(A);
        if (K <= 0) {
            return (A[A.length - 1] + K) - (A[0] - K);
        } else {
            return (A[A.length - 1] - K) - (A[0] + K);
        }
    }
}
