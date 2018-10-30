public class Practice557 {
    public String reverseWords(String s) {
        if (s == null) {
            return null;
        }
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String reversedWord = reverseWord(words[i]);
            sb.append(reversedWord + " ");
        }
        return sb.toString().trim();
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
