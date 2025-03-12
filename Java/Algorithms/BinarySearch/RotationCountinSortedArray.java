

public class RotationCountinSortedArray {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 1, 2 ,3};
        int index = getRotationCount(arr);
        if (index != -1) {
            System.out.println("Number of Rotation Found: " + (index + 1));
        } else {
            System.out.println("No Rotation Found");
        }
    }

    static int getRotationCount(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[start] > arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
