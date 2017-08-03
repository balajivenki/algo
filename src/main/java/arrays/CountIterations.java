package arrays;

/**
 * Created by bvenkatesan on 7/31/17.
 * http://www.geeksforgeeks.org/fill-array-1s-minimum-iterations-filling-neighbors/
 */
public class CountIterations {

    public static int countInterations(int[] array) {
        boolean oneFound = false;
        int result = 0;

        int n = array.length;

        for(int i=0;i<n;) {
            if(array[i] == 1) {
                oneFound = true;
            }

            while(i<n && array[i] == 1) {
                i++;
            }

            int count_zero = 0;

            while(i<n && array[i]==0) {
                count_zero++;
                i++;
            }

            if(oneFound == false && i==n) {
                return -1;
            }

            int curr_count;
            if(i<n && oneFound == true) {
                if(count_zero%2 == 0) {
                    curr_count = count_zero/2;
                } else {
                    curr_count = (count_zero+1)/2;
                }
            } else {
                curr_count = count_zero;
                count_zero = 0;
            }

            result = Math.max(result, curr_count);
        }

        return  result;
    }

    public static void main(String[] args) {
        int[] arryay = {0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0};

        System.out.println(countInterations(arryay));
    }
}
