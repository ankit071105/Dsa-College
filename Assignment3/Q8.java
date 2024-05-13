public class Q8 {
    public static double power(double x, int n) {
      
        if (n == 0) {
            return 1;
        }
        if (n > 0) {
            return x * power(x, n - 1);
        } else {
            return 1 / (x * power(x, -n - 1));
        }
    }
    public static void main(String[] args) {
        double x = 3.5;
        int n = 3;
        double result = power(x, n);
        System.out.println(x + " raised to the power " + n + " is: " + result); // Output: 15.625
    }
}
