import java.lang.Math;
class PointType {
    private double x;
    private double y;
    public PointType(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void setCoordinates(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void printCoordinates() {
        System.out.println("Coordinates: (" + x + ", " + y + ")");
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
}
class CircleType extends PointType {
    private double radius;
    public CircleType(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void printRadius() {
        System.out.println("Radius: " + radius);
    }
    public void printArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area: " + area);
    }
    public void printCircumference() {
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference: " + circumference);
    }
}
public class Point {
    public static void main(String[] args) {

        PointType obj = new PointType(34, 43);
        obj.printCoordinates();
        CircleType obj1 = new CircleType(0, 0, 7.5);
        obj1.printCoordinates();
        obj1.printRadius();
        obj1.printArea();
        obj1.printCircumference();
    }
}
