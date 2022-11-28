import java.util.Arrays;

public class PlusOne {

    // You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

    //Increment the large integer by one and return the resulting array of digits.
    public static int[] plusOne(int[] digits) {
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + ", ");
        }
        System.out.println("");
        digits[digits.length - 1] += 1;
        for (int i = digits.length - 1; i > 0; i--) {
            System.out.println(i);
            if (digits[i] == 10) {
                digits[i] = 0;
                digits[i - 1] += 1;
            }
        }
        if(digits[0] == 10){
            int[] newDigits = new int[digits.length + 1];
            for(int i = 0;i < digits.length - 1;i++){
                newDigits[i + 1] = digits[i];
            }
            newDigits[0] = 1;
            newDigits[1] = 0;
            return newDigits;
        }
        return digits;
    }
}