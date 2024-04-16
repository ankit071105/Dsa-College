import java.util.Scanner;

public class Distance {
    private int meters;
    private int centimeters;
    public Distance(int meters, int centimeters) {
        this.meters = meters;
        this.centimeters = centimeters;
    }
    public void display() {
        System.out.println("Distance: " + meters + " meters " + centimeters + " centimeters");
    }
    public void sum(Distance d1, Distance d2) {
        int totalMeters = d1.meters + d2.meters;
        int totalCentimeters = d1.centimeters + d2.centimeters;
        if (totalCentimeters >= 100) {
            totalMeters += totalCentimeters / 100;
            totalCentimeters %= 100;
        }

        System.out.println("Sum of distances:");
        System.out.println("Meters: " + totalMeters);
        System.out.println("Centimeters: " + totalCentimeters);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("The first Distance in meter");
        int x=sc.nextInt();
        System.out.println("The first Distance in centimeter");
        int y=sc.nextInt();
        System.out.println("The second Distance in meter");
        int a=sc.nextInt();
        System.out.println("The second Distance in centimeter");
        int b=sc.nextInt();
        Distance distance1 = new Distance(x, y);
        Distance distance2 = new Distance(a, b); 
        System.out.println("Distance 1:");
        distance1.display();
        System.out.println("Distance 2:");
        distance2.display();
        distance1.sum(distance1, distance2);
    }
}
