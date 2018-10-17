public class Practice35 {
    public static void main(String[] args) {
        Practice35 practice35 = new Practice35();
        int[] ints = {1,3,5,6};
        int target = 0;
        int i = practice35.searchInsert(ints, target);
        System.out.println(i);
    }
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }
}
