import java.util.Scanner;

interface demo {
    void display();
    int count();
}
class demo1 implements demo {
    static int maxCount = 100; 
    String name;
    public demo1(String name) {
        this.name = name;
    }
    public void display() {
        System.out.println("Name: " + name);
    }

    public int count() {
        return name.length();
    }
}
public class DetailInfo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String...");
        String s=sc.nextLine();
        demo1 obj = new demo1(s);
        obj.display();
        int charCount = obj.count();
        System.out.println("Number of characters in the name: " + charCount);
        System.out.println("Max count: " + demo1.maxCount);
    }
}
