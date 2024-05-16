package Assignment6;
import java.util.Scanner;

class Node {
    int info;
    Node next;

    Node(int info) {
        this.info = info;
        this.next = null;
    }
}

public class StackDemo2 {
    public static Node push(Node top, int x) {
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
        System.out.println("Pushed " + x);
        return top;
    }
    public static Node pop(Node top) {
        if (top == null) {
            System.out.println("Stack is empty. Cannot pop.");
        } else {
            System.out.println("Popped " + top.info);
            top = top.next;
        }
        return top;
    }
    public static void display(Node top) {
        if (top == null) {
            System.out.println("Stack is empty.");
        } else {
            Node temp = top;
            System.out.print("Stack elements: ");
            while (temp != null) {
                System.out.print(temp.info + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node top = null;

        while (true) {
            System.out.println("****MENU****");
            System.out.println("0: Exit");
            System.out.println("1: Push");
            System.out.println("2: Pop");
            System.out.println("3: Display");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();

            switch (choice) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("Enter element to push:");
                    int x = sc.nextInt();
                    top = push(top, x);
                    break;
                case 2:
                    top = pop(top);
                    break;
                case 3:
                    display(top);
                    break;
                default:
                    System.out.println("Wrong choice");
                    break;
            }
        }
    }
}
