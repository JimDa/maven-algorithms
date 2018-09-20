/**
 * @author Administrator
 */
public class Practice9 {
    public static void main(String[] args) {
        Practice9 practice9 = new Practice9();
        System.out.println(practice9.isPalindrome(121));
    }

    public boolean isPalindrome(int x) {
        String before = String.valueOf(x);
        StringBuilder sb = new StringBuilder();
        char[] chars = before.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            sb.append(chars[i]);
        }
        //String类的equals方法比较非String要小心。
        return before.equals(sb.toString());
    }
}
