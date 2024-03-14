
public class Question1 {
    public static void main(String[] args) {
        int a=Integer.parseInt(args[0]);
      int c=0;
        while (a>=2) {
            a /=2;
            c++;
        
        }
        System.out.println("The number of times one must repeatedly divide this number by  2before getting a value less than 2 is "+c);
    }
}
