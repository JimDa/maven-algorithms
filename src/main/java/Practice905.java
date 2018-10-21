import java.util.ArrayList;

public class Practice905 {
    public int[] sortArrayByParity(int[] A) {
        final ArrayList<Integer> oddNums = new ArrayList<>();
        final ArrayList<Integer> evenNums = new ArrayList<>();
        int[] resultArray = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                evenNums.add(A[i]);
            } else {
                oddNums.add(A[i]);
            }
        }
        for (int i = 0; i < resultArray.length; i++) {
            if (i < evenNums.size()) {
                resultArray[i] = evenNums.get(i);
            } else {
                resultArray[i] = oddNums.get(i - evenNums.size());
            }
        }
        return resultArray;
    }
}
