import java.util.Arrays;

public class HeightChecker {

    public static int heightChecker(int[] heights) {
        System.out.println(Arrays.toString(heights));
        int[] original = heights.clone();
        int n = 0;
        for (int i = 0; i < heights.length; i++) {
            for (int j = i + 1; j < heights.length; j++) {
                int temp;
                if (heights[i] > heights[j]) {
                    temp = heights[i];
                    heights[i] = heights[j];
                    heights[j] = temp;
                }
            }
        }
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != original[i]) {
                n++;
            }
        }
        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(heights));
        return n;
    }
}
