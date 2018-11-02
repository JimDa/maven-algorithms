public class Practice204 {
    public static void main(String[] args) {
        Practice204 practice204 = new Practice204();
        int i = practice204.countPrimes(499979);
        System.out.println(i);
    }

    public int countPrimes(int n) {
        if (n == 0 || n == 1 || n == 2) {
            return 0;
        }
        boolean b = !canbeDivided(n);
        int count = 0;
        while (n > 1) {
            if (n != 2 && n % 2 == 0) {
                n--;
                continue;
            }
            if (!canbeDivided(n)) {
                count++;
            }
            n--;
        }
        return b ? count - 1 : count;
    }

    private boolean canbeDivided(Integer n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return true;
            }
        }
        return false;
    }
}
