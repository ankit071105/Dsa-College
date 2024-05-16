package Assignment6;
import java.util.Scanner;

public class StackDemo1 {
    public static final int MAX = 10;
    public static int push(int S[], int top, int x) {
        if (isFull(top)) {
            System.out.println("Stack is full. Cannot push.");
        } else {
            S[++top] = x;
            System.out.println("Pushed " + x);
        }
        return top;
    }
    public static int pop(int S[], int top) {
        if (isEmpty(top)) {
            System.out.println("Stack is empty. Cannot pop.");
        } else {
            System.out.println("Popped " + S[top--]);
        }
        return top;
    }
    public static void display(int S[], int top) {
        if (isEmpty(top)) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(S[i] + " ");
            }
            System.out.println();
        }
    }
    public static boolean isEmpty(int top) {
        return top == -1;
    }
    public static boolean isFull(int top) {
        return top == MAX - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stack[] = new int[MAX];
        int top = -1;

        while (true) {
            System.out.println("***MENU***");
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
                    top = push(stack, top, x);
                    break;
                case 2:
                    top = pop(stack, top);
                    break;
                case 3:
                    display(stack, top);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
