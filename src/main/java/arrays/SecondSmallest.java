package arrays;

/**
 * Created by bvenkatesan on 7/12/17.
 */
public class SecondSmallest {
    public void printSmallest(int[] values) {
        int s1 = Integer.MAX_VALUE;
        int s2 = Integer.MAX_VALUE;


        System.out.println("s1:" + s1 + ", s2:" + s2);
        for(int i=0;i<values.length;i++) {
            if(values[i] < s1) {
                s2 = s1;
                s1 = values[i];
            } else if(values[i] < s2 && values[i] != s1) {
                s2 = values[i];
            }
        }

        System.out.println("s1:" + s1 + ", s2:" + s2);
    }

    public static void main(String[] args) {
        int[] values = {12, 13, 1, 10, 34, 1};
        SecondSmallest secondSmallest = new SecondSmallest();
        secondSmallest.printSmallest(values);
    }
}
