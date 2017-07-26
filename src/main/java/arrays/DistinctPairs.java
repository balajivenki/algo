package arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by bvenkatesan on 7/23/17.
 */
public class DistinctPairs {

    public static void getCount(int[] array, int k) {
        int count = 0;
        for(int i=0;i<array.length;i++) {
            for(int j=i+1;j<array.length;j++) {
                if((array[i] - array[j]) == k || (array[j] - array[i]) == k) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }

    public static void getCountHash(int[] array, int k) {
        int count = 0;

        Map<Integer, Boolean> map = new HashMap<>();

        for(int i=0;i<array.length;i++) {
            map.put(array[i], true);
        }

        //map.forEach((integer, aBoolean) -> System.out.println(integer));

        for(int i=0;i<array.length;i++) {
            int val = array[i];

            System.out.println("val: " + val);

            if(map.containsKey((val-k)) && map.get((val-k))) {
                count++;
            }

            if(map.containsKey((val + k)) && map.get((val + k))) {
                count++;
            }

            System.out.println("count: " + count);

            map.put(val, false);
            map.remove(val);
        }

        System.out.println(count);
    }

    public static void main(String[] args) {
        int[] array = {8, 12, 16, 4, 0, 20};
        //int[] array = {1, 5, 3};
        int k = 4;
        //int k = 2;

        DistinctPairs.getCountHash(array, k);
    }
}
