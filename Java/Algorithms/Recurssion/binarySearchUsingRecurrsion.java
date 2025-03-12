import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class binarySearchUsingRecurrsion {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        // System.out.println(binarySearch(arr, 5));
        System.out.println(BinarySearchRecursive(arr, 5, 0, arr.size() - 1));
    }

    static int binarySearch(ArrayList<Integer> arr, int target) {
        int start = 0, end = arr.size() - 1, mid;

        while (start <= end) {
            mid = start + (end - start) / 2;
            if (target == arr.get(mid)) {
                return mid;
            } else if (target > arr.get(mid)) {
                start = mid + 1;
            } else if (target < arr.get(mid)) {
                end = mid - 1;
            }
        }
        return -1;
    }

    static int BinarySearchRecursive(ArrayList<Integer> arr, int target, int start, int end) {

        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (target == arr.get(mid)) {
            return mid;
        } else if (target > arr.get(mid)) {
            return BinarySearchRecursive(arr, target, mid + 1, end);
        } else {
            return BinarySearchRecursive(arr, target, start, mid - 1);

        }
    }

}

// Linear Recursion
// Divide and Conqure Recursion