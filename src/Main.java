import java.util.Arrays;
import java.util.HashMap;

public class Main {

    /**
     * -=([{ Current unworkable exercises }])=-
     * - ValidParentheses - need to research Stack / LIFO
     */

    public static void main(String[] args) {

        System.out.println(ValidParentheses.isValid("()"));
        System.out.println(ValidParentheses.isValid("(){}[]"));
        System.out.println(ValidParentheses.isValid("(]"));
    }
}
