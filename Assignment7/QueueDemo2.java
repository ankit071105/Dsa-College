package Assignment7;
import java.util.Scanner;
class Node {
    int info;
    Node next;

    Node(int info) {
        this.info = info;
        this.next = null;
    }
}
public class QueueDemo2 {
    public static Node insert(Node rear, Node front, int x) {
        Node newNode = new Node(x);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println("Inserted " + x);
        return rear;
    }
    public static Node delete(Node rear, Node front) {
        if (front == null) {
            System.out.println("Queue is empty. Cannot delete.");
        } else {
            System.out.println("Deleted " + front.info);
            front = front.next;
            if (front == null) {
                rear = null;
            }
        }
        return front;
    }
    public static void display(Node front) {
        if (front == null) {
            System.out.println("Queue is empty.");
        } else {
            Node temp = front;
            System.out.print("Queue elements: ");
            while (temp != null) {
                System.out.print(temp.info + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node rear = null, front = null;

        while (true) {
            System.out.println("****MENU****");
            System.out.println("0: Exit");
            System.out.println("1: Insert");
            System.out.println("2: Delete");
            System.out.println("3: Display");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();

            switch (choice) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("Enter element to insert:");
                    int x = sc.nextInt();
                    if (front == null) {
                        rear = front = insert(rear, front, x);
                    } else {
                        rear = insert(rear, front, x);
                    }
                    break;
                case 2:
                    front = delete(rear, front);
                    if (front == null) {
                        rear = null;
                    }
                    break;
                case 3:
                    display(front);
                    break;
                default:
                    System.out.println("Wrong choice");
                    break;
            }
        }
    }
}
