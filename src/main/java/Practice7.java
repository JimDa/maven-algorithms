public class Practice7 {
    public static void main(String[] args) {
        Practice7 practice7 = new Practice7();
        System.out.println(practice7.reverse(1534236469));
    }
    public int reverse(int x) {
        Integer num = 0;
        num = countEndWith0Amount(x, num);
        char[] chars = String.valueOf(x).toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--) {
            sb.append(chars[i]);
        }
        if (x < 0) {
            String result = sb.substring(0 + num, sb.length() - 1);
            if (Long.valueOf(result) > 2147483648L) {
                return 0;
            }
            return Integer.valueOf(sb.substring(0 + num, sb.length() - 1)) * -1;
        } else {
            String result = sb.substring(0 + num, sb.length());
            if (Long.valueOf(result) > 2147483647) {
                return 0;
            }
            return Integer.valueOf(sb.substring(0 + num, sb.length()));
        }
    }

    private int countEndWith0Amount(int x, int num) {
        if (x == 0) {
            return 0;
        }
        if (x % 10 == 0) {
            num++;
            countEndWith0Amount(x / 10, num);
        }
        return num;
    }
}
