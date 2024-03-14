import java.util.Scanner;

public class Product {
   int proID;
   double price;
   int quantity;
   static double TotalPrice=0;
   Product(int proID,double price, int quantity) 
   {
    this.proID = proID;
    this.price = price;
    this.quantity = quantity;
    TotalPrice += price * quantity;
   }
   public void display() {
    System.out.println("Product ID: " + proID);
    System.out.println("Price per unit: $" + price);
    System.out.println("Quantity: " + quantity);
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int x,z;
    double y;
    for(int i=1;i<=5;i++)
  {
    System.out.println("Enter the Proof Id for  Product Number "+i);
     x=sc.nextInt();
    System.out.println("Enter the Price of the Product");
     y=sc.nextDouble();
    System.out.println("The Quantity of the Product");
      z=sc.nextInt();
      Product obj = new Product(x, y, z);
      System.out.println("Product " + i + " added successfully!");
      System.out.println();
  }
  System.out.println("Total amount to pay: ₹ " + Product.TotalPrice);

}
}
