import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDisappearedNumbers {

    // TODO this is currently not working... like at all
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> missingNumbers = new ArrayList<>();
        Arrays.sort(nums);
        int[] distinctNums = Arrays.stream(nums.clone()).distinct().toArray();
        System.out.println("Original Array" + Arrays.toString(nums));
        System.out.println("Sorted Distinct Array" + Arrays.toString(distinctNums));
        for (int i = distinctNums[0]; i < nums[nums.length - 1]; i++) {
            for (int j = i + 1; j < nums[nums.length - 1]; j++) {
                if (j == i) {
                    break;
                }
                missingNumbers.add(j);
            }
        }
        System.out.println("disappeared numbers" + missingNumbers);
        return missingNumbers;
    }
}
