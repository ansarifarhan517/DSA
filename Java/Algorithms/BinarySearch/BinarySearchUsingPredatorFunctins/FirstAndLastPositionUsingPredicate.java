package Algorithms.BinarySearch.BinarySearchUsingPredatorFunctins;

public class FirstAndLastPositionUsingPredicate {
    public static void main(String[] args) {
        int[] nums = { 2, 2 };
        int target = 2;

        // The binary search is performed on the array 'nums' using the predicate
        // defined below.
        // The result is printed as a string representation of the returned array.
        int[] res = new int[2];
        res[0] = BinarySearchUsingPredicateForStartIndex(nums, target);
        res[1] = BinarySearchUsingPredicateForEndIndex(nums, target);
        if (res[0] == -1 || res[1] == -1) {
            System.out.println("Element Not found");
        }
        System.out.println(res[0] + " : " + ':' + res[1]);
    }

    /**
     * Performs a binary search using a predicate function to find the first index
     * in the array
     * where the condition (element >= target) is met.
     * 
     * The binary search loop keeps narrowing the search space until 'start' equals
     * 'end', which
     * will be the smallest index for which arr[index] is greater than or equal to
     * target.
     * 
     * Finally, an array with two elements is returned: { start, start + 1 }.
     * (Returning two consecutive indices may be part of the specific problem
     * requirement.)
     *
     * @param arr    The sorted array to search.
     * @param target The target value used in the predicate check.
     * @return An array containing two indices: the first index satisfying (x >=
     *         target) and the next index.
     */
    public static int BinarySearchUsingPredicateForStartIndex(int[] arr, int target) {
        // Initialize the search boundaries.
        // 'start' begins at index 0 and 'end' at the last valid index of the array.
        int start = 0, end = arr.length - 1, mid;

        // Continue the search while there is more than one candidate.
        while (start < end) {
            // Compute mid to avoid potential integer overflow.
            mid = start + (end - start) / 2;

            // Use the predicate to check if the current element meets the condition.
            // In this case, the predicate checks if arr[mid] is greater than or equal to
            // the target.
            if (Predicate(arr[mid], target, "start")) {
                // If the predicate is true, then arr[mid] could be the first occurrence that
                // meets the condition,
                // so we set 'end' to mid.
                // We do not subtract 1 here because we want to include mid as a possible
                // candidate.
                end = mid;
            } else {
                // If the predicate is false, then arr[mid] is less than the target,
                // meaning the desired index must be to the right of mid.
                // So we update 'start' to mid + 1.
                start = mid + 1;
            }
        }
        // At the end of the loop, 'start' (which equals 'end') is the smallest index
        // where arr[index] >= target.
        // We return an array with two consecutive indices.
        return arr[start] == target ? start : -1;
    }

    /**
     * Uses binary search with a modified predicate to find the last occurrence of
     * target.
     * This search also uses a half-open interval [start, end).
     * After the loop, 'start' will point to the first element greater than target,
     * so the last occurrence is at start - 1.
     *
     * @param arr    The sorted array to search.
     * @param target The target value.
     * @return The last index where the value equals the target.
     */
    public static int BinarySearchUsingPredicateForEndIndex(int[] arr, int target) {
        // Initialize the search boundaries.
        // 'start' begins at index 0 and 'end' at the last valid index of the array.
        int start = 0, end = arr.length, mid;

        // Continue the search while there is more than one candidate.
        while (start < end) {
            // Compute mid to avoid potential integer overflow.
            mid = start + (end - start) / 2;

            // Use the predicate to check if the current element meets the condition.
            // In this case, the predicate checks if arr[mid] is greater than or equal to
            // the target.
            if (Predicate(arr[mid], target, "end")) {
                // If the predicate is true, then arr[mid] could be the first occurrence that
                // meets the condition,
                // so we set 'end' to mid.
                // We do not subtract 1 here because we want to include mid as a possible
                // candidate.
                end = mid;
            } else {
                // If the predicate is false, then arr[mid] is less than the target,
                // meaning the desired index must be to the right of mid.
                // So we update 'start' to mid + 1.
                start = mid + 1;
            }
        }
        // At the end of the loop, 'start' (which equals 'end') is the smallest index
        // where arr[index] >= target.
        // We return an array with two consecutive indices.
        return arr[start - 1] != target ? -1 :  start - 1;
    }

    /**
     * Predicate function that checks if a given value 'x' satisfies the condition
     * for the search type indicated by 'searchIndex'.
     *
     * For "start": returns true if x is greater than or equal to t.
     * For "end": returns true if x is strictly greater than t.
     *
     * @param x           The current element from the array.
     * @param t           The target value.
     * @param searchIndex A string indicating the type of search ("start" or "end").
     * @return true if the condition is met, false otherwise.
     */
    public static boolean Predicate(int x, int t, String searchIndex) {
        return searchIndex == "start" ? x >= t : x > t;
    }
}
