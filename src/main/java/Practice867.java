public class Practice867 {
    public static void main(String[] args) {
        final Practice867 practice867 = new Practice867();
        int[] sub1 = {1,2,3};
        int[] sub2 = {4,5,6};
        int[][] arr = {sub1,sub2};
        int[][] ints = practice867.transpose(arr);
        System.out.println(ints.toString());
    }
    public int[][] transpose(int[][] A) {
        if (A == null || A.length == 0) {
            return null;
        }
        if (A[0].length == 0) {
            return null;
        }
        int[][] result = new int[A[0].length][A.length];
        for (int i = 0; i < A[0].length; i++) {
            int[] ints = new int[A.length];
            for (int j = 0; j < A.length; j++) {
                ints[j] = A[j][i];

            }
            result[i] = ints;
        }
        return result;
    }
}
