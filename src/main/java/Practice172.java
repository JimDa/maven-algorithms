public class Practice172 {
    public static void main(String[] args) {
        Practice172 practice172 = new Practice172();
        int i = practice172.trailingZeroes(70);
        System.out.println(i);
    }

    public int trailingZeroes(int n) {
        long result = 1;
        while (n > 1) {
            result = result * n;
            n--;
        }
        int count = 0;
        String str = String.valueOf(result);
        while (str.lastIndexOf("0") == str.length() - 1) {
            count++;
            str = str.substring(0, str.length() - 1);
        }
        return count;
    }
}
