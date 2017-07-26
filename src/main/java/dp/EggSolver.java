package dp;

import java.util.Arrays;

/**
 * Created by bvenkatesan on 7/26/17.
 * https://www.youtube.com/watch?v=o_AJ3VWQMzA
 * https://github.com/gkcs/Competitive-Programming/blob/master/src/main/java/main/java/videos/EggSolver.java
 */
public class EggSolver {
    public static int solveUsingDp(int floors, int eggs) {
        final  int results[][] = new int[floors+1][eggs+1];

        //when there is 1 egg left and there are n floors the number of min try is the actual floor value
        for(int i=0;i<floors+1;i++) {
            results[i][1] = i;
        }

        //when there is only one floor irrespctive of number of eggs we have the number of try is just 1
        for(int i=0;i<eggs+1;i++) {
            results[1][i] = 1;
        }

        //now do it from second floor and from second egg
        for(int i=2;i< floors+1;i++) {
            for(int j=2;j< eggs+1 ; j++) {
                results[i][j] = Integer.MAX_VALUE;

                //now do it for the floors from 1 to
                for(int x=1;x<i;x++) {
                    final int broken = results[x-1][eggs-1];
                    final int survived = results[i-x][eggs];

                    int worstCase = Math.max(broken, survived) + 1;// +1 for the current try

                    if(worstCase < results[i][j]) {
                        results[i][j] = worstCase;
                    }
                }
            }
        }

        for (final int[] a : results) {
            System.out.println(Arrays.toString(a));
        }

        return results[floors][eggs];
    }

    public static void main(String[] args) {
        System.out.println(solveUsingDp(36, 2));
    }
}
