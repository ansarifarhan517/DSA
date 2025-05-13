package Algorithms.BinarySearch.BinarySearchUsingPredatorFunctins;

/**
 * MinimumInRotatedSortedArray
 *
 * This class provides a solution to finding the minimum element in a rotated sorted array.
 * A rotated sorted array is one that was initially sorted in ascending order, but then rotated
 * at some pivot unknown to us. For example, an originally sorted array [1, 2, 3, 4, 5] might
 * be rotated to become [3, 4, 5, 1, 2].
 *
 * Approach:
 * - We perform a modified binary search to find the point of rotation (i.e., the minimum element).
 * - A predicate function is used to check if the element at a given index (mid) is on the rotated
 *   portion of the array.
 * - If arr[mid] is greater than or equal to arr[0], it means arr[mid] is in the first (sorted) part,
 *   and thus the minimum must be to the right.
 * - Otherwise, arr[mid] is in the rotated portion, and the minimum could be at mid or to the left.
 *
 * Note:
 * - After the binary search loop, 'start' will indicate the index of the smallest element.
 * - However, if the array is not rotated (i.e., already sorted), the first element is the smallest.
 */
public class MinimumInRoatedSortedArray {

    public static void main(String[] args) {
        // Test case: A rotated sorted array
        int[] nums = {2, 1};
        // Print the minimum element found in the array.
        System.out.println(binarySearchUsingPredicate(nums));
    }

    /**
     * Performs a binary search using a predicate function to find the minimum element in a rotated sorted array.
     *
     * The method uses a half-open interval [start, end] to narrow down the search space. At each iteration,
     * it checks whether the element at mid is in the rotated portion of the array.
     *
     * @param arr The rotated sorted array.
     * @return The minimum element in the array.
     */
    static int binarySearchUsingPredicate(int[] arr) {
        int start = 0, end = arr.length - 1, mid;

        // Continue the binary search until the search space is narrowed to a single element.
        while (start < end) {
            // Calculate mid avoiding potential integer overflow.
            mid = start + (end - start) / 2;

            // Use the predicate function to check if the element at mid is in the rotated part.
            if (Predicate(mid, arr)) {
                // If true, the minimum is at mid or to the left.
                end = mid;
            } else {
                // If false, the minimum must be to the right of mid.
                start = mid + 1;
            }
        }
        // After narrowing the search space:
        // - If the array is rotated, the minimum element is at index 'start'.
        // - If the array is not rotated (i.e., already sorted), then the first element is the smallest.
        // We check this by comparing arr[0] and the last element of the array.
        return arr[0] > arr[arr.length - 1] ? arr[start] : arr[0];
    }

    /**
     * Predicate function used in binary search to determine whether arr[mid] is in the rotated portion of the array.
     *
     * The logic is as follows:
     * - If arr[mid] is greater than or equal to arr[0], then arr[mid] is part of the original sorted order
     *   (before the rotation point), so it cannot be the minimum. Return false.
     * - Otherwise, arr[mid] is in the rotated portion (after the rotation point), which may contain the minimum.
     *   Return true.
     *
     * @param mid The current mid index being evaluated.
     * @param arr The rotated sorted array.
     * @return true if arr[mid] is in the rotated part of the array; false otherwise.
     */
    public static boolean Predicate(int mid, int[] arr) {
        // Check if the element at mid is less than the first element.
        // If so, then it lies in the rotated part of the array.
        return arr[mid] < arr[0];
    }
}
