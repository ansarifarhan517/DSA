package Algorithms.BinarySearch.BinarySearchUsingPredatorFunctins;

/**
 * FindPeakElementUsingPredicate
 *
 * This class implements an algorithm to find a peak element in an array using a modified binary search.
 * A peak element is defined as an element that is greater than its neighbors. For corner cases,
 * we consider only one neighbor.
 *
 * Approach:
 * - The algorithm uses a binary search strategy to efficiently narrow down the search space.
 * - A predicate function is used to decide whether to search left or right.
 * - If the current element at mid satisfies the predicate (i.e., it is a peak or indicates a descent),
 *   then we adjust the search boundaries accordingly.
 *
 * Example:
 * For an array: [1, 2, 1, 3, 5, 6, 4], one of the peaks is at index 1 (element 2) or index 5 (element 6).
 */
public class FindPeakElementUsingPredicate {

    public static void main(String[] args) {
        // Test array containing several potential peaks.
        int[] arr = { 1, 2, 1, 3, 5, 6, 4 };
        // Print the index of one peak element.
        System.out.println(findPeakElement(arr));
    }

    /**
     * Finds a peak element in the array using a modified binary search.
     *
     * The method handles special cases:
     * - If the array has only one element, that element is trivially a peak.
     *
     * In each iteration of the binary search:
     * - The mid index is computed.
     * - The predicate function checks if the current mid element indicates a peak or descent.
     * - Depending on the predicate result, the search space is adjusted.
     *
     * @param nums The input array in which to find a peak element.
     * @return The index of one peak element.
     */
    public static int findPeakElement(int[] nums) {
        // Handle the edge case where the array contains only one element.
        if (nums.length == 1) {
            return 0;
        }

        // Initialize binary search boundaries.
        int start = 0, end = nums.length - 1, mid;

        // Continue binary search until the search space is reduced to one candidate.
        while (start < end) {
            // Calculate mid to avoid integer overflow.
            mid = start + (end - start) / 2;
            
            // Use the predicate to decide whether to search left or right.
            if (predicate(mid, nums, end, start)) {
                // If the predicate returns true, adjust the right boundary.
                // This indicates that the peak could be at mid or on its left.
                end = mid;
            } else {
                // Otherwise, adjust the left boundary.
                // This indicates that the peak is to the right of mid.
                start = mid + 1;
            }
        }
        // When the loop exits, start == end and points to a peak element.
        return start;
    }

    /**
     * Predicate function used in binary search to determine the direction of the search.
     *
     * This predicate checks for two conditions:
     * 1. If mid is not the last element and arr[mid] is greater than its right neighbor,
     *    then arr[mid] might be a peak (or at least indicates a descent to the right).
     * 2. If mid is not the first element and arr[mid] is less than its left neighbor,
     *    then a peak lies to the left (indicating that the left neighbor is greater).
     *
     * @param mid   The current middle index being evaluated.
     * @param arr   The input array.
     * @param end   The current right boundary of the search.
     * @param start The current left boundary of the search.
     * @return true if the current element at mid or its neighbors suggest that the peak is to the left;
     *         false otherwise, indicating the peak is to the right.
     */
    static boolean predicate(int mid, int[] arr, int end, int start) {
        // If mid is not the last element and arr[mid] is greater than arr[mid + 1],
        // it means the slope is descending to the right, so mid might be a peak.
        if (mid < end && arr[mid] > arr[mid + 1]) {
            return true;
        }
        // If mid is not the first element and arr[mid] is less than arr[mid - 1],
        // it indicates that the slope is ascending from the left, meaning a peak
        // likely exists on the left side.
        if (mid > start && arr[mid] < arr[mid - 1]) {
            return true;
        }
        // Otherwise, the search should continue to the right.
        return false;
    }
}
