public class MoveZeroes {
    public static int[] moveZeroes(int[] arr) {
        int end = arr.length - 1;
        for (int i = 0; i < arr.length - 1; i+=0) {
            if (arr[i] == 0) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1 - i] = 0;
                end--;
                if(i == end){
                    break;
                }
            } else {
                i++;
            }
        }
        return arr;
    }
}
