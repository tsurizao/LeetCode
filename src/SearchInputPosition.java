public class SearchInputPosition {
    // Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
    //You must write an algorithm with O(log n) runtime complexity.

    public static int searchInsert(int[] nums, int target) {
        int location = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < target){
                location++;
            }
            if(nums[i] == target){
                return i;
            }
            if(i == nums.length - 1 && nums[i] < target){
                return i + 1;
            }
        }
        return location;
    }
}
