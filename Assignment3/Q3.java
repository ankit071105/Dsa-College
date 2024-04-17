class demo extends Exception {
    public demo(String message) {
        super(message);
    }
}

public class Q3 {
    private String name;
    private int mark;

    public Q3(String name, int mark) throws demo {
        if (mark > 100) {
            throw new demo("Marks cannot be more than 100.");
        }
        this.name = name;
        this.mark = mark;
    }
    public static void main(String[] args) {
        try {
            Q3 student1 = new Q3("avnish", 95);
            System.out.println("Student: " + student1.getName() + ", Mark: " + student1.getMark());

            Q3 student2 = new Q3("Kalin", 110);
        } catch (demo e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public String getName() {
        return name;
    }

    public int getMark() {
        return mark;
    }
}
