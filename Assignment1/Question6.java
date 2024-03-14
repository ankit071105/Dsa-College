import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        System.out.println("The Number is odd ? "+isOdd(num));
    }
    public static boolean isOdd(int n)
    {
        return (n & 1)==1;
    }
}
