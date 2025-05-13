package Algorithms.BinarySearch;

public class RotatedBinarySearchWithPivot {
    public static void main(String[] args) {
        int[] arr = { 1,2 };
        int target = 0;
        System.out.println(FindPeak(arr));
        // int pivot = findPivotWithDuplicates(arr);
        // if (arr[pivot] == target) {
        // System.out.println("Element Found : " + pivot);
        // } else if (arr[0] > target) {
        // int elementFound = BinarySearch(arr, target, pivot + 1, arr.length - 1);
        // if (elementFound != -1) {
        // System.out.println("Element Found in Second Phase : " + elementFound);
        // } else {
        // System.out.println("Element Not Found in Second Phase : " + elementFound);
        // }
        // } else if (arr[0] < target) {
        // int elementFound = BinarySearch(arr, target, 0, pivot);
        // if (elementFound != -1) {
        // System.out.println("Element Found in First Phase : " + elementFound);
        // } else {
        // System.out.println("Element Not Found in First Phase : " + elementFound);
        // }
        // }
        // if (arr[0] < target && arr[pivot] > target) {
        // System.out.println(BinarySearch(arr, target, 0, pivot));
        // } else if (arr[pivot] < target && arr[arr.length - 1] > target) {
        // System.out.println(BinarySearch(arr, target, pivot + 1, arr.length - 1));
        // }

    }

    static int BinarySearch(int[] array, int target, int start, int end) {
        int mid = start + (end - start) / 2;
        if (start > end) {
            return -1;
        }
        if (target == array[mid]) {
            return mid;
        }
        if (target > array[mid]) {
            return BinarySearch(array, target, mid + 1, end);
        } else if (target < array[mid]) {
            return BinarySearch(array, target, start, mid - 1);
        }
        return mid;
    }

    static int FindPivot(int[] arr) {

        int start = 0, end = arr.length - 1;
        // 3 4 5 6 2
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            if (arr[start] < arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;

    }

    static int findPivotWithDuplicates(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;

            } else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int FindPeak(int[] arr) {
        int start = 0, end = arr.length - 1, mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            if (arr[start] < arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int FindPeakInDuplicate(int[] arr) {
        int start = 0, end = arr.length - 1, mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
                if (start < end && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }

            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

}
