import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class Practice20 {
    public static void main(String[] args) {
        Practice20 practice20 = new Practice20();
        boolean valid = practice20.isValid("()");
        System.out.println(valid);
    }

    //    public boolean isValid(String s) {
//        HashMap<Character, Character> map = new HashMap() {{
//            put(')', '(');
//            put(']', '[');
//            put('}', '{');
//        }};
//        Stack<Character> stack = new Stack<>();
//        char[] chars = s.toCharArray();
//        for (Character c : chars) {
//            if (!map.containsKey(c)) {
//                stack.push(c);
//            } else {
//                if (stack.size() != 0 &&stack.peek().equals(map.get(c))) {
//                    stack.pop();
//                } else {
//                    return false;
//                }
//            }
//        }
//        return stack.size() == 0;
//    }
    public boolean isValid(String s) {
        int length;
        do {
            length = s.length();
            s = s.replace("()", "").replace("[]", "").replace("{}", "");
        } while (length != s.length());
        return s.length() == 0;
    }
}
