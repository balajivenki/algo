package arrays;

import java.util.Arrays;

/**
 * Created by bvenkatesan on 7/26/17.
 *
 * http://www.geeksforgeeks.org/element-1st-array-count-elements-less-equal-2nd-array/
 */
public class CountElements {

    /**
     * modified version of binary search, do not check for the value, just return the max index for the value
     * @param array
     * @param low
     * @param high
     * @param val
     * @return
     */
    public static int binarySearch(int[] array, int low, int high, int val) {
        if(low <= high) {
            int mid = low + (high-low)/2;

            if(array[mid] > val) {
                return binarySearch(array, low, mid-1, val);
            } else {
                return binarySearch(array, mid+1, high, val);
            }
        }

        return high;
    }

    public static void countElements(int[] arr1, int[] arr2) {
        Arrays.sort(arr2);

        for(int i = 0;i< arr1.length; i++ ) {
            int index = binarySearch(arr2, 0, arr2.length-1, arr1[i]);

            System.out.println("count for i: " + arr1[i] + " is: " + (index +1));

        }
    }

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 7, 9};
        int arr2[] = {0, 1, 2, 1, 1, 4};

        countElements(arr1, arr2);
    }
}
