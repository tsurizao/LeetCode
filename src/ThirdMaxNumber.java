import java.util.Arrays;

public class ThirdMaxNumber {

    //    Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.

    public static int thirdMax(int[] nums) {
        int[] newNums = Arrays.stream(nums).distinct().toArray();
        Arrays.sort(newNums);
        int number = newNums[newNums.length - 1];
        if(newNums.length < 3){
            return number;
        }
        return newNums[newNums.length - 3];
    }
}
