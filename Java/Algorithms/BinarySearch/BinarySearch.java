// package BinarySearch;
//This is Normal Binary Search Code 

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,0,1,1,1};
        int target = 0;
        // int pivot = FindPivot(arr);
        // if (arr[pivot] == target) {
        //     System.out.println("Element Found : " + pivot);
        // } else if (arr[0] > target) {
        //     int elementFound = BinarySearch(arr, target, pivot + 1, arr.length - 1);
        //     if (elementFound != -1) {
        //         System.out.println("Element Found in Second Phase : " + elementFound);
        //     } else {
        //         System.out.println("Element Not Found in Second Phase : " + elementFound);
        //     }
        // } else if (arr[0] < target) {
        //     int elementFound = BinarySearch(arr, target, 0, pivot);
        //     if (elementFound != -1) {
        //         System.out.println("Element Found in First Phase : " + elementFound);
        //     } else {
        //         System.out.println("Element Not Found in First Phase : " + elementFound);
        //     }
        // }

        System.out.println(binarySearch(arr, target));
        // System.out.println(BinarySearch(arr, target, 0, arr.length - 1));
    }

    // 5 1 2 3 4
    static int FindPivot(int[] arr) {
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

    static int BinarySearch1(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    static int BinarySearchWithoutPivot(int[] arr, int target) {
        // 5 1 2 3 4
        // 2 3 4 1 0 , T= 1
        int start= 0 , end = arr.length -1 , mid;
        while (start <= end) {
            mid = (start + end) /2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[start] <= arr[mid]){ //check where is  Sorted Range left or right  if left
                if(target >= arr[start] && target <= arr[mid]){// 
                    end = mid - 1;
                }else {
                    start = mid + 1; 
                }
            }else {//check where is  Sorted Range left or right  if right
                if(target > arr[mid] && target <= arr[end]){
                    start = mid + 1;
                }else {
                    end = mid - 1; 
                }
            }
        }
        return -1;
    }

    static boolean binarySearch(int[] arr, int target) {
        int start = 0, end = arr.length - 1, mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            //[1,0,1,1,1]
            if (target == arr[mid]) {
                return true;
            } 
            else if(arr[start] == arr[mid] && arr[mid] == arr[end]){
                start++;
                end--;
            }
            else if (arr[start] <= arr[mid]) {
                if (target >= arr[start] && target <= arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target >= arr[mid] && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;

                }
            }
        }
        return false;
    }

}
