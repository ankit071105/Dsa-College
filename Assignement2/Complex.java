import java.util.Scanner;
public class Complex {
    double real,imag;
    void setData()
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter First number");
       real=sc.nextDouble();
       System.out.println("Enter Second number");
       imag=sc.nextDouble();
    }
    public void display() {
        System.out.println(real + " + " + imag + "i");
    }
    public static Complex add(Complex x, Complex y) {
        double p = x.real + y.real;
        double q = x.imag + y.imag;
        Complex result = new Complex();
        result.real = p;
        result.imag = q;
        return result;
    }
    public static void main(String[] args) {
        Complex num1 = new Complex();
        Complex num2 = new Complex();
        System.out.println("Enter data for Complex Number 1:");
        num1.setData();
        System.out.println("Enter data for Complex Number 2:");
        num2.setData();
        System.out.print("Complex Number 1: ");
        num1.display();
        System.out.print("Complex Number 2: ");
        num2.display();
        Complex sum = Complex.add(num1, num2);
        System.out.print("Sum of Complex Numbers: ");
        sum.display();
    }
}
