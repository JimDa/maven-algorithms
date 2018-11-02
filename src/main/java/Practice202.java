import java.util.HashSet;

public class Practice202 {
    public static void main(String[] args) {
        Practice202 instance = new Practice202();
        System.out.println(instance.isHappy(19));
    }

    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        return start(n, set);
    }

    private boolean start(int n, HashSet<Integer> set) {
        int sum = 0;
        while (n >= 10) {
            sum = sum + (n % 10) * (n % 10);
            n = n / 10;

        }
        sum += n * n;
        if (sum == 1) {
            return true;
        } else {
            if (set.contains(sum)) {
                return false;
            }else {
                set.add(sum);
                return start(sum,set);
            }
        }
    }
}
