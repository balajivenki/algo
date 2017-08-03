package arrays;

/**
 * Created by bvenkatesan on 8/2/17.
 * http://www.geeksforgeeks.org/type-array-maximum-element/
 */
public class ArrayType {
    private static void findType(int[] array) {
        int n = array.length;

        int i=0;

        while(i< n-1 && array[i] < array[i+1]) {
            i++;
        }

        if(i == n-1) {
            System.out.println("Ascending. Max: " + array[n-1]);
            return;
        }

        //could be descending as the pointer didnt move forward
        if(i == 0) {
            while(i <n-1 && array[i] > array[i+1]) {
                i++;
            }

            if(i == n-1) {
                System.out.println("Descending. Max: " + array[0]);
                return;
            }


            if(array[0] < array[i+1]) {
                System.out.println("Descending Rotated. Max: " + Math.max(array[0], array[i+1]));
                return;
            } else {
                System.out.println("Ascending Rotated. Max: " + Math.max(array[0], array[i+1]));
                return;
            }
        }

        if(i<n-1 && array[0] > array[i+1]) {
            System.out.println("Ascending Rotated. Max: " + Math.max(array[0], array[i]));
            return;
        }

        System.out.println("Descending Rotated. Max: " + Math.max(array[0], array[i]));
    }



    public static void main(String[] args) {
        int arr1[] = { 4, 5, 6, 1, 2, 3}; // Ascending rotated
        findType(arr1);

        int arr2[] = { 2, 1, 7, 5, 4, 3}; // Descending rotated
        findType(arr2);

        int arr3[] = { 1, 2, 3, 4, 5, 8}; // Ascending
        findType(arr3);

        int arr4[] = { 9, 5, 4, 3, 2, 1}; // Descending
        findType(arr4);
    }


}
