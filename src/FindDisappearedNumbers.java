import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDisappearedNumbers {

    // TODO this is currently not working... like at all
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        List<Integer> missingNumbers = new ArrayList<>();
        int[] distinctNums = Arrays.stream(nums).distinct().toArray();
        for (int i = 0; i < distinctNums.length; i++) {
            missingNumbers.add(distinctNums[i]);
        }
        for (int i = nums[0]; i <= nums.length; i++) {
            if(missingNumbers.contains(i)){
                missingNumbers.remove((Integer) i);
            } else {
                missingNumbers.add(i);
            }
        }
        System.out.println("Original" + Arrays.toString(nums));
        System.out.println("Distinct" + Arrays.toString(distinctNums));
        System.out.println("List" + missingNumbers);
        return missingNumbers;
    }
}
