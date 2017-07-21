package search;

/**
 * Created by bvenkatesan on 7/12/17.
 */
public class Linear {

    public int search(int[] values, int val) {
        for(int i=0;i<values.length; i++) {
            if(values[i] == val) {
                return i;
            }
        }

        return -1;
    }

    public int searchRecursive(int[] values, int val, int index) {
        if(index < values.length) {
            if (values[index] == val) {
                return index;
            } else {
                System.out.println("index:" + index);
                return searchRecursive(values, val, index+1);
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] values = new int[]{10, 20, 3, 2, 5, 60, 2};
        int search_val = 3;
        Linear linear = new Linear();
        int index =linear.searchRecursive(values, search_val, 0);

        if(index == -1){
            System.out.println("Value not found");
        } else {
            System.out.println("Value found at index: " + index);
        }
    }
}
