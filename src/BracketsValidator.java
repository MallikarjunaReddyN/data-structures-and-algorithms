import java.util.Stack;

public class BracketsValidator {
    public static void main(String[] args) {
        String input = "({})";
        System.out.println(validateBrackets(input));
    }

    public static boolean validateBrackets(String input) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
                continue;
            }

            if(stack.empty()) return false;

            switch (ch) {
                case ')':
                    if (stack.pop() != '(') return false;
                    break;
                case '}':
                    if (stack.pop() != '{') return false;
                    break;
                case ']':
                    if (stack.pop() != '[') return false;
                    break;
            }
        }
        return stack.isEmpty();
    }
}
