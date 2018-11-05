public class Practice231 {
    public static void main(String[] args) {
        Practice231 practice231 = new Practice231();
        boolean b = practice231.isPowerOfTwo(12);
        System.out.println(b);
    }
    public boolean isPowerOfTwo(int n) {
        if (n == 1) {
            return true;
        } else {
            if (n == 0) {
                return false;
            }
            if (n % 2 == 1) {
                return false;
            } else {
                n = n / 2;
                return isPowerOfTwo(n);
            }
        }
    }
}
