public class PowXN {
    //    Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
    public static double powXN(double x, int n) {
        double power = x;
        for (int i = n; i > 1; i--) {
            System.out.println(power);
            power = power * x;
        }
        return power;
    }
}
