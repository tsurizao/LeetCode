public class ReverseInteger {
    public static int reverse(int x) {
        int y = 0;
        for (int i = 0; x != 0; i++) {
            y += x % 10;
            x= x / 10;
        }
        System.out.println(y);
        return y;
    }
}
