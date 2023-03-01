package Java;

import java.util.Arrays;

public class ShuffleTheArray {
    /**
     * Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
     * <p>
     * Return the array in the form [x1,y1,x2,y2,...,xn,yn].
     */

    public static int[] shuffle(int[] nums, int n) {
        // Create a new array based off of how many xn / yn we're shuffling
        int[] newArray = new int[n * 2];
        // Utilizing i to keep track of each pair and j to keep track of
        // index references within each pair
        for (int i = 0, j = 0; i < newArray.length; i += 2, j++) {
            newArray[i] = nums[j];
            newArray[i + 1] = nums[n + j];
        }
        return newArray;
    }
}
