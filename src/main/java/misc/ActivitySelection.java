package misc;

/**
 * Created by bvenkatesan on 7/23/17.
 * http://www.geeksforgeeks.org/greedy-algorithms-set-1-activity-selection-problem/
 */
public class ActivitySelection {
    public static void printMaxActivities(int[] start, int[] finish) {
        int count = 1;
        int i=0;

        for(int j=1;j<start.length;j++) {
            if(start[j] >= finish[i]) {
                count++;
                i = j;
            }
        }

        System.out.println(count);
    }

    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] finish = {2, 4, 6, 7, 9, 9};

        //int[] start = {1, 3, 0, 5, 8, 5};
        //int[] finish = {2, 4, 6, 7, 9, 9};

        //int[] start = {10, 12, 20};
        //int[] finish = {20, 25, 30};
        printMaxActivities(start, finish);

    }
}
