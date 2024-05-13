package HomeAssignment;

public class Q3 {
    
    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }
        return decimalToBinaryHelper(decimal);
    }

    public static String decimalToBinaryHelper(int decimal) {
        if (decimal == 0) {
            return "";
        }
        int remainder = decimal % 2;
        return decimalToBinaryHelper(decimal / 2) + remainder;
    }

    public static void main(String[] args) {
    
        int decimalNumber = 23;
        String binaryEquivalent = decimalToBinary(decimalNumber);
        System.out.println("Binary equivalent of " + decimalNumber + " is: " + binaryEquivalent); // Output: 10111
    }
}
