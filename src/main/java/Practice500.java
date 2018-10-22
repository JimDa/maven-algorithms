import java.util.ArrayList;

public class Practice500 {
    String s1 = "QWERTYUIOPqwertyuiop";
    String s2 = "ASDFGHJKLasdfghjkl";
    String s3 = "ZXCVBNMzxcvbnm";
    public String[] findWords(String[] words) {
        ArrayList<String> qualifiedWords = new ArrayList<>();
        loopi:for (String word : words) {
            char[] chars = word.toCharArray();
            String s;
            if (s1.indexOf(chars[0]) >= 0) {
                s = s1;
            } else if (s2.indexOf(chars[0]) >= 0) {
                s = s2;
            } else {
                s = s3;
            }
            loopj:for (int i = 1; i < chars.length; i++) {
                if (s.indexOf(chars[i]) < 0) {
                    continue loopi;
                }
            }
            qualifiedWords.add(word);
        }
        final String[] qualifiedArray = new String[qualifiedWords.size()];
        for (int i = 0; i < qualifiedWords.size(); i++) {
            qualifiedArray[i] = qualifiedWords.get(i);
        }
        return qualifiedArray;
    }
}
