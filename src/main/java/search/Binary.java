package search;

/**
 * Created by bvenkatesan on 7/12/17.
 */
public class Binary {

    public int search(int[] values, int val, int low, int high) {
        int mid = low + (high-low)/2;

        if(low > high) {
            return -1;
        }

        if(values[mid] == val){
            return mid;
        } else if(values[mid] > val) {
            return search(values, val, low, mid-1);
        } else {
            return search(values, val, mid+1, high);
        }
    }

    public static void main(String[] args) {
        Binary binary = new Binary();

        int[] values = {2,3,4,10,40};
        int val = 11;

        int index = binary.search(values, val, 0, (values.length - 1) );

        if(index == -1){
            System.out.println("not found");
        } else {
            System.out.println("Value found at index: " + index);
        }
    }
}
