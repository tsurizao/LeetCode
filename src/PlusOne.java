import java.util.Arrays;

public class PlusOne {

    // You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

    //Increment the large integer by one and return the resulting array of digits.
    public static int[] plusOne(int[] digits) {
        digits[digits.length - 1] += 1;
        for (int i = 0; i < digits.length - 1; i++) {
            if (digits[i] == 10) {
                System.out.println("yo");
                digits[i] = 0;
                digits[i + 1] += 1;
            }
        }
        return digits;
    }
}