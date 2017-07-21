package misc;

/**
 * Created by bvenkatesan on 7/18/17.
 */
public class SmallestSubArray {

    public static void smallestSubArray(int[] array, int sum) {
        int n = array.length;
        int index_start = 0;

        int min_length=0;
        int max_value = 0;

        for (int i=0;i<n;i++) {
            max_value = array[i];

            if(max_value > sum) {
                min_length = 1;
                index_start = i;
            } else {

                for (int j = i + 1; j < n; j++) {
                    max_value = max_value + array[j];

                    if (max_value > sum) {

                        int ml = (j - i) + 1;

                        if (min_length == 0 || ml < min_length) {
                            min_length = ml;
                            index_start = i;
                        }


                        break;
                    }
                }
            }
        }

        System.out.println("index_start: " + index_start);
        System.out.println("min_length: " + min_length);
    }

    public static void main(String[] args) {

        int[] array = {1, 4, 45, 6, 0, 19};
        int sum = 51;


/*        int[] array = {1, 10, 5, 2, 7};
        int sum = 9;*/

        SmallestSubArray.smallestSubArray(array, sum);
    }
}
