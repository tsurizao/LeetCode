
public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {

        String longestPrefix = "";
        String smallestString = strs[0];
        boolean exitLoop = false;

        for (String str : strs) {
            if (str.length() <= smallestString.length()) {
                smallestString = str;
            }
        }

        for (int i = 0; i < smallestString.length(); i++) {
            System.out.println("Letter to check: " + strs[0].charAt(i));
            for (int j = 0; j < strs.length; j++) {
                System.out.println("Subloop " + j);
                if(strs[0].charAt(i) != strs[j].charAt(i)){
                    exitLoop = true;
                    break;
                }
            }
            if(exitLoop){
                break;
            } else {
                longestPrefix += strs[0].charAt(i);
            }
        }
        return longestPrefix;
    }
}
