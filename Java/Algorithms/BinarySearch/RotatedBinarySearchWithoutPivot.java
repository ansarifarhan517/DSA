public class RotatedBinarySearchWithoutPivot {

    public static void main(String[] args) {
        int[] arr = {  4 ,5 ,1 ,2 ,3 };
        int target = 5;
        System.out.println(getRotatedBinarySearchWithoutPivot(arr, target, 0, arr.length - 1));
    }

    static int getRotatedBinarySearchWithoutPivot(int[] arr, int target, int start, int end) {
        // 5 6 7 8 9 1 2 3
        // 4 5 1 2 3
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (target == arr[mid]) {
            return mid;
        }
        if (arr[start] <= arr[mid]) {
            if (arr[start] <= target && arr[mid] >= target) {
                return getRotatedBinarySearchWithoutPivot(arr, target, start, mid - 1);
            } else {
                return getRotatedBinarySearchWithoutPivot(arr, target, mid + 1, end);
            }
        } else {
            if (arr[mid] <= target && arr[end] >= target) {
                return getRotatedBinarySearchWithoutPivot(arr, target, mid + 1, end);

            } else {
                return getRotatedBinarySearchWithoutPivot(arr, target, start, mid - 1);
            }
        }
    }
}
