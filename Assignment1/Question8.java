import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][3];
        for (int i = 0; i < a.length; i++) {

            for (int j= 0; j < a.length; j++) {
                System.out.println("Enter the Element");
                 a[i][j]=sc.nextInt();

            } 
        }
        System.out.println("Array in tabular format:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("%4d", a[i][j]); // Adjust width for formatting
            }
            System.out.println();
        }
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
              sum +=a[i][j];
            }
        }
        System.out.println("Sum is "+sum);
    }
}
