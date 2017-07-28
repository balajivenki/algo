package arrays;

/**
 * Created by bvenkatesan on 7/26/17.
 * http://practice.geeksforgeeks.org/problems/stickler-theif/0
 */
public class SticklerThief {

    public static void printMaxSum(int[] houses) {
        int oddSum = 0;
        int evenSum = 0;
        for(int i=0;i<houses.length;i++) {
            if(i % 2 == 0) {
                evenSum += houses[i];
            } else {
                oddSum += houses[i];
            }
        }

        System.out.println(Math.max(evenSum, oddSum));
    }

    public static void main(String[] args) {
        int[] houses = {5, 5, 10, 100, 10, 5};
        //int[] houses = {1, 2, 3};
        printMaxSum(houses);
    }
}
