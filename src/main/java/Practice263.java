import java.util.Arrays;
import java.util.List;

public class Practice263 {
    public boolean isUgly(int num) {
        List<Integer> list = Arrays.asList(0, 1);
        while (!list.contains(num) && num % 2 == 0) {
            num = num / 2;
        }
        while (!list.contains(num) && num % 3 == 0) {
            num = num / 3;
        }
        while (!list.contains(num) && num % 5 == 0) {
            num = num / 5;
        }
        return num == 1;
    }
}
