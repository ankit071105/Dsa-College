import java.util.Scanner;

public class Question3 {
    public static int[] calculateDotProduct(int[] a, int[] b) {
        int[] c = new int[5];

        for (int i = 0; i < 5; i++) {
            c[i] = a[i] * b[i];
        }

        return c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      int a[]=new int[5];
      for (int i = 0; i < 5; i++) {
    System.out.println("The Element of first array");

      a[i]=sc.nextInt();
    }
      int b[]=new int[5];
      for (int i = 0; i < 5; i++) {
        System.out.println("The Element of Second array");
    
          b[i]=sc.nextInt();
        }
        int[] c = calculateDotProduct(a, b);
        System.out.print("Dot Product: ");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
    }
}
