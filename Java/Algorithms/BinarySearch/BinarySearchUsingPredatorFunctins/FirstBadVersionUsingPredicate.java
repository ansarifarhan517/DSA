package Algorithms.BinarySearch.BinarySearchUsingPredatorFunctins;

/**
 * 278. First Bad Version
 * 
 * The problem:
 * - You have versions [1, 2, ..., n].
 * - A version is "bad" if it fails quality check, and every version after a bad version is also bad.
 * - The API isBadVersion(version) returns whether a given version is bad.
 * 
 * Goal:
 * - Find the first bad version while minimizing the number of API calls.
 */

public class FirstBadVersionUsingPredicate {

    public static void main(String[] args) {
        // You can create test cases here if needed.
    }

    /**
     * Uses binary search with a predicate (isBadVersion) to find the first bad version.
     * 
     * @param arr An array where arr[i] represents the version number at position i.
     *            Note: In the context of this problem, we assume versions start at 1.
     * @return The first version where isBadVersion returns true.
     */
    public static int BinarySearchUsingPredicate(int[] arr) {
        // Since versions are numbered from 1 to n, we initialize start to 1.
        // We set end to arr.length because arr should have n elements corresponding to versions 1 to n.
        int start = 1, end = arr.length, mid;

        // The loop runs until start is equal to end.
        // This ensures that we narrow down the search space to a single version.
        while (start < end) {
            // Calculate mid using start + (end - start) / 2 to avoid potential integer overflow.
            mid = start + (end - start) / 2;

            // Call the isBadVersion predicate function using arr[mid] as the version number.
            // This simulates the API call that checks whether the given version is bad.
            if (isBadVersion(arr[mid])) {
                // If arr[mid] is a bad version, then the first bad version could be at mid or before mid.
                // Therefore, we set the right boundary to mid.
                // We do not subtract 1 because we don't want to skip any possible candidate.
                // the reason im doing end = mid and not mid - 1 because before mid any value can be the possible answer and if done mid - 1 then it will skip the previos value of mid , do dry run in case not understanding
                end = mid;
            } else {
                // If arr[mid] is not a bad version, then the first bad version must be after mid.
                // So, we adjust the left boundary to mid + 1.
                start = mid + 1;
            }
        }
        // When the loop terminates, start == end and points to the first bad version.
        return start;
    }

    /**
     * Dummy implementation of the isBadVersion predicate.
     * In an actual implementation, this method is provided externally and checks
     * whether the given version fails the quality check.
     *
     * @param version The version number to check.
     * @return true if the version is bad; false otherwise.
     */
    public static boolean isBadVersion(int version) {
        // For demonstration purposes, this is just a placeholder.
        // Replace this logic with the actual API call.
        // For example, if bad version is 4, then:
        // return version >= 4;
        return false;
    }
}
