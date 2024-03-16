import java.util.Scanner;
class demo {
     int meters;
     int centimeters;
    public demo(int meters, int centimeters) {
        this.meters = meters;
        this.centimeters = centimeters;
    }
    public void display() {
        System.out.println("Distance: " + meters + " meters and " + centimeters + " centimeters");
    }
    public void sum(demo d1, demo d2) {
        int totalCentimeters = d1.meters * 100 + d1.centimeters + d2.meters * 100 + d2.centimeters;
        int totalMeters = totalCentimeters / 100;
        int remainingCentimeters = totalCentimeters % 100;
        System.out.println("Sum of distances: " + totalMeters + " meters and " + remainingCentimeters + " centimeters");
    }
}
public class Diatance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter distance for First Pannel");
        System.out.println("Enter 1st Distance");
        int a=sc.nextInt();
        System.out.println("Enter 2nd Distance");
        int b=sc.nextInt();
        System.out.println("Enter distance for Second Pannel");
        System.out.println("Enter 1st Distance");
        int x=sc.nextInt();
        System.out.println("Enter 2nd Distance");
        int y=sc.nextInt();
        demo distance1 = new demo(a, b); 
        demo distance2 = new demo(x, y);
        System.out.println("Distance 1:");
        distance1.display();
        System.out.println("Distance 2:");
        distance2.display();
        System.out.println("Adding distances:");
        distance1.sum(distance1, distance2);
    }
}
