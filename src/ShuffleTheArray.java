import java.util.Arrays;

public class ShuffleTheArray {
    /**
     * Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
     * <p>
     * Return the array in the form [x1,y1,x2,y2,...,xn,yn].
     */

    public static int[] shuffle(int[] arr, int n) {
        System.out.println("Starting Array" + Arrays.toString(arr));
        int[] newArray = new int[n * 2];
        int j = 0;
        for (int i = 0; i < newArray.length; i += 2, j++) {
            newArray[i] = arr[j];
            newArray[i + 1] = arr[n + j];
        }
        System.out.print("Solution Answer ");
        return newArray;
    }
}
