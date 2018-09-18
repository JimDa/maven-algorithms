import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Practice14 {
    public static void main(String[] args) {
        String[] strings = {"flower","flow","flight"};
        Practice14 practice14 = new Practice14();
        String commonPrefix = practice14.longestCommonPrefix(strings);
        System.out.println(commonPrefix);
    }
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }

        StringBuilder commonPrefix = new StringBuilder("");
        List<String> strings = Arrays.asList(strs);
        if (strings.contains("")) {
            return "";
        }
        Collections.sort(strings, Comparator.comparing(String::length));
        String after;

        for (int count = 0; count < strings.get(0).length(); count++) {
            String before = strs[0].substring(0, count+1);
            for (int i = 1; i < strs.length; i++) {
                after = strs[i].substring(0, count+1);
                if (!before.equals(after)) {
                    if (count == 0) {
                        return commonPrefix.toString();
                    } else {
                        return commonPrefix.append(strs[0].substring(0, count)).toString();
                    }
                }
                before = after;
            }
        }
        return strings.get(0);

    }
}
