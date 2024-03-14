import java.util.Scanner;

public class Question9 {
    public static double sumMajorDiagonal(double aa[][])
    {
        double sum=0;
        for (int i=0 ;i<aa.length ; i++) {
            for (int j=0 ;j<aa.length; j++) {
               if(aa[i][j]==aa[j][i])
               {
                sum +=aa[i][j];
               }
            }
        }
return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Row element of array");
        int n=sc.nextInt();
        System.out.println("Enter the Column element of array");
        int m=sc.nextInt();
        double[][] aa=new double[n][m];
        for (int i=0 ;i<n ; i++) {
            for (int j=0 ;j<m; j++) {
                System.out.println("Enter the element of array");
                aa[i][j]=sc.nextDouble();
            }
        }
        System.out.println("The sum of diagonal is "+sumMajorDiagonal(aa));
    }


}
