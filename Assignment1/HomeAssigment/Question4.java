import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows elements of Array: ");
        int n = sc.nextInt();
        System.out.print("Enter number of columns elements of Array: ");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        System.out.print("Enter First array elements of the array: ");
        for (int i = 0; i < n; i++) {
            for (int j= 0; j< n; j++) {
            arr[i][j] = sc.nextInt();
        }
    }
    System.out.println("FirstArray in tabular format:");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j <m; j++) {
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
        int[][] brr = new int[n][m];
        System.out.print("Enter Second array elements of the array: ");
        for (int i = 0; i < n; i++) {
            for (int j= 0; j< n; j++) {
            brr[i][j] = sc.nextInt();
        }
    }
    System.out.println("Second Array in tabular format:");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j <m; j++) {
            System.out.print(brr[i][j]+" ");
        }
        System.out.println();
    }

      int[][] e=addMatrix(arr, brr);
      System.out.println("Resultant Array in tabular format:");
      for (int i = 0; i < n; i++) {
          for (int j = 0; j <m; j++) {
              System.out.print(e[i][j]+" ");
          }
          System.out.println();
      }
    }
    public static int[][] addMatrix(int[][] a, int[][] b)
    {     int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }

        return result;
    }
}
