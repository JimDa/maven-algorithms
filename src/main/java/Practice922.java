import java.util.ArrayList;

public class Practice922 {
    public int[] sortArrayByParityII(int[] A) {
        final ArrayList<Integer> oddNums = new ArrayList<>();
        final ArrayList<Integer> evenNums = new ArrayList<>();
        for (Integer i : A) {
            if (i % 2 == 0) {
                evenNums.add(i);
            } else {
                oddNums.add(i);
            }
        }
        final int[] result = new int[A.length];
        for (int i = 0; i < result.length; i++) {
            if (i % 2 == 0) {
                result[i] = evenNums.get(evenNums.size() - 1);
                evenNums.remove(evenNums.size() - 1);
            } else {
                result[i] = oddNums.get(oddNums.size() - 1);
                oddNums.remove(oddNums.size() - 1);
            }
        }
        return result;
    }
}
