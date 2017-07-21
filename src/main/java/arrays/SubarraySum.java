package arrays;

/**
 * Created by bvenkatesan on 7/20/17.
 */
public class SubarraySum {

    public static void subArraySum(int[] array, int sum) {

        int current_sum=array[0];
        int start = 0;
        int n = array.length;

        for(int i=1;i < n;i++) {

            while(current_sum > sum && start < i-1) {
                current_sum -= array[start];
                start++;
            }

            if(current_sum == sum) {
                System.out.println("Start: " + start + ", End: " + (i-1));
                return;
            }

            current_sum += array[i];
        }
    }

    public static void main(String[] args) {
        int[] array = {15, 2, 4, 8, 9, 5, 10, 23};
        int sum=23;
        SubarraySum.subArraySum(array, sum);
    }
}
