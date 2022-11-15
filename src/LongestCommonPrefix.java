
public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {

        if (strs.length == 1) {
            return strs[0];
        }

        for(int i = 0;i < strs.length - 1;i++){
            if(strs[i].equals("")){
                return strs[i];
            }
        }

        String longestPrefix = "";
        String smallestString = strs[0];
        char letterToCheck;
        boolean exitLoop = false;

        for (String str : strs) {
            if (str.length() < smallestString.length()) {
                smallestString = str;
            }
        }
        int k = 0;
        for (int i = 0; i < strs.length - 1; i++) {
            System.out.println("I: " + i + " --- K: ");
            letterToCheck = strs[i].charAt(k);
            for (int j = 0; j < smallestString.length() - 1; j++) {
                System.out.println("J: " + j);
                //loop through each letter of each word
                if (letterToCheck != strs[k].charAt(j)) {
                    exitLoop = true;
                    break;
                }
            }
            if (exitLoop) {
                break;
            }
            longestPrefix += letterToCheck;
            k++;
        }
        return longestPrefix;
    }
}
