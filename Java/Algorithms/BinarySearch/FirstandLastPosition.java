package Algorithms.BinarySearch;

import java.util.Arrays;

public class FirstandLastPosition {
    public static void main(String[] args) {
         FirstandLastPosition obj = new FirstandLastPosition();
        int[] nums = {5, 7, 7, 8, 8, 8, 10};
        int target = 8;
        System.out.println(Arrays.toString(obj.searchRange(nums, target)));
    }

    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
         res[0] =  findStartAndEndIndex(nums, target, "startIndex");
         res[1] =  findStartAndEndIndex(nums, target, "lastIndex");
         return res;
   }

   public static int findStartAndEndIndex(int[] arr, int target, String index) {
       int start = 0, end = arr.length - 1, mid;
       while (start <= end) {
           mid = (start + end) / 2;
           if (arr[mid] == target) {
               if (index == "startIndex") {
                   if (mid != 0 && arr[mid - 1] == target) {
                       end = mid - 1;

                   } else {
                       return mid;

                   }
               } else if (index == "lastIndex") {
                   if (mid != arr.length - 1 && arr[mid + 1] == target) {
                       start = mid + 1;

                   } else {
                       return mid;

                   }
               }
           } else if (arr[mid] > target) {
               end = mid - 1;
           } else {
               start = mid + 1;
           }
       }
       return -1;
   }
}
