public class Practice832 {
    public static void main(String[] args) {
    }

    public int[][] flipAndInvertImage(int[][] A) {
        for (int a = 0; a < A.length; a++) {
            int[] reversedArray = new int[A[a].length];
            for (int i = 0; i < A[a].length; i++) {
                reversedArray[A[a].length - i - 1] = (A[a][i] == 0 ? 1 : 0);
            }
            A[a] = reversedArray;
        }
        return A;
    }
}
