import java.util.Arrays;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int single = -1;
        for(int i = 0;i < nums.length;i++){
            boolean match = false;
            for(int j = 0;j < nums.length;j++){
                if(i == j){
                    continue;
                } if(nums[i] == nums[j]){
                    match = true;
                    break;
                }
            }
            if(!match){
                return nums[i];
            }
        }
        return single;
    }
}
