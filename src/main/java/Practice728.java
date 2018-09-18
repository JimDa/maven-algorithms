

import java.util.ArrayList;
import java.util.List;

public class Practice728 {
    public static void main(String[] args) {
        final Practice728 p = new Practice728();
        final List<Integer> integers = p.selfDividingNumbers(1, 22);
        System.out.println(integers);

    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (String.valueOf(i).contains("0")) {
                continue;
            }
            if (canBeDividedByEveryDigitNum(i, i)) {
                list.add(i);
            }
        }
        return list;
    }

    private boolean canBeDividedByEveryDigitNum(int i, int b) {
        int digitNum = b % 10;
        if (i % digitNum == 0 && b > 10) {
            return canBeDividedByEveryDigitNum(i, b / 10);
        }
        if (i % digitNum != 0) {
            return false;
        } else {
            return true;
        }
    }
}
