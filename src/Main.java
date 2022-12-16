import java.util.Arrays;
import java.util.HashMap;

public class Main {

    /**
     * -=([{ Current unworkable exercises }])=-
     * [NONE]
     */

    public static void main(String[] args) {
        System.out.println("1");
        System.out.println(ValidParentheses.isValid(")"));
        System.out.println("2");
        System.out.println(ValidParentheses.isValid("(]"));
        System.out.println("3");
        System.out.println(ValidParentheses.isValid("()"));
        System.out.println("4");
        System.out.println(ValidParentheses.isValid("(){}[]"));
        System.out.println("5");
        System.out.println(ValidParentheses.isValid("({}[(()){}])"));
        System.out.println("6");
        System.out.println(ValidParentheses.isValid("{[]({}[(()){}])({}[(()){}])}"));
        System.out.println("7");
        System.out.println(ValidParentheses.isValid("()(((((((((((((((((((((((((([{(((([](){})))){}{{}}}]))))))))))))))))))))))))))"));
    }
}
