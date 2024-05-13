package HomeAssignment;

public class Q7 {
    public static void rearrange(int[] arr, int k) {
        rearrange(arr, k, 0);
    }

    private static void rearrange(int[] arr, int k, int index) {
        if (index >= arr.length) {
            return;
        }
        
        if (arr[index] <= k) {
            swap(arr, index, 0);
        }

        rearrange(arr, k, index + 1);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 2, 7, 5, 8, 6};
        int k = 4;
        rearrange(arr, k);
        System.out.print("Rearranged array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
