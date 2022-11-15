import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {

        if (strs.length == 1) {
            return strs[0];
        }

        String longestPrefix = "";
        String smallestString = strs[0];
        boolean conditionalBreak = false;

        for (String str : strs) {
            if (str.length() < smallestString.length()) {
                smallestString = str;
            }
        }
        for (int i = 0; i < strs.length - 1; i++) {
            System.out.println("Loop " + i);
            String tempPrefix = "";
            for (int j = 0; j < smallestString.length(); j++) {
                if (strs[i].charAt(j) == strs[i + 1].charAt(j)) {
                    tempPrefix += strs[i].charAt(j);
                } else {
                    break;
                }
            }
            System.out.println("temp prefix = " + tempPrefix);
            longestPrefix = tempPrefix;
        }
        return longestPrefix;
    }
}
