package arrays;

/**
 * Created by bvenkatesan on 8/2/17.
 * http://www.geeksforgeeks.org/find-first-last-occurrences-element-sorted-array/
 */
public class FirstLast {

    public static int firstBinary(int[] array, int find, int low, int high) {
        int mid = low + (high-low)/2;

        if(low > high) {
            return -1;
        }

        if(mid == 0 || find > array[mid-1] && array[mid] == find) {
            return mid;
        }

        if(find > array[mid]) {
            return firstBinary(array, find, mid+1, high);
        }

        return firstBinary(array, find, low, mid-1);

    }

    public static int lastBinary(int[] array, int find, int low, int high) {
        int mid = low + (high-low)/2;

        if(low > high) {
            return -1;
        }

        if(mid==high-1 || find < array[mid+1] && array[mid] == find) {
            return mid;
        }

        if(array[mid] > find) {
            return lastBinary(array, find, low, mid-1);
        }

        return lastBinary(array, find, mid+1, high);

    }

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 5, 5, 5 ,67, 123, 125};
        int find = 5;
        System.out.println(firstBinary(array, find, 0, array.length-1));
        System.out.println(lastBinary(array, find, 0, array.length-1));
    }
}
