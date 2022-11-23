public class PlusOne {

    // You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

    //Increment the large integer by one and return the resulting array of digits.
    public static int[] plusOne(int[] digits) {
        int number = 0;
        int indices = digits.length;
        int nineCount = 0;
        for (int i = 0; i < digits.length; i++) {
            number += digits[i];
            if (digits[i] == 9) {
                nineCount += 1;
            }
            if (i + 1 == digits.length) {
                continue;
            }
            number *= 10;
        }
        number += 1;
        System.out.println(number);
        if (nineCount == indices) {
            int[] newDigits = new int[indices + 1];
            for (int i = indices - 1; i >= 0; i--) {
                newDigits[i] = number % 10;
                number /= 10;
            }
            return newDigits;
        }
        int[] newDigits = new int[indices];
        for (int i = indices - 1; i >= 0; i--) {
            newDigits[i] = number % 10;
            number /= 10;
        }
        return newDigits;
    }
}
