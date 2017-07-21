package arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by bvenkatesan on 7/12/17.
 */
public class Triplets {
    public void findTriplets(int[] values, int n) {
        boolean found = false;
        for(int i = 0;i<n-1;i++) {
            Set<Integer> list = new HashSet<>();

            for(int j=i+1;j<n; j++) {
                int negative = -1 * (values[i] + values[j]);
                if(list.contains(negative)) {
                    found = true;
                    System.out.println("Found values :" + negative +" " + values[i] + " "  + values[j]);
                    break;
                } else {
                    list.add(values[j]);
                }
            }
        }



        if(!found) {
            System.out.println("nope");
        }

    }

    public static void main(String[] args) {
        int[] values = {0, -1, 2, -3, 1};
        Triplets triplets = new Triplets();
        triplets.findTriplets(values, values.length);
    }
}
