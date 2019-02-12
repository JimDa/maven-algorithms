import java.util.ArrayList;

public class Practice942 {
    public static void main(String[] args) {
        final Practice942 practice942 = new Practice942();
        final int[] idids = practice942.diStringMatch("IDID");
        System.out.println(idids);
    }

    public int[] diStringMatch(String S) {
        int length = S.length();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < length + 1; i++) {
            list.add(i);
        }
        char[] chars = S.toCharArray();
        int[] result = new int[length+1];
        int count = 0;
        for (int i = 0; i < chars.length + 1;i++) {
            if (i == chars.length) {
                result[i] = list.get(list.size()-1);
            } else {
                if (chars[i] == 'I') {
                    result[i] = list.get(count);
                    count++;
                } else if (chars[i] == 'D'){
                    result[i] = list.get(list.size()-1);
                    list.remove(list.size()-1);
                } else {
                    result[i] = list.get(list.size()-1);
                }
            }
        }
        return result;
    }
}
