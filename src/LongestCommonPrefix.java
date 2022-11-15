import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {

        if (strs.length == 1) {
            return strs[0];
        }

        String smallestString = strs[0];
        for (String str : strs) {
            if (str.length() < smallestString.length()) {
                smallestString = str;
            }
        }
        System.out.println("Smallest String Length = " + smallestString.length());

        for (int i = 0; i < strs.length;i++) {
            for (int j = smallestString.length(); j = smallestString.length(); j--) {
                System.out.println("yo");
                System.out.println("J = " + strs[j]);
                System.out.println("J + 1 = " + strs[j + 1]);
                if (strs[j].substring(0, smallestString.length()).equals(strs[j + 1].substring(0, smallestString.length()))) {
                    System.out.println("substring" + strs[j].substring(0, smallestString.length()));
                }
            }
        }
        return "plug in answer here";
    }
}
