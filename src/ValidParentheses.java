import java.util.Locale;
import java.util.Stack;

public class ValidParentheses {
    //        Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//                An input string is valid if:
//
//        Open brackets must be closed by the same type of brackets.
//                Open brackets must be closed in the correct order.
//        Every close bracket has a corresponding open bracket of the same type.
    public static boolean isValid(String s) {
        Stack<Character> parenBank = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            System.out.println("i: " + s.charAt(i) + " ||| " + "bank: " + parenBank);
            if (s.charAt(i) == ')' && parenBank.peek() == '(') {
                parenBank.pop();
            } else if (s.charAt(i) == '}' && parenBank.peek() == '{') {
                parenBank.pop();
            } else if (s.charAt(i) == ']' && parenBank.peek() == '[') {
                parenBank.pop();
            } else {
                parenBank.push(s.charAt(i));
            }
        }
        return parenBank.isEmpty();
    }
}