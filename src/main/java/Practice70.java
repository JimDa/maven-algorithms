public class Practice70 {
    public static void main(String[] args) {
        Practice70 practice70 = new Practice70();
        int i = practice70.climbStairs(6);
        System.out.println(i);
    }

    public int climbStairs(int n) {
        int count = 2;
        int possibilities = 0;
        return countPossiblities(count, n, possibilities, 1, 2);
    }

    private int countPossiblities(int count, int n, int possibilities, int init, int theOneAfterInit) {
        if (n < 3) {
            return n == 1 ? 1 : 2;
        }
        if (count >= 3 && count == n) {
            return possibilities;
        } else {
            possibilities = init + theOneAfterInit;
            count++;
            return countPossiblities(count, n, possibilities, theOneAfterInit, possibilities);
        }
    }

//    private int climbAndCount(int n, int count) {
//        for (int i = 1; i < 3; i++) {
//            if (n - i == 0) {
//                return ++count;
//            } else {
//                count = climbAndCount(n - i, count);
//            }
//        }
//        return count;
//    }
}
