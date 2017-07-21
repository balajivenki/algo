package search;

/**
 * Created by bvenkatesan on 7/12/17.
 */
public class Jump {

    public int search(int[] values, int val) {
        int n = values.length;

        int step = (int) Math.floor(Math.sqrt(n));

        int prev = 0;
        while(values[Math.min(step, n) -1] < val) {
            prev = step;
            step += (int) Math.floor(Math.sqrt(n));
            if(prev >= n){//not found
                return -1;
            }
        }

        while(prev < step){
            if(values[prev] == val){
                return prev;
            }

            prev++;
        }


        System.out.println("prev:" + prev);
        System.out.println("step:" + step);

        return  -1;
    }

    public static void main(String[] args) {
        Jump jump = new Jump();

        int[] values = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
        int val = 56;

        int index = jump.search(values, val);

        if(index == -1) {
            System.out.println("value not found");
        } else {
            System.out.println("value found at index: " + index);
        }
    }
}
