public class Practice66 {
    public static void main(String[] args) {
        Practice66 practice66 = new Practice66();
        int[] ints = {1, 2, 3};
        int[] ints1 = practice66.plusOne(ints);
        System.out.println(ints1);
    }

    public int[] plusOne(int[] digits) {
        boolean flag = true;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (flag == false) {
                continue;
            }
            if (digits[i] == 9 && i != 0) {
                digits[i] = 0;
            } else if (digits[i] == 9 && i == 0) {
                int[] expandedDigits = new int[digits.length + 1];
                for (int j = 0; j < expandedDigits.length; j++) {
                    if (j == 0) {
                        expandedDigits[j] = 1;
                    } else {
                        expandedDigits[j] = digits[j - 1];
                    }
                    return expandedDigits;
                }
            } else {
                digits[i] += 1;
                flag = false;
            }
        }
        return digits;
    }
}
