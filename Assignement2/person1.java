import java.util.Scanner;

class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {
    int Eid;
    double salary;
    Employee(String name, int age, int Eid, double salary) {
        super(name, age);
        this.Eid = Eid;
        this.salary = salary;
    }
    void empDisplay() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Age: " + age);
        System.out.println("Employee ID: " + Eid);
        System.out.println("Employee Salary ₹ " + salary);
    }
}

public class person1 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Employee Name");
        String v=sc.next();
        System.out.println("Enter Employee Age");
        int x=sc.nextInt();
        System.out.println("Enter Employee ID");
        int y=sc.nextInt();
        System.out.println("Enter Employee Salary");
        double z=sc.nextDouble();
        Employee obj = new Employee(v,x,y,z);
        obj.empDisplay();
    }
}
