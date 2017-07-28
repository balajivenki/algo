package search;

/**
 * Created by bvenkatesan on 7/26/17.
 * http://practice.geeksforgeeks.org/problems/index-of-first-1-in-a-sorted-array-of-0s-and-1s/0
 */
public class FirstIndex {

    public static int findFirstIndex(int[] array, int low, int high) {
        if(low <= high) {
            int mid = low + (high - low)/2;

            if(array[mid] ==1 && (mid == 0 || array[mid -1] == 0)) {
                return  mid;
            } else if(array[mid] == 1) {
                return findFirstIndex(array, low, mid -1);
            } else {
                return findFirstIndex(array, mid + 1, high);
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array = { 0, 0, 0, 0, 0, 0, 1, 1, 1, 1 };
        System.out.println(findFirstIndex(array, 0, array.length-1));
    }
}
