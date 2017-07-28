package arrays;

import java.util.HashMap;

/**
 * Created by bvenkatesan on 7/27/17.
 * http://practice.geeksforgeeks.org/problems/sum-equals-to-sum/0
 */
public class SumPairs {

    public static void findPairs(int[] array) {

        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for(int i=0;i<array.length;i++) {
            for(int j=i+1; j< array.length;j++) {
                int sum = array[i] + array[j];
                System.out.println("i: " + i + ", j: "+ j + ", sum: " + sum);
                if(hashMap.containsKey(sum)) {
                    System.out.println("Yes: " + sum);
                    return;
                }

                hashMap.put(sum, sum);
            }
        }

        System.out.println("No");

    }

    public static void main(String[] args) {
        //int[] array = {3, 4,7, 1, 2, 9, 8};
        int[] array = {65, 30, 7, 90, 1, 9, 8};

        findPairs(array);


    }
}
