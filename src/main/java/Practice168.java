public class Practice168 {
    public static void main(String[] args) {
        Practice168 practice168 = new Practice168();
        String s = practice168.convertToTitle(701);
        System.out.println(s);
    }

    public String convertToTitle(int n) {
        String s = "";
        while (n != 0) {
            int temp = (n - 1) % 26;
            s = (char) ('A' + temp) + s;
            n = (n - 1) / 26;
        }
        return s;
    }
}
