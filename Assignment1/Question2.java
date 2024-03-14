import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Weight ");
        double w=sc.nextDouble();
        System.out.println("Enter the Height ");
        double h=sc.nextDouble();
        double b=w/Math.pow(h, 2);
        if (b<18.5) {
            System.out.println("Under Weight");
            
        }else if(b>=18.5 && b<=24.9)
        {
            System.out.println("Normal Weight");
        }
        else if(b>=25 && b<=29.9)
        {
            System.out.println("Over Weight"); 
        }     else if(b>=30)
        {
            System.out.println("Obese"); 
        }


    }
}
