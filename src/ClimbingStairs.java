public class ClimbingStairs {

//    You are climbing a staircase. It takes n steps to reach the top.
//
//    Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

    public static int climbStairs(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;
        if(n % 2 == 0){
            return n * 2;
        } else {
            return n * 2 + 1;
        }
    }
}
