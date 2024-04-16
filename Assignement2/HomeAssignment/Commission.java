
import java.util.Scanner;
public class Commission {
   static int sales;
   static double a;
    Commission()
    {
       this.sales=sales;
      a=0;
    }
   public static double getCommission()
    {
       if(sales <0){
        System.out.println("Invalid Input");
       }else
        if(sales > 100 && sales <500)
        {
            a= (2*sales)/100;
        }else if(sales >= 500 && sales < 5000)
        {
            a= (5*sales)/100;
        }else if(sales >=5000)
        {   
            a= (8*sales)/100;

        }
        return a;
           
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sales");
        int x=sc.nextInt();
        Commission obj=new Commission();
        obj.sales=x;
       double y= obj.getCommission();
     double  result= (x - y);
     System.out.println("The Sales is "+x);
       System.out.println("The comission is "+y);
       System.out.println("After removing comission the rest amount is "+result);

    }
}
