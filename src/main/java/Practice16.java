import java.util.ArrayList;
import java.util.Collections;


//超出时间限制
public class Practice16 {
    public static void main(String[] args) {
        Practice16 practice16 = new Practice16();
        int[] a = {0, -16, -11, -4, 6, 20, -17, 10, 14, -11, -16, 17, -14, -11, 8, -4, 0, -2, 10, 15, 0, -2, -3, 19, 17, -18, 8, -16, -4, -16, -20, 16, -16, 5, -3, -18, -12, -18, -9, 11, 3, -14, -18, 8, 11, -9, -1, 6, 1, -17, -9, -7, 11, -10, 18, -1, 4, -8, 1, -20, -19, -19, 12, 13, 14, 15, 0, 18, 3, 8, -4, 18, -1, 6, -19, -11, 11, 14, 12, 11, -15, 2, 4, -1, 5, 3, -17, 15, -1, -15, 3, 16, -11, -14, 14, 4, -7, -20, -2, -14, -8, -12, -12, 18, 4, -12, 16};
        System.out.println(practice16.threeSumClosest(a, -31));
    }

    public int threeSumClosest(int[] nums, int target) {
        if (nums.length == 3) {
            return nums[0] + nums[1] + nums[2];
        }
        ArrayList<Integer> indexes = new ArrayList<>();
        ArrayList<Info> sums = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            indexes.add(i);
            for (int j = 0; j < nums.length; j++) {
                if (j == i) {
                    continue;
                }
                indexes.add(j);
                for (int k = 0; k < nums.length; k++) {
                    if (indexes.contains(k)) {
                        continue;
                    }
                    int sum = nums[i] + nums[j] + nums[k];
                    if (sum > target) {
                        sums.add(new Info(sum - target, sum));
                    } else {
                        sums.add(new Info(target - sum, sum));
                    }
                }
            }
            indexes.clear();
        }
        Collections.sort(sums);
        return sums.get(0).sum;

    }

    private class Info implements Comparable<Info> {
        private int difference;
        private int sum;

        public Info(int difference, int sum) {
            this.difference = difference;
            this.sum = sum;
        }

        @Override
        public int compareTo(Info o) {
            if (difference != o.difference) {
                return this.difference > o.difference ? 1 : -1;
            } else {
                return 0;
            }
        }
    }
}
