import java.util.Arrays;

public class ReplaceWithGreatestElement {

    public static int[] replaceElement(int[] arr) {
        int index = 1;
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                arr[i] = -1;
                break;
            }
            int highestNumber = arr[index];
            for (int j = index; j <= arr.length - 1; j++) {
                if (arr[j] > highestNumber) {
                    highestNumber = arr[j];
                }
                if (j == arr.length - 1) {
                    arr[i] = highestNumber;
                    index++;
                }
            }
        }
        return arr;
    }
}
