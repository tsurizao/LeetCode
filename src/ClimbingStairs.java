public class ClimbingStairs {

//    You are climbing a staircase. It takes n steps to reach the top.
//
//    Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

    public static int climbStairs(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;
        int waysToClimb = 0;
        if(n % 2 == 0){
            for(int i = 0;i < n;i++){
                waysToClimb += 2;
            }
            return waysToClimb;
        } else {
            for(int i = 0;i < n;i++){
                waysToClimb += 2;
            }
            waysToClimb +=1 ;
            return waysToClimb;
        }
    }
}
