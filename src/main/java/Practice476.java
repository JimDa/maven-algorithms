public class Practice476 {
    public static void main(String[] args) {
        final Practice476 practice476 = new Practice476();
        final int i = practice476.findComplement(5);
        System.out.println(i);
    }

    public int findComplement(int num) {
        String s = "";
        while (num != 0) {
            s = num % 2 + s;
            num = num / 2;
        }
        final StringBuilder sb = new StringBuilder();
        final char[] chars = s.toCharArray();
        for (Character c : chars) {
            if (String.valueOf(c).equals("0")) {
                sb.append("1");
            } else {
                sb.append("0");
            }
        }
        Double count = 0d;
        for (int i = 0; i < sb.length(); i++) {
            count = count + Character.getNumericValue(sb.toString().charAt(i)) * Math.pow(2, sb.length() - i - 1);
        }
        return count.intValue();
    }
}
