public class Practice292 {
    public static void main(String[] args) {
        final Practice292 practice292 = new Practice292();
        final boolean b = practice292.canWinNim(4);
        System.out.println(b);
    }
    public boolean canWinNim(int n) {
        int count = 0;
        boolean result = tryAndCount(n, count);
        return result;
    }

    private Boolean tryAndCount(int n, int count) {
        if (n <= 3 && (count + 1) % 2 == 1) {
            return true;
        } else {
            for (int i = 1; i < 4; i++) {
                n = n - i;
                int countAgain = count + 1;
                tryAndCount(n, countAgain);
            }
        }
        return false;
    }
}
