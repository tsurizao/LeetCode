public class StringToIntAtoi {
    public static int myAtoi(String s) {
        s = s.trim();
        String numString = "";
        int sign = 1;
        if (s.equals("")) {
            return 0;
        }
        if (s.charAt(0) == '-') {
            sign = -1;
            s = s.substring(1);
        } else if (s.charAt(0) == '+') {
            s = s.substring(1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                numString += s.charAt(i);
            } else {
                break;
            }
        }
        if (numString.equals("")) {
            return 0;
        }
        if (Double.parseDouble(numString) > Integer.MAX_VALUE) {
            if (sign == 1) {
                return Integer.MAX_VALUE;
            }
            return Integer.MIN_VALUE;
        }
        int num = Integer.parseInt(numString);
        return num * sign;
    }
}
