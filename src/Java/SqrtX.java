package Java;

public class SqrtX {
    public static int mySqrt(int x) {
        if(x == 1){
            return 1;
        }
        double squareRoot = 0;
        for (double i = 0; i < x; i++) {
            if (i * i > x) {
                break;
            }
            squareRoot = i;
        }
        if (squareRoot < 0) {
            squareRoot *= -1;
        }
        return (int) squareRoot;
    }
}
