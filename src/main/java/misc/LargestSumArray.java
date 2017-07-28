package misc;

/**
 * Created by bvenkatesan on 7/18/17.
 */
public class LargestSumArray {
    public void printLargestSum(int[] array) {
        int maxEnding = array[0];
        int maxSoFar = array[0];

        for(int i=1;i<array.length;i++) {
            maxEnding = maxEnding + array[i];
            maxSoFar = Math.max(maxSoFar, maxEnding);

            if(maxEnding < 0) {
                maxEnding = 0;
            }
        }

        System.out.println(maxSoFar);
    }
    public static void main(String[] args) {
        int[] array = {-4, -2, 1, -3};
        //int[] array = {-2, -3, 4, -1, -2, 1, 5, -3};
        LargestSumArray largestSumArray = new LargestSumArray();
        largestSumArray.printLargestSum(array);
    }
}
