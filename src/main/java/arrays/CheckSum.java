package arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by bvenkatesan on 7/24/17.
 */
public class CheckSum {
    public static void printSum(int[] array, int sum) {

        for(int i =0;i<array.length;i++) {
            for(int j = i+1;j<array.length;j++) {
                if((array[i] + array[j]) == sum) {
                    System.out.println("i:" + array[i] + ", j: " + array[j]);
                }
            }
        }
    }

    public static void printSumHash(int[] array, int sum) {
        Set<Integer> set = new HashSet<>();

        for(int i =0;i<array.length;i++) {
            int diff = sum - array[i];

            if(set.contains(diff)) {
                System.out.println(diff + ", " + array[i]);
            }

            set.add(array[i]);
        }

    }

    public static void main(String[] args) {
        int[] array = { 1 , 5 , 4 , 4 , 3 , 8};
        int sum = 8;

        printSum(array, sum);
        printSumHash(array, sum);

    }
}
