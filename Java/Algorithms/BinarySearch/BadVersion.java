package Algorithms.BinarySearch;

public class BadVersion {
    /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

    public int firstBadVersion(int n) {
     int start = 1, end = n, mid;
     while (start < end ){
        mid= start + (end - start) / 2;
        if(isBadVersion(mid)){ //this is predicate
            end = mid;
        }else {
            start = mid + 1;
        }
     }
     return end;
    }
}
