public class Q10 {
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
      
        int n = 8;
        int result = fibonacci(n);
        System.out.println("The " + n + "th Fibonacci number is: " + result); 
    }
}
