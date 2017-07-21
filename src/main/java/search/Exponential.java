package search;

/**
 * Created by bvenkatesan on 7/12/17.
 */
public class Exponential {

    public int search(int[] values, int val) {

        if(values[0] == val){
            return 0;
        }

        int i = 1;
        while(i< values.length && values[i] <= val) {
            i = i*2;
        }

        System.out.println("i: " + i);

        return binarySearch(values, val, i/2, Math.min(i, values.length));
    }

    public int binarySearch(int[] values, int val, int low, int high) {

        if(high > low) {
            int mid = low + (high-low)/2;

            if(values[mid] == val) {
                return mid;
            }

            if(values[mid] > val) {
                return binarySearch(values, val, low, mid-1);
            }

            return binarySearch(values, val, mid+1, high);
        }

        return -1;
    }


    public static void main(String[] args) {
        int[] values = {2, 3, 4, 10, 40};
        int val = 10;

        Exponential exponential = new Exponential();

        int index = exponential.search(values, val);

        if(index == -1) {
            System.out.println("value not found");
        } else {
            System.out.println("value found at index: " + index);
        }
    }
}
