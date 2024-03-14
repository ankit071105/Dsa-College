import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int a,b,c;
       System.out.println("Input 3 Number");
       a=sc.nextInt();
       b=sc.nextInt();
       c=sc.nextInt();
       if (a+b==c) {
        System.out.println("the Formula of Sum is valid ");
       }else if(a*b==c){
        System.out.println("the Formula of Product is valid ");
       }else if(a==b+c){
        System.out.println("the Formula of Sum is valid ");
       }else{
        System.out.println("The formula is not valid");
       }
    }
}
