import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDisappearedNumbers {

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        //TODO still working on a solution, done for day
        List<Integer> missingNumbers = new ArrayList<>();
        Arrays.sort(nums);
        System.out.println("nums" + Arrays.toString(nums));
        int k = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[j] == k) {
                    nums[j] = 1;
                }
            }
            k++;
        }
        System.out.println("numbersFound" + Arrays.toString(nums));
        System.out.println("Missing" + missingNumbers);
        return missingNumbers;
    }
}
