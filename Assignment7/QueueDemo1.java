package Assignment7;


import java.util.Scanner;

public class QueueDemo1 {
    public static final int MAX = 5;
    public static int front = -1;
    public static int rear = -1;
    public static void insert(int Q[], int x) {
        if (is_full()) {
            System.out.println("Queue is full. Cannot insert.");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % MAX;
            Q[rear] = x;
            System.out.println("Inserted " + x);
        }
    }
    public static void delete(int Q[]) {
        if (is_empty()) {
            System.out.println("Queue is empty. Cannot delete.");
        } else {
            System.out.println("Deleted " + Q[front]);
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % MAX;
            }
        }
    }
    public static void display(int Q[]) {
        if (is_empty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.print("Queue elements: ");
            int i = front;
            while (true) {
                System.out.print(Q[i] + " ");
                if (i == rear) {
                    break;
                }
                i = (i + 1) % MAX;
            }
            System.out.println();
        }
    }
    public static boolean is_full() {
        return (rear + 1) % MAX == front;
    }
    public static boolean is_empty() {
        return front == -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int queue[] = new int[MAX];

        while (true) {
            System.out.println("***MENU***");
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
                    insert(queue, x);
                    break;
                case 2:
                    delete(queue);
                    break;
                case 3:
                    display(queue);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
