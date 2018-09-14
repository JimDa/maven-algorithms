

public class Practice202 {
    public static void main(String[] args) {
        Practice202 instance = new Practice202();
        System.out.println(instance.isHappy(4234));
//        Demo demo = new Demo();
    }

    public boolean isHappy(int n) {
        int sum = 0;

        while (n > 1) {
            sum = sum + (n % 10) * (n % 10);
            n = n / 10;

        }
        if (sum == 1) {
            return true;
        } else {
            System.out.println(sum);
            return isHappy(sum);
        }
    }
}
