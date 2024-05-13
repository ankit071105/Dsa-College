public class Q9 {
    
    public static void reverseAndPrint(int n) {
        if (n < 10) {
            System.out.print(n);
            return;
        }

        System.out.print(n % 10);

        reverseAndPrint(n / 10);
    }
    public static void main(String[] args) {
  
        int number = 3459;
        System.out.print("Reversed number of " + number + " is: ");
        reverseAndPrint(number); 
    }
}
