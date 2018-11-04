public class Practice258 {
    public int addDigits(int num) {
        while ((num % 10 + num / 10) / 10 != 0) {
            num = num % 10 + num / 10;
        }
        return num % 10 + num / 10;
    }
}
