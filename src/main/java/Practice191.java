import java.util.ArrayList;

public class Practice191 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        while (n >= 2) {
            if (n % 2 == 1) {
                count++;
            }
            n = n / 2;
        }
        if (n == 1) {
            count++;
        }
        return count;
    }
}
