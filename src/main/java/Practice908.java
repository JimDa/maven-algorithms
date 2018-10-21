import java.util.ArrayList;
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
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = -1 * K; i <= K; i++) {
            for (int j = 0; j < A.length; j++) {
                list.add(A[j] + i);
            }
        }

        Integer max = Collections.max(list);
        Integer min = Collections.min(list);
        return max - min;
    }
}
