import java.util.Arrays;

public class CheckIfNAndItsDoubleExist {
    // Given an array arr of integers, check if there exist two indices i and j such that :

    public static boolean checkIfExists(int[] arr) {
        for (int i : arr) {
            for (int j : arr) {
                if(i != j){
                    if (i == 2 * j)
                        return true;
                }
            }
        }
        return false;
    }
}
