package arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bvenkatesan on 7/27/17.
 */
public class FourElements {

    public static void findBruteForce(int[] array, int sum) {

        int n = array.length;

        for(int i=0;i<n-3;i++) {
            for(int j=i+1;j<n-2;j++) {
                for(int k=j+1;k<n-1;k++) {
                    for(int l=k+1;l<n;l++) {
                        if((array[i] + array[j] + array[k] + array[l]) == sum) {
                            System.out.println(array[i] + "," + array[j] + "," + array[k] + "," + array[l]);
                        }
                    }
                }

            }
        }

    }

    public static void findHash(int[] array, int sum) {

        int n = array.length;

        for(int i=0;i<n-3;i++) {
            for(int j=i+1;j<n-2;j++) {
                List<Integer> list = new ArrayList<>();
                for(int k=j+1;k<n-1;k++) {
                    int diff = sum - array[i] - array[j] - array[k];

                    if(list.contains(diff)) {
                        System.out.println(array[i] + "," + array[j] + "," + array[k] + "," + diff);
                    } else {
                        list.add(array[k]);
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 1, 2};
        int sum = 91;

        findHash(array, sum);
    }
}
