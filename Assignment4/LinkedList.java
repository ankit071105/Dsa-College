package Assignment4;
import java.util.Scanner;

class Node {
    protected int regd_no;
    protected float mark;
    protected Node next;

    // Constructor
    public Node(int regd_no, float mark) {
        this.regd_no = regd_no;
        this.mark = mark;
        this.next = null;
    }
}

public class LinkedList {
    public static Node create(Node start) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter registration number: ");
        int regd_no = sc.nextInt();
        System.out.print("Enter mark: ");
        float mark = sc.nextFloat();
        Node newNode = new Node(regd_no, mark);
        if (start == null) {
            start = newNode;
        } else {
            Node current = start;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public static void display(Node start) {
        if (start == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = start;
        while (current != null) {
            System.out.println("Registration number: " + current.regd_no + ", Mark: " + current.mark);
            current = current.next;
        }
    }

    public static Node InsBeg(Node start) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter registration number: ");
        int regd_no = sc.nextInt();
        System.out.print("Enter mark: ");
        float mark = sc.nextFloat();
        Node newNode = new Node(regd_no, mark);
        newNode.next = start;
        return newNode;
    }

    public static Node InsEnd(Node start) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter registration number: ");
        int regd_no = sc.nextInt();
        System.out.print("Enter mark: ");
        float mark = sc.nextFloat();
        Node newNode = new Node(regd_no, mark);
        if (start == null) {
            return newNode;
        }
        Node current = start;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        return start;
    }

    public static Node InsAny(Node start, int pos) {
        if (pos < 1) {
            System.out.println("Invalid position");
            return start;
        }
        if (pos == 1) {
            return InsBeg(start);
        }
        Node newNode = new Node(0, 0);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter registration number: ");
        int regd_no = sc.nextInt();
        System.out.print("Enter mark: ");
        float mark = sc.nextFloat();
        newNode.regd_no = regd_no;
        newNode.mark = mark;
        Node current = start;
        for (int i = 1; i < pos - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Invalid position");
            return start;
        }
        newNode.next = current.next;
        current.next = newNode;
        return start;
    }

    public static Node DelBeg(Node start) {
        if (start == null) {
            System.out.println("List is empty");
            return null;
        }
        return start.next;
    }

    public static Node DelEnd(Node start) {
        if (start == null) {
            System.out.println("List is empty");
            return null;
        }
        if (start.next == null) {
            return null;
        }
        Node current = start;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        return start;
    }

    public static Node DelAny(Node start, int pos) {
        if (pos < 1) {
            System.out.println("Invalid position");
            return start;
        }
        if (pos == 1) {
            return DelBeg(start);
        }
        Node current = start;
        Node prev = null;
        for (int i = 1; i < pos && current != null; i++) {
            prev = current;
            current = current.next;
        }
        if (current == null) {
            System.out.println("Invalid position");
            return start;
        }
        prev.next = current.next;
        return start;
    }

    public static void searchAndUpdate(Node start, int regd_no, float newMark) {
        Node current = start;
        boolean found = false;
        while (current != null) {
            if (current.regd_no == regd_no) {
                current.mark = newMark;
                found = true;
                break;
            }
            current = current.next;
        }
        if (!found) {
            System.out.println("Student with registration number " + regd_no + " not found");
        }
    }

    public static void sort(Node start) {
        if (start == null || start.next == null) {
            return;
        }
        Node current = start;
        while (current != null) {
            Node index = current.next;
            while (index != null) {
                if (current.mark < index.mark) {
                    float tempMark = current.mark;
                    current.mark = index.mark;
                    index.mark = tempMark;
                    int tempRegd_no = current.regd_no;
                    current.regd_no = index.regd_no;
                    index.regd_no = tempRegd_no;
                }
                index = index.next;
            }
            current = current.next;
        }
    }

    public static int count(Node start) {
        int count = 0;
        Node current = start;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public static Node reverse(Node start) {
        Node prev = null;
        Node current = start;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        start = prev;
        return start;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node start = null;
        while (true) {
            System.out.println("****MENU*****");
            System.out.println("0:Exit");
            System.out.println("1:Creation");
            System.out.println("2:Display");
            System.out.println("3:Insertion at Beginning");
            System.out.println("4:Insertion at End");
            System.out.println("5:Insertion at Any Position");
            System.out.println("6:Deletion from Beginning");
            System.out.println("7:Deletion from End");
            System.out.println("8:Deletion from Any Position");
            System.out.println("9:Search and Update Mark");
            System.out.println("10:Sort by Mark");
            System.out.println("11:Count Nodes");
            System.out.println("12:Reverse");
            System.out.println("Enter the choice");
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    start = create(start);
                    break;
                case 2:
                    display(start);
                    break;
                case 3:
                    start = InsBeg(start);
                    break;
                case 4:
                    start = InsEnd(start);
                    break;
                case 5:
                    System.out.print("Enter the position: ");
                    int pos = sc.nextInt();
                    start = InsAny(start, pos);
                    break;
                case 6:
                    start = DelBeg(start);
                    break;
                case 7:
                    start = DelEnd(start);
                    break;
                case 8:
                    System.out.print("Enter the position: ");
                    pos = sc.nextInt();
                    start = DelAny(start, pos);
                    break;
                case 9:
                    System.out.print("Enter registration number to search: ");
                    int regd_no = sc.nextInt();
                    System.out.print("Enter new mark: ");
                    float newMark = sc.nextFloat();
                    searchAndUpdate(start, regd_no, newMark);
                    break;
                case 10:
                    sort(start);
                    break;
                case 11:
                    int count = count(start);
                    System.out.println("Number of nodes: " + count);
                    break;
                case 12:
                    start = reverse(start);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}
