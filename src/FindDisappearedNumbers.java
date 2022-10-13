import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDisappearedNumbers {

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        //TODO still working on a solution
        List<Integer> missingNumbers = new ArrayList<>();
        System.out.println("Numbers Found: " + Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++) {
            if (i >= 99999) {
                break;
            }
            if (!missingNumbers.contains(nums[i])) {
                missingNumbers.add(nums[i]);
            }
        }
        missingNumbers.sort(Integer::compareTo);
        System.out.println("Missing" + missingNumbers);
        for (int i = 1; i <= nums.length; i++) {
            if (i > 99999) {
                break;
            }
            if (missingNumbers.contains(i)) {
                missingNumbers.remove((Integer) i);
            } else {
                missingNumbers.add(i);
            }
        }
        System.out.println("Missing" + missingNumbers);
        return missingNumbers;
    }
}
