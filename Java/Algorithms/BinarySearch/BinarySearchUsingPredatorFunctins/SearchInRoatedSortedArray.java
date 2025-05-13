package Algorithms.BinarySearch.BinarySearchUsingPredatorFunctins;

/**
 * SearchInRotatedSortedArray
 *
 * This class implements a binary search algorithm for a rotated sorted array.
 * A rotated sorted array is an array that was originally sorted in ascending order
 * but then rotated (shifted) at an unknown pivot.
 *
 * Example: [4, 5, 6, 7, 0, 1, 2]
 *
 * The algorithm uses a predicate function to adjust the comparison logic for elements
 * that are on different sides of the rotation point. This is done by mapping values
 * to either Integer.MAX_VALUE or Integer.MIN_VALUE when they are on the "wrong" side
 * relative to the target. This allows the binary search to effectively ignore the rotated
 * portion that is not relevant for finding the target.
 *
 * For example:
 * - If the target is in the left part (>= arr[0]), any element in the right part (< arr[0])
 *   is mapped to Integer.MAX_VALUE so that it appears greater than the target.
 * - Conversely, if the target is in the right part (< arr[0]), any element in the left part (>= arr[0])
 *   is mapped to Integer.MIN_VALUE so that it appears smaller than the target.
 */
public class SearchInRoatedSortedArray {
    public static void main(String[] args) {
        // Example rotated sorted array.
        int[] nums = {5, 1, 3};
        int target = 5;
        // Perform binary search and print the index of the target.
        System.out.println(BinarySearchUsingPredicate(nums, target));
    }

    /**
     * Performs a modified binary search on a rotated sorted array to find the target value.
     *
     * The method uses a predicate function to "normalize" the mid value, mapping it to
     * an extreme value when it is on the opposite side of the rotation compared to the target.
     * This ensures the binary search can continue to work correctly even in the rotated array.
     *
     * @param arr    The rotated sorted array.
     * @param target The target value to search for.
     * @return The index of the target if found; otherwise, -1.
     */
    public static int BinarySearchUsingPredicate(int[] arr, int target) {
        int start = 0, end = arr.length - 1, mid;
        
        // Perform binary search using a while loop until the search space is narrowed to one element.
        while (start < end) {
            mid = start + (end - start) / 2;
            
            // The predicate adjusts the value of arr[mid] based on the position relative to the rotation.
            if (Predicate(mid, target, arr)) {
                // If the normalized value is greater than or equal to target,
                // then the target is in the left half (including mid).
                end = mid;
            } else {
                // Otherwise, the target must be in the right half.
                start = mid + 1;
            }
        }
        // After the loop, start should point to the target if it exists.
        return arr[start] == target ? start : -1;
    }

    /**
     * Predicate function used to decide which half of the array to search.
     *
     * This function "normalizes" the value at arr[mid] based on the relative position
     * of the target to arr[0]. The comparison works as follows:
     *
     * 1. If both target and arr[mid] are on the same side of the rotation (i.e., both are
     *    greater than or equal to arr[0] or both are less than arr[0]), then we compare the
     *    actual arr[mid] value.
     *
     * 2. If they are on different sides, then:
     *    - If target is on the left side (target >= arr[0]), map arr[mid] to Integer.MAX_VALUE.
     *      This effectively makes arr[mid] appear very large, so binary search will search left.
     *    - If target is on the right side (target < arr[0]), map arr[mid] to Integer.MIN_VALUE.
     *      This makes arr[mid] appear very small, so binary search will search right.
     *
     * @param mid    The current mid index being evaluated.
     * @param target The target value.
     * @param arr    The rotated sorted array.
     * @return true if the "normalized" value at arr[mid] is greater than or equal to the target; false otherwise.
     */
    public static boolean Predicate(int mid, int target, int[] arr) {
        int val;
        
        // Check if target and arr[mid] are on the same side of the rotation.
        // We use .equals() logic for booleans by comparing the two conditions.
        if ((target >= arr[0]) == (arr[mid] >= arr[0])) {
            // Both target and arr[mid] are on the same side.
            val = arr[mid];
        } else {
            // They are on different sides.
            if (target >= arr[0]) {
                // If target is on the left side (>= arr[0]),
                // then arr[mid] is on the right side; we assign it a very high value.
                val = Integer.MAX_VALUE;
            } else {
                // If target is on the right side (< arr[0]),
                // then arr[mid] is on the left side; we assign it a very low value.
                val = Integer.MIN_VALUE;
            }
        }
        // Compare the normalized value with the target.
        return val >= target;
    }
}
