

public class Practice125 {


    public static void main(String[] args) {
        Practice125 practice125 = new Practice125();
        boolean palindrome = practice125.isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(palindrome);
    }
    private static String character = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    public boolean isPalindrome(String s) {
        String replace = s.replace(" ", "");
        char[] chars = replace.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (character.contains(String.valueOf(chars[i]))) {
                sb.append(chars[i]);
            }
        }
        String s1 = sb.toString().toLowerCase();
        String s2 = reverseWord(s1);
        return s1.equals(s2);
    }

    private String reverseWord(String word) {
        char[] chars = word.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = chars.length - 1; i >= 0 ; i--) {
            sb.append(chars[i]);
        }
        return sb.toString();
    }
}
