package arrays;

/**
 * Created by bvenkatesan on 7/12/17.
 */
public class MinSum {
    public void findMinSum(int[] values) {
        int n = values.length;
        int min_l = 0;
        int min_r = 1;
        int min_sum = values[min_l] + values[min_r];
        for (int i = 0; i< n; i++ ){
            for(int j=i+1; j<n;j++){
                int sum = values[i] + values[j];
                if(Math.abs(min_sum) > Math.abs(sum)) {
                    min_sum = sum;
                    min_l = i;
                    min_r = j;

                }
            }
        }

        System.out.println(" The two elements whose "+
                "sum is minimum are "+
                values[min_l]+ " and "+values[min_r]);

    }
    public static void main(String[] args) {
        int[] values = {1, 60, -10, 70, -80, 85, -62};

        MinSum minSum = new MinSum();
        minSum.findMinSum(values);

    }
}
