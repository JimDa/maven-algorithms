public class Practice167 {
    public static void main(String[] args) {
        Practice167 practice167 = new Practice167();
        int[] ints = {-1, 0};
        System.out.println(practice167.twoSum(ints, -1));
    }

    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            if (numbers[i] + numbers[j] == target) {
                return new int[]{i+1,j+1};
            } else if (numbers[i] + numbers[j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return null;
    }
}
