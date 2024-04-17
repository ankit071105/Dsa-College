
public class Q2 {
        public static void main(String[] args) {
            try {
                String[] color = {"patch yellow", "olive green", "violet"};
                String c1 = color[3];
                String c2 = null;
                int length = c2.length();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index is out of bounds.");
            } catch (NullPointerException e) {
                System.out.println("Null reference encountered.");
            }
        }
    }
     

