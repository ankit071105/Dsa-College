package HomeAssignment;

public class Q1 {
    public static int gcd(int m, int n) {
        if (n == 0) {
            return m;
        }
        return gcd(n, m % n);
    }

    public static void main(String[] args) {
        int m = 28;
        int n = 68;
        int result = gcd(m, n);
        System.out.println("GCD of " + m + " and " + n + " is: " + result); // Output: 6
    } 
}
