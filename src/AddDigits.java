public class AddDigits {

//    Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

    public static int addDigits(int num) {
        // Returns num if it's already a single digit.
        if (num < 10) return num;

        // Variable to store the digit sums
        int digitSum = 0;

        // Loop runs until num is less than 10
        while (true) {
            // As long as num is 10 or more
            if (num >= 10) {
                // Nested loop runs until num is zero
                while (num > 0) {
                    // Extract the ones place and add to digitSum
                    digitSum += num % 10;
                    // Divide num by 10 to remove ones place
                    num /= 10;
                }
                // Set num to digitSum and reset digitSum
                num = digitSum;
                digitSum = 0;
            } else {
                break;
            }
        }
        return num;
    }
}
