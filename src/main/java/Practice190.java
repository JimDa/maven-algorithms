import java.util.ArrayList;

public class Practice190 {
    public static void main(String[] args) {
        Practice190 practice190 = new Practice190();
        int i = practice190.reverseBits(43261596);
        System.out.println(i);
    }

    public int reverseBits(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        while (n >= 2) {
            list.add(n % 2);
            n = n / 2;
        }
        list.add(n);
        System.out.println(list.toString());
        if (list.size() < 32) {
            int x = 32 - list.size();
            int count = 0;
            while (count < x) {
                list.add(0);
                count++;
            }
        }
        System.out.println(list.toString());
        double result = 0;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i) == 0) {
                continue;
            }
            result = result + Math.pow(2, size - i -1);
        }
        System.out.println(String.valueOf(result));
        return (int) result;
    }
}
