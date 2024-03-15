import java.util.Scanner;

public class Book {
    double BPrice;
    String BName;
   int BEdition;
    Book(double BPrice, String BName, int BEdition)
    {
        this.BPrice=BPrice;
        this.BEdition=BEdition;
        this.BName=BName;
    }
    void display(){
     System.out.println("The Book Name is "+BName);
     System.out.println("The Book Edition is "+BEdition);
     System.out.println("The Book Price is "+BPrice);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter How Many detail You Want");
        int n=sc.nextInt();
        for (int index = 1; index <= n; index++) {
            System.out.println();
         System.out.println("Enter the Detail For Book Number "+index);
         System.out.println("Enter the Book Name");
         String x=sc.next();
         System.out.println("Enter the Book Edition");
         int y=sc.nextInt();
         System.out.println("Enter the Book Price");
         double z=sc.nextDouble();
   

         Book obj=new Book(z, x, y);
         obj.display();
        }
    }
}
