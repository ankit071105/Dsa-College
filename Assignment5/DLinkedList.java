package Assignment5;
import java.util.Scanner;
class Node {
     int regd_no;
     float mark;
     Node next;
     Node prev;
}
public class DLinkedList {
    public static Node create(Node start, Node end) {
        int regd_no =213;
        float mark = (float) 23.4521;
        Node obj = new Node();
        if (start == null) {
            start = obj;
            end = obj;
        } else {
            end.next = obj;
            obj.prev = end;
            end = obj;
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
        int regd_no = 231;
        float mark = (float) 34.521451;
        Node newNode = new Node();
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
        int pos = 3;
        if (pos < 1) {
            System.out.println("Invalid position");
            return end;
        }
        if (pos == 1) {
            return insBeg(start, end);
        }
        Node obj1 = new Node();
        int regd_no = 431;
        float mark = (float) 34.23;
        obj1.regd_no = regd_no;
        obj1.mark = mark;
        Node current = start;
        for (int i = 1; i < pos - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null) {
       
            return end;
        }
        obj1.next = current.next;
        if (current.next != null) {
            current.next.prev = obj1;
        }
        obj1.prev = current;
        current.next = obj1;
        return end;
    }
    public static Node delBeg(Node start, Node end) {
        if (start == null) {
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
            return end;
        }
        if (start.next == null) {
            return null;
        }
        Node obj2 = end.prev;
        obj2.next = null;
        return obj2;
    }
    public static Node delAny(Node start, Node end) {
        Scanner sc = new Scanner(System.in); 
        int pos = 6;
        if (pos < 1) {
            return end;
        }
        if (pos == 1) {
            return delBeg(start, end);
        }
        Node c = start;
        for (int i = 1; i < pos && c != null; i++) {
            c = c.next;
        }
        if (c == null) {
            return end;
        }
        if (c.next != null) {
            c.next.prev = c.prev;
        }
        c.prev.next = c.next;
        return end;
    }
    public static void searchAndUpdate(Node start, int regd_no, float newMark) {
        Node c = start;
        boolean found = false;
        while (c != null) {
            if (c.regd_no == regd_no) {
                c.mark = newMark;
                found = true;
                break;
            }
            c = c.next;
        }
        if (!found) {
            System.out.println("" + regd_no + " not found");
        }
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node s = null;
        Node end = null;
        while (true) {
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    end = create(s, end);
                    if (s == null) {
                        s = end;
                    }
                    break;
                case 2:
                    display(s, end);
                    break;
                case 3:
                    end = insBeg(s, end);
                    if (s == null) {
                        s = end;
                    }
                    break;
                case 4:
                    end = insEnd(s, end);
                    if (s == null) {
                        s = end;
                    }
                    break;
                case 5:
                    end = insAny(s, end);
                    if (s == null) {
                        s = end;
                    }
                    break;
                case 6:
                    end = delBeg(s, end);
                    if (s == null) {
                        end = null;
                    }
                    break;
                case 7:
                    end = delEnd(s, end);
                    if (s == null) {
                        end = null;
                    }
                    break;
                case 8:
                    end = delAny(s, end);
                    if (s == null) {
                        end = null;
                    }
                    break;
                    case 9:
                    int regd_no = 43;
                    float newMark = (float) 56.892;
                    searchAndUpdate(s, regd_no, newMark);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}
