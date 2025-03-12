import java.util.Arrays;

/**
 * BubbleSort
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) { // this loop to run pass i.e n - 1 pass
            boolean swapped = false; // flag if no swapping means array is sorted then break the loop
            for (int j = 1; j < arr.length; j++) { // this loop to check every elemnt and swap in every pass
                if (arr[j] < arr[j - 1]) { // j starts from 1 so check if prevos elemnt of j is bigger to swap
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}