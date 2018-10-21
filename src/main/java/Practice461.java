public class Practice461 {
    public static void main(String[] args) {
        int a = 1;
        int b = 4;
        final Practice461 practice461 = new Practice461();
        final int i = practice461.hammingDistance(a, b);
        System.out.println(i);
    }
    public int hammingDistance(int x, int y) {
        String s1 = "";
        String s2 = "";
        s1 = convertDecimal2BinaryString(x, s1);
        s2 = convertDecimal2BinaryString(y, s2);
        int i = s1.length() - s2.length();
        if (i != 0) {
            final StringBuilder sb = new StringBuilder();
            for (int j = 0; j < (i > 0? i : -1*i); j++) {
                sb.append("0");
            }
            if (i > 0) {
                s2 = sb + s2;
            } else {
                s1 = sb + s1;
            }
        }
        final char[] s1chars = s1.toCharArray();
        final char[] s2chars = s2.toCharArray();
        int count =0;
        for (int j = 0; j < s1chars.length; j++) {
            if (s1chars[j] != s2chars[j]) {
                count++;
            }
        }
        return count;

    }

    private String convertDecimal2BinaryString(int x, String s) {
        while (x != 0) {
            int num = x % 2;
            s = num + s;
            x = x / 2;

        }
        return s;
    }
}
