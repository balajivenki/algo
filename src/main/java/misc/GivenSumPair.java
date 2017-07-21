package misc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bvenkatesan on 7/18/17.
 */
public class GivenSumPair {

    public void printSumPair(int[] array1, int[] array2, int sum) {
        for(int i=0; i< array1.length;i++){
            for(int j=0;j<array2.length;j++) {
                if((array1[i] + array2[j]) == sum) {
                    System.out.println(array1[i] + " " + array2[j]);
                }
            }
        }
    }

    public void printSumPair2(int[] array1, int[] array2, int sum) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i< array1.length;i++){
            list.add(array1[i]);
        }

        for(int j=0;j<array2.length;j++) {
            int tmp = sum - array2[j];
            if(list.contains(tmp)) {
                System.out.println(tmp + " " + array2[j]);
            }
        }

    }

    public static void main(String[] args) {
        int[] array1 = {-1, -2, 4, -6, 5, 7};
        int[] array2 = {6, 3, 4, 0};
        int sum = 8;

        GivenSumPair givenSumPair = new GivenSumPair();
        givenSumPair.printSumPair2(array1, array2, sum);

    }
}
