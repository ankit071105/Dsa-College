import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the digit");
        int num=sc.nextInt();
        System.out.println(sum_of_digit(num));
    }
    public static int sum_of_digit(int n)
    {
        int s=0,p=0,q=0;
        while (n!=0) {
            s +=n%10;
            n /=10;
        }
        while (s!=0) {
            p +=s%10;
            s /=10;
        }
        while (p!=0) {
            q +=p%10;
            p /=10;
        }
        return q;

    }
}
