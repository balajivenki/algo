package misc;

/**
 * Created by bvenkatesan on 7/18/17.
 */
public class Bird {

    public void findMaxSum(int[] trees, int size, int max) {
        int maxSum = 0;
        int indexStart = 0;

        for(int i=0;i<size;i++) {
            int sum=0;
            for(int j=0;j<max;j++) {
                sum = sum + trees[(i+j) % size];
            }
            if(sum > maxSum) {
                maxSum = sum;
                indexStart = i;
            }
        }

        int tmp = indexStart;

        while(max>0){
            System.out.println(trees[tmp]);
            max--;
            tmp++;
        }

    }

    public static void main(String[] args) {
        /*int size = 7;
        int max = 3;
        int[] trees = {2, 1, 3, 5, 0, 1, 4};*/
        int size = 6;
        int max = 2;
        int[] trees = {1, 6, 2, 5, 3, 4};
        Bird bird = new Bird();
        bird.findMaxSum(trees, size, max);
    }
}
