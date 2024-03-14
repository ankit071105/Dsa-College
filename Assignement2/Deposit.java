import java.util.Scanner;

public class Deposit {
   long Principal;
   int time;
   double rate;
  int  Totamt;
    Deposit()
    {
        this.Principal = 4500;
        this.time = 2;
        this.rate = 9.45;
        calcAmt();
     
    }
    Deposit(long Principal,int time,double rate)
    {
        this.Principal = Principal;
        this.time = time;
        this.rate = rate;
        calcAmt();
     
    }
    Deposit(long Principal,int time)
    {
        this.Principal = Principal;
        this.time = time;
        this.rate = 0;
        calcAmt();
     
    }
    Deposit(long Principal,double rate)
    {
        this.Principal = Principal;
        this.time = 0;
        this.rate = rate;
        calcAmt();
     
    }
   
    void display()
    {
       System.out.println("Total Interest of the money deposit is "+Totamt);
    }
    void calcAmt()
    {
        Totamt =(int) (Principal + (Principal*rate*time)/100);
    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Principal ");
        long x=sc.nextLong();
        System.out.println("Enter The Time ");
        int y=sc.nextInt();
        System.out.println("Enter The Rate ");
        double z=sc.nextDouble();
        Deposit obj =new Deposit();
        obj.display();
        Deposit obj1 =new Deposit(x,y,z);
        obj1.display();
        Deposit obj2 =new Deposit(x,y);
        obj2.display();
        Deposit obj3 =new Deposit(x,z);
        obj3.display();
     }
}
