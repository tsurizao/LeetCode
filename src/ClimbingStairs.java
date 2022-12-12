public class ClimbingStairs {
//    You are climbing a staircase. It takes n steps to reach the top.
//
//    Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

    public static int climbStairs(int n) {

        int distinctWaysToClimb = 0;
        int remainingSteps = n;
        int numberOfTwos = n / 2;
//        subtract by 2's until no longer able to, every loop reduce the amount of 2's to subtract
        while (true) {
            if (numberOfTwos > 0) {
                for (int i = 0; i < numberOfTwos; i++) {
                    remainingSteps -= 2;
                    if (remainingSteps < 2) {
                        break;
                    }
                }
            }
            distinctWaysToClimb++;
            numberOfTwos--;
            remainingSteps = n;
            if (numberOfTwos == -1) {
                break;
            }
        }
        return distinctWaysToClimb;
    }
}
