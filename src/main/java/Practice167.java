public class Practice167 {
    public static void main(String[] args) {
        Practice167 practice167 = new Practice167();
        int[] ints = {-1, 0};
        System.out.println(practice167.twoSum(ints, -1));
    }

    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] + numbers[numbers.length - i - 1] == target) {
                return new int[]{i + 1, (numbers.length - i)};
            }
        }
        return null;
    }
}
