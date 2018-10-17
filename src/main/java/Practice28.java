public class Practice28 {
    public static void main(String[] args) {
        String haystack = "a", needle = "a";
        Practice28 practice28 = new Practice28();
        int i = practice28.strStr(haystack, needle);
        System.out.println(i);
    }

    public int strStr(String haystack, String needle) {
        if (needle.equals("")) {
            return 0;
        }
        char[] chars = haystack.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (needle.startsWith(String.valueOf(chars[i])) && haystack.length() - i - needle.length() >= 0) {
                String substring = haystack.substring(i, i + needle.length());
                if (needle.equals(substring)) {
                    return i;
                }
            }
        }
        return -1;
    }
}
