/**
 * Sorted
 */
public class Sorted {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 0 , 4, 5, 6 };
        System.out.println(isSorted(arr, 0));
    }

    static boolean isSorted(int[] array, int index) {
        if (index == array.length - 1) {
            return true;
        }
        if (array[index] < array[index + 1]) {
            return isSorted(array, index + 1);
        } else {
            return false;
        }
    }
}