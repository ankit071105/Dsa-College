import java.util.Scanner;
class Person {
int age;
String name;
void setData()
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter tha age");
    age=sc.nextInt();
    System.out.println("Enter the Name");
    name=sc.next();
}   
void display()
{
    System.out.println("The name is "+name+" and the age is "+age);
}
public static void main(String[] args) {
    Person obj=new Person();
    Person obj1=new Person();
    obj.name="Ankit";
    obj.age=20;
    obj1.setData();
    if(obj.age >= obj1.age)
    {
        System.out.println("The "+obj.name +" is greater in age ");
    }else{
        System.out.println("The "+obj1.name +" is greater in age ");
    }
    obj.display();
    obj1.display();
}
    
}