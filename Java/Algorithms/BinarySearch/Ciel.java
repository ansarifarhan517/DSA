class Ciel {
    public static void main(String args[]) {
        int[] arr = { 1, 3, 4, 5, 7 };
        int target = 6;
        int res = findCiel(arr, target);
        System.out.println(res + ":Result");
    }

    public static int findCiel(int[] arr, int target) {
        int start = 0, end = arr.length - 1, mid;

        while (start <= end) {
            mid = (start + end ) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }
        }

        return arr[start];
    }
}