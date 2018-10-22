public class Practice69 {
    public static void main(String[] args) {
        Practice69 practice69 = new Practice69();
        int i = practice69.mySqrt(4);
        System.out.println(i);

    }

    public int mySqrt(int x) {
        double result = Math.sqrt(x);
        return Integer.valueOf((String.valueOf(result).split("\\."))[0]);
    }
}
