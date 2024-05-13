package Assignment5;
import java.util.Scanner;

class Node {
    protected int regd_no;
    protected float mark;
    protected Node next;
    protected Node prev;

    // Constructor
    public Node(int regd_no, float mark) {
        this.regd_no = regd_no;
        this.mark = mark;
        this.next = null;
        this.prev = null;
    }
}

public class DLinkedList {
    public static Node create(Node start, Node end) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter registration number: ");
        int regd_no = sc.nextInt();
        System.out.print("Enter mark: ");
        float mark = sc.nextFloat();
        Node newNode = new Node(regd_no, mark);
        if (start == null) {
            start = newNode;
            end = newNode;
        } else {
            end.next = newNode;
            newNode.prev = end;
            end = newNode;
        }
        return end;
    }

    public static void display(Node start, Node end) {
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

    public static Node insBeg(Node start, Node end) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter registration number: ");
        int regd_no = sc.nextInt();
        System.out.print("Enter mark: ");
        float mark = sc.nextFloat();
        Node newNode = new Node(regd_no, mark);
        if (start == null) {
            start = newNode;
            end = newNode;
        } else {
            newNode.next = start;
            start.prev = newNode;
            start = newNode;
        }
        return end;
    }

    public static Node insEnd(Node start, Node end) {
        return create(start, end);
    }

    public static Node insAny(Node start, Node end) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter position: ");
        int pos = sc.nextInt();
        if (pos < 1) {
            System.out.println("Invalid position");
            return end;
        }
        if (pos == 1) {
            return insBeg(start, end);
        }
        Node newNode = new Node(0, 0);
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
            return end;
        }
        newNode.next = current.next;
        if (current.next != null) {
            current.next.prev = newNode;
        }
        newNode.prev = current;
        current.next = newNode;
        return end;
    }

    public static Node delBeg(Node start, Node end) {
        if (start == null) {
            System.out.println("List is empty");
            return end;
        }
        if (start.next == null) {
            return null;
        }
        start.next.prev = null;
        return start.next;
    }

    public static Node delEnd(Node start, Node end) {
        if (start == null) {
            System.out.println("List is empty");
            return end;
        }
        if (start.next == null) {
            return null;
        }
        Node newEnd = end.prev;
        newEnd.next = null;
        return newEnd;
    }

    public static Node delAny(Node start, Node end) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter position: ");
        int pos = sc.nextInt();
        if (pos < 1) {
            System.out.println("Invalid position");
            return end;
        }
        if (pos == 1) {
            return delBeg(start, end);
        }
        Node current = start;
        for (int i = 1; i < pos && current != null; i++) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Invalid position");
            return end;
        }
        if (current.next != null) {
            current.next.prev = current.prev;
        }
        current.prev.next = current.next;
        return end;
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node start = null;
        Node end = null;
        while (true) {
            System.out.println("****MENU*****");
            System.out.println("0: Exit");
            System.out.println("1: Creation");
            System.out.println("2: Display");
            System.out.println("3: Insertion at Beginning");
            System.out.println("4: Insertion at End");
            System.out.println("5: Insertion at Any Position");
            System.out.println("6: Deletion from Beginning");
            System.out.println("7: Deletion from End");
            System.out.println("8: Deletion from Any Position");
            System.out.println("9: Search and Update Mark");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    end = create(start, end);
                    if (start == null) {
                        start = end;
                    }
                    break;
                case 2:
                    display(start, end);
                    break;
                case 3:
                    end = insBeg(start, end);
                    if (start == null) {
                        start = end;
                    }
                    break;
                case 4:
                    end = insEnd(start, end);
                    if (start == null) {
                        start = end;
                    }
                    break;
                case 5:
                    end = insAny(start, end);
                    if (start == null) {
                        start = end;
                    }
                    break;
                case 6:
                    end = delBeg(start, end);
                    if (start == null) {
                        end = null;
                    }
                    break;
                case 7:
                    end = delEnd(start, end);
                    if (start == null) {
                        end = null;
                    }
                    break;
                case 8:
                    end = delAny(start, end);
                    if (start == null) {
                        end = null;
                    }
                    break;
                case 9:
                    System.out.print("Enter registration number to search: ");
                    int regd_no = sc.nextInt();
                    System.out.print("Enter new mark: ");
                    float newMark = sc.nextFloat();
                    searchAndUpdate(start, regd_no, newMark);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}
