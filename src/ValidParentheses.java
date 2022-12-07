import java.util.Locale;

public class ValidParentheses {
    public static boolean isValid(String s) {
        // return once Stack / LIFO has been researched
        for (int i = 0; s.length() > 1; i++) {
            System.out.println(s);
            s = s.replace("()", "");
            System.out.println(s);
            s = s.replace("[]", "");
            System.out.println(s);
            s = s.replace("{}", "");
        }
        return s.length() == 0;
    }
}