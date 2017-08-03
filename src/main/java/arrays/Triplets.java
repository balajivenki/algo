package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by bvenkatesan on 7/12/17.
 * http://www.geeksforgeeks.org/find-triplets-array-whose-sum-equal-zero/
 */
public class Triplets {
    public void findTriplets(int[] values, int n) {
        boolean found = false;
        for(int i = 0;i<n-1;i++) {
            System.out.println("i: " + values[i]);
            Set<Integer> list = new HashSet<>();

            for(int j=i+1;j<n; j++) {
                int negative = -1 * (values[i] + values[j]);
                System.out.println("negative: " + negative);
                System.out.println("j: " + values[j]);
                if(list.contains(negative)) {
                    found = true;
                    System.out.println("Found values :" + negative +" " + values[i] + " "  + values[j]);
                    break;
                } else {
                    list.add(values[j]);
                }
                System.out.println("--------");
            }
        }



        if(!found) {
            System.out.println("nope");
        }

    }


    public static void findTripletsArray(int[] values, int n) {
        boolean found = false;

        Arrays.sort(values);

        System.out.println(Arrays.toString(values));

        for(int i=0;i<n-2;i++) {
            int l = i+1;
            int r = n-1;
            int current = values[i];

            while(l < r) {
                int sum = (current + values[l] + values[r]);
                if(sum == 0) {
                    found = true;
                    System.out.println("Found values :" + current +" " + values[l] + " "  + values[r]);
                    l++;
                    r--;
                } else if(sum < 0) {
                    l++;
                } else {
                    r++;
                }
            }
        }

        if(!found) {
            System.out.println("Nope");
        }
    }

    public static void main(String[] args) {
        int[] values = {0, -1, 2, -3, 1};
        //int[] values = {0, -1, 2};
        Triplets triplets = new Triplets();
        //triplets.findTriplets(values, values.length);
        findTripletsArray(values, values.length);
    }
}
