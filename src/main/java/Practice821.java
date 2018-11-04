import org.apache.commons.codec.binary.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice821 {
    public static void main(String[] args) {
        final Practice821 practice821 = new Practice821();
        String S = "baaa";
        char C = 'b';
        final int[] ints = practice821.shortestToChar(S, C);
        System.out.println(ints.length);
    }

    public int[] shortestToChar(String S, char C) {
        String c = String.valueOf(C);
        String[] strings = S.split(c);
        List<String> collect = Arrays.stream(strings).filter(v -> !v.equals("")).collect(Collectors.toList());
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < collect.size(); i++) {
            char[] chars = collect.get(i).toCharArray();
            if (i == 0) {
                if (S.startsWith(c)) {
                    if (collect.size() == 1  && !S.endsWith(c)) {
                        for (int j = 0; j < chars.length; j++) {
                            int left = j + 1;
                            list.add(left);
                        }
                        break;
                    } else {
                        for (int j = 0; j < chars.length; j++) {
                            int left = j + 1;
                            int right = chars.length - j;
                            list.add(left <= right ? left : right);
                        }
                    }
                } else {
                    for (int j = 0; j < chars.length; j++) {
                        int right = chars.length - j;
                        list.add(right);
                    }
                }
            } else if (i == collect.size() - 1) {
                if (S.endsWith(c)) {
                    if (collect.size() == 1  && !S.startsWith(c)) {
                        for (int j = 0; j < chars.length; j++) {
                            int right = chars.length - j;
                            list.add(right);
                        }
                        break;
                    } else {
                        for (int j = 0; j < chars.length; j++) {
                            int left = j + 1;
                            int right = chars.length - j;
                            list.add(left <= right ? left : right);
                        }
                    }
                } else {
                    for (int j = 0; j < chars.length; j++) {
                        int left = j + 1;
                        list.add(left);
                    }
                }
            } else {
                for (int j = 0; j < chars.length; j++) {
                    int left = j + 1;
                    int right = chars.length - j;
                    list.add(left <= right ? left : right);
                }
            }
        }
        char[] charArray = S.toCharArray();
        int[] result = new int[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            if (String.valueOf(charArray[i]).equals(c)) {
                result[i] = 0;
            } else {
                result[i] = list.get(0);
                list.remove(0);
            }
        }
        return result;
    }
}
