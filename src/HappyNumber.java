public class HappyNumber {
//    Write an algorithm to determine if a number n is happy.
//
//    A happy number is a number defined by the following process:
//
//    Starting with any positive integer, replace the number by the sum of the squares of its digits.
//    Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
//    Those numbers for which this process ends in 1 are happy.
//    Return true if n is a happy number, and false if not.

    public static boolean isHappy(int n) {
        int num = n;
        int sum = 0;
        int k = 0;
        while (true) {
            if (num < 1) {
                return false;
            }
            if (num == 1) {
                return true;
            }
            while (num != 0) {
                sum += (num % 10) * (num % 10);
                num /= 10;
            }
            num = sum;
            sum = 0;
            k++;
            if (k > 1000) {
                return false;
            }
        }
    }
}
