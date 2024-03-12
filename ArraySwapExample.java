import java.util.Arrays;

public class ArraySwapExample {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Original Array: " + Arrays.toString(array));

   
        swapArrayElements(array, 1, 3);

        System.out.println("Array after swapping: " + Arrays.toString(array));
    }
    static void swapArrayElements(int[] arr, int index1, int index2) {
        if (index1 >= 0 && index1 < arr.length && index2 >= 0 && index2 < arr.length) {
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
        } else {
            System.out.println("Invalid indices for swapping.");
        }
    }
}
