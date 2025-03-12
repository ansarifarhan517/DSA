public class Floor {
    public static void main(String args[]) {
        int[] arr = { 1, 4, 5, 8, 12 };
        // int[] numbers = new int[5];
        int target = 10;
        System.out.println(FindFloor(arr, target));
    }

    public static int FindFloor(int[] arr, int target) {
        int start = 0, end = arr.length - 1, mid;

        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }
        }
        return arr[end];
    }
}
