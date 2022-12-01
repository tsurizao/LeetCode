public class SqrtX {
    public static int mySqrt(int x) {
        double squareRoot = 0;
        double decimal = 1;
        for (double i = x; i > 0; i--) {
            if (i * i <= x) {
                squareRoot += i;
                break;
            }
        }
//        if (squareRoot < 0) {
//            squareRoot *= -1;
//        }
//        if (squareRoot % .1 >= 5) {
//            squareRoot += 1;
//        }
        return (int) squareRoot;
    }
}
