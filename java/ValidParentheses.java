import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {

        if (s.length() == 1) {
            return false;
        }

        if (s.length() == 0) {
            return true;
        }


        Map<Character, Character> map = new HashMap<>();
        map.put(']', '[');
        map.put('}', '{');
        map.put(')', '(');

        int count = 0;
        Stack<Character> brackets = new Stack<>();
        int i = 0;
        while (i < s.length()) {

            if (brackets.empty() && map.containsKey(s.charAt(i))) {
                return false;
            }

            if (map.containsValue(s.charAt(i))) {
                brackets.push(s.charAt(i));
            } else {
                if (map.get(s.charAt(i)) == brackets.peek())
                    brackets.pop();
                else
                    return false;
            }
            i++;

        }

        return brackets.empty();

    }

    public static void main(String[] args) {
        System.out.println(isValid("()()"));
    }
}