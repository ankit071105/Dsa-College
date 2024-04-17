class Box<T> {
    private T content;

    public Box(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}

public class Q4 {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>("Hello");
        Box<String> anotherStringBox = stringBox;
        System.out.println("Original string content: " + stringBox.getContent());
        System.out.println("Another string box content: " + anotherStringBox.getContent());
        anotherStringBox.setContent("World");
        System.out.println("After changing content in another string box:");
        System.out.println("Original string content: " + stringBox.getContent());
        System.out.println("Another string box content: " + anotherStringBox.getContent());
        Box<Integer> intBox = new Box<>(10);
        Box<Integer> anotherIntBox = intBox;
        System.out.println("\nOriginal integer content: " + intBox.getContent());
        System.out.println("Another integer box content: " + anotherIntBox.getContent());
        anotherIntBox.setContent(20);
        System.out.println("After changing content in another integer box:");
        System.out.println("Original integer content: " + intBox.getContent());
        System.out.println("Another integer box content: " + anotherIntBox.getContent());
        
    }
}
