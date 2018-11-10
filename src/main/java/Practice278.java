public class Practice278 extends VersionControl {
    public static void main(String[] args) {
        Practice278 practice278 = new Practice278();
        int i = practice278.firstBadVersion(2);
        System.out.println(i);
    }
    public int firstBadVersion(int n) {
        if (n == 1) {
            return n;
        }
        int left = 0;
        int right = n;
        int mid;
        while (left != right - 1) {
            mid = (left + right) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return right;
    }
}
