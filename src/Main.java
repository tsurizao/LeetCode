public class Main {

    /**
     * -=([{ Current unworkable exercises }])=-
     * - ValidParentheses - need to research Stack / LIFO
     */

    public static void main(String[] args) {
//         Using this space to test solution classes
//        int[] nums = {1, 3, 5, 6}; int target = 5;
        int[] nums = {1, 3, 5, 6}; int target = 2;
//        int[] nums = {1, 3, 5, 6}; int target = 7;
//        int[] nums = {1, 2, 4, 6, 7, 8, 12, 45}; int target = 99;


        System.out.println(SearchInputPosition.searchInsert(nums, target));
    }
}
