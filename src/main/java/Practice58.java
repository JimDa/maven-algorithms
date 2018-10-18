public class Practice58 {
    public static void main(String[] args) {
        String s = " ";
        Practice58 practice58 = new Practice58();
        int i = practice58.lengthOfLastWord(s);
        System.out.println(i);

    }
    public int lengthOfLastWord(String s) {
        String trim = s.trim();
        String[] split = trim.split(" ");
        return split[split.length-1].length();
    }
}
