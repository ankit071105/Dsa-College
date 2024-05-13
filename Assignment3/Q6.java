public class Q6 {
    public static <T> int count(T[] array, T item) {
        int count = 0;
        for (T element : array) {
            if (element != null && element.equals(item)) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
    
        Integer[] intArray = {1,23,12,2,33,1,2,3,4,5,6,1,2};
        int intCount = count(intArray, 2);
        System.out.println("Count of 2: " + intCount); // Output: 3

        String[] strArray = {"Jonny", "Jonnys", "Yes", "Papa"};
        int strCount = count(strArray, "Jonnys");
        System.out.println("Count of 'Jonnys': " + strCount); // Output: 3
    }
}
