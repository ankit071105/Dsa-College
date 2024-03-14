import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        int d,s=0,p=1;
        while (n !=0) {
            d=n%10;
            s +=d;
            p *=d;
            n /=10;
        }
        if(s==p)
        {
            System.out.println("Spy Number");
        }else{
            System.out.println("Not a Spy Number");
        }
    }
}
