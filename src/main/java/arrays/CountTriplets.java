package arrays;

import java.util.Arrays;

/**
 * Created by bvenkatesan on 7/28/17.
 * http://practice.geeksforgeeks.org/problems/count-triplets-with-sum-smaller-than-x/0
 */
public class CountTriplets {

    public static void countTriplets(int[] array, int sum) {
        int count = 0;
        int n = array.length;
        for(int i=0;i< n-2;i++) {
            for(int j= i+1;j< n-1;j++) {
                for(int k=j+1;k< n;k++) {
                    if((array[i] + array[j] + array[k]) < sum) {
                        count++;
                    }

                }
            }
        }

        System.out.println(count);
    }

    public static void countTripletsOptimized(int[] array, int sum) {
        int count = 0;
        int n = array.length;

        Arrays.sort(array);

        for(int i=0;i< n-2;i++) {
            int j=i+1;
            int k = n-1;

            while(j < k) {
                if((array[i] + array[j] + array[k]) >= sum) {
                    k--;
                } else {
                    System.out.println("k: " + k + ", j: " + j);
                    count += (k-j);
                    j++;
                }
            }
        }

        System.out.println(count);
    }

    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 7};
        //int[] array = {-2, 0, 1, 3};
        int sum = 12;

        countTripletsOptimized(array, sum);
    }
}
