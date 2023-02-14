public class FinalValueOfVariableAfterPerformingOperations {

//    ++X and X++ increments the value of the variable X by 1.
//            --X and X-- decrements the value of the variable X by 1.
//    Initially, the value of X is 0.
//
//    Given an array of strings operations containing a list of operations, return the final value of X after performing all the operations.

    public static int finalValueAfterOperations(String[] operations){
        int x = 0;
        for (String operation : operations) {
            if (operation.equalsIgnoreCase("--x") || operation.equalsIgnoreCase("x--")) {
                x--;
            } else {
                x++;
            }

        }
        return x;
    }
}
