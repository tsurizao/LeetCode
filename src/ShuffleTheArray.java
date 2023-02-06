import java.util.Arrays;

public class ShuffleTheArray {
    /**
     * Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
     * <p>
     * Return the array in the form [x1,y1,x2,y2,...,xn,yn].
     */

    public static int[] shuffle(int[] arr, int n) {
        System.out.println("Starting Array" + Arrays.toString(arr));
        int halfIndex = arr.length / 2;
        int[] newArray = new int[arr.length];
        for (int i = 0; i < n; i++) {
            newArray[i] = arr[i];
            newArray[i + 1] = arr[halfIndex];
            halfIndex++;
            i++;
            System.out.println(Arrays.toString(newArray));
        }
        return newArray;
    }
}
