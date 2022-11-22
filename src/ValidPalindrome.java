public class ValidPalindrome {
    public static boolean isPalidrome(String s){
        StringBuilder normalString = new StringBuilder();
        StringBuilder reversedString = new StringBuilder();
        for(int i = 0;i < s.length();i++){
            if(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))){
                normalString.append(s.charAt(i));
            }
        }
        System.out.println(normalString);
        for(int i = normalString.length() - 1;i >= 0;i--){
            reversedString.append(normalString.charAt(i));
        }
        System.out.println(reversedString);
        return normalString.toString().equalsIgnoreCase(reversedString.toString());
    }
}
