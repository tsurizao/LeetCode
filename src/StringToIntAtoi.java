public class StringToIntAtoi {
    public static int myAtoi(String s) {
        s = s.trim();
        String numString = "";
        int sign = 1;

        if (s.charAt(0) == '-') {
            sign = -1;
        }

        for (int i = 0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i))){
                numString += s.charAt(i);
            }
        }

        int num = Integer.parseInt(numString);
        return num * sign;
    }
}
