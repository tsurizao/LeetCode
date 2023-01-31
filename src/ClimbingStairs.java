public class ClimbingStairs {

//    You are climbing a staircase. It takes n steps to reach the top.
//
//    Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

    public static int climbStairs(int n) {
        int x1 = 1;
        int x2 = 0;
        int xn = 0;
        for (int i = 0; i < n; i++) {
            xn = x1 + x2;
            x1 = x2;
            x2 = xn;
            System.out.println("i = " + i);
            System.out.println("Fibonacci number = " + xn);
        }
        return xn;
    }
}
