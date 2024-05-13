package HomeAssignment;

public class Q2 {
    public static int binarySearch(int[] array, int target) {
        return binarySearch(array, target, 0, array.length - 1);
    }

    public static int binarySearch(int[] array, int target, int low, int high) {
        if (low > high) {

            return -1;
        }

        int mid = low + (high - low) / 2;

        if (array[mid] == target) {
      
            return mid;
        } else if (array[mid] < target) {

            return binarySearch(array, target, mid + 1, high);
        } else {
           
            return binarySearch(array, target, low, mid - 1);
        }
    }

    public static void main(String[] args) {
     
        int[] array = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 3;
        int index = binarySearch(array, target);
        System.out.println("Element " + target + " found at index " + index);
    }
}