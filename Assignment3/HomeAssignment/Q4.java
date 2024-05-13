package HomeAssignment;

public class Q4 {
    public static int product(int x, int y) {
        
        if (x == 0 || y == 0) {
            return 0;
        }

        if (x == 1) {
            return y;
        }
        if (y == 1) {
            return x;
        }
        return x + product(x, y - 1);
    }

    public static void main(String[] args) {
        int x = 5;
        int y = 4;
        int result = product(x, y);
        System.out.println("Product of " + x + " and " + y + " is: " + result); // Output: 20
    }
}
