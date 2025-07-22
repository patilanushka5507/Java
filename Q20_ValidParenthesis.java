import java.util.Stack;

public class Q20_ValidParenthesis {
    public static boolean isvalid(String data) {
        Stack<Character> s1 = new Stack<>();
        for (char ch : data.toCharArray()) {
            if (ch == '{' || ch == '[' || ch == '(') {
                s1.push(ch);
            } else {
                if (s1.isEmpty()) return false;
                char deletedata = s1.pop();
                if ((ch == ')' && deletedata != '(') ||
                    (ch == '}' && deletedata != '{') ||
                    (ch == ']' && deletedata != '[')) {
                    return false;
                }
            }
        }
        return s1.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isvalid("()[]{}"));   // true
        System.out.println(isvalid("([)]"));     // false
        System.out.println(isvalid("{[]}"));     // true
        System.out.println(isvalid("((()))"));   // true
        System.out.println(isvalid("((())"));    // false
    }
}
