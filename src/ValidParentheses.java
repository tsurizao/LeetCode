public class ValidParentheses {
    public static boolean isValid(String s) {
        StringBuilder bracketOrder = new StringBuilder();
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                bracketOrder.append(s.charAt(i));
            }
        }
        System.out.println(s);
        System.out.println(bracketOrder);

        int k = s.length() - 1;
        for (int i = 0; i < s.length() - 1; i++) {
            System.out.println(s.charAt(i));
            System.out.println(s.charAt(k));
            if ((s.charAt(i) == '(' && s.charAt(k) == ')')) {
                k--;
            } else if (s.charAt(i) == '[' && s.charAt(k) == ']') {
                k--;
            } else if (s.charAt(i) == '{' && s.charAt(k) == '}') {
                k--;
            } else if(s.charAt(i) == s.charAt(i + 1)){
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}