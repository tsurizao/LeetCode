public class RomanToInteger {
    public static int romanToInt(String s) {
        int num = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.substring(i - 1, i).equals("I")) {
                num += 1;
            }
            if (s.substring(i - 1, i).equals("V")) {

            }
        }
        return num;
    }
}
