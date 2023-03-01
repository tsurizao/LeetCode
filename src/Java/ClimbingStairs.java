package Java;

public class ClimbingStairs {

//    You are climbing a staircase. It takes n steps to reach the top.
//
//    Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?


    /** After a lot of reading, trial and error it finally made sense.
     * The Fibonacci Sequence counts based on the two previous numbers
     * For instance:
     * The first number in the sequence is 1, the second number is the
     * first number plus the number before it which is 1 + 0 = 1.  The
     * third number is 2nd number + 1st number, which is 1 + 1 = 2.
     * 4th number is 2nd(1) + 3rd(2) = 3, 5th is 3rd(2) + 4th(3) = 5 and so on...
     */
    public static int climbStairs(int n) {
        // Stores xn - 2 number
        int x1 = 0;
        // Stores xn - 1 number
        int x2 = 1;
        // Stores the current number in the sequence
        int xn = 0;
        for (int i = 0; i < n; i++) {
            // Current number in sequence based on which step the loop is on
            xn = x1 + x2;
            // set x1 equal to x2, as it will be the new xn - 2 for the next iteration
            x1 = x2;
            // sets x2 equal to xn, as it will be the new xn - 1 for the next iteration
            x2 = xn;
        }
        return xn;
    }
}
