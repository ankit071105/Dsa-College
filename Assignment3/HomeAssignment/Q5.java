package HomeAssignment;

public class Q5 {

    public static String reverseString(String s) {

        if (s == null || s.length() <= 1) {
            return s;
        }
        return reverseString(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        String input = "pots&pans";
        String reversed = reverseString(input);
        System.out.println("Reverse of '" + input + "' is: '" + reversed + "'"); // Output: snap&stop
    }
    
} 
