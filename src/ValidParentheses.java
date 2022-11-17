public class ValidParentheses {
    public static boolean isValid(String s) {

        while (true) {
            if (s.equals("")) {
                return true;
            }
            if(s.length() == 1){
                return false;
            }
            if (s.contains("(")) {
                s = s.replace("(", "");
                if (s.contains(")")) {
                    s = s.replace(")", "");
                } else {
                    return false;
                }
            }
            if (s.contains("[")) {
                s = s.replace("[", "");
                if (s.contains("]")) {
                    s = s.replace("]", "");
                } else {
                    return false;
                }
            }
            if (s.contains("{")) {
                s = s.replace("{", "");
                if (s.contains("}")) {
                    s = s.replace("}", "");
                } else {
                    return false;
                }
            }
        }
    }
}