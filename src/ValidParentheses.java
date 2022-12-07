import java.util.Locale;

public class ValidParentheses {
    public static boolean isValid(String s) {
        // return once Stack / LIFO has been researched
        int i = 0;
        while (i < s.length() - 1) {
            System.out.println(s.length() + " length left");
            System.out.println(i + " i");
            System.out.println(s.charAt(i) + " character at i");
            System.out.println(s + " full string");
            System.out.println("=====");
            if (s.charAt(i) == '(' && s.charAt(i + 1) == ')') {
                s = s.replace("()", "");
                i = 0;
                if (s.length() == 0) {
                    return true;
                }
            }
            if (s.charAt(i) == '[' && s.charAt(i + 1) == ']') {
                s = s.replace("[]", "");
                i = 0;
                if (s.length() == 0) {
                    return true;
                }
            }
            if (s.charAt(i) == '{' && s.charAt(i + 1) == '}') {
                s = s.replace("{}", "");
                i = 0;
                if (s.length() == 0) {
                    return true;
                }
            }
            i++;
        }
        return false;
    }
}