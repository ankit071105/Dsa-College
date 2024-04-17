import java.util.Scanner;
public class Q {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter your lucky number: ");
            int luckyNumber = Integer.parseInt(scanner.nextLine());
            if (luckyNumber < 0) {
                throw new NumberFormatException("Negative numbers are not allowed.");
            }
            System.out.println("Your lucky number is: " + luckyNumber);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a non-negative integer.");
        } finally {
            scanner.close();
        }
    }
}
