package sort;

import java.util.Arrays;

/**
 * Created by bvenkatesan on 7/12/17.
 */
public class Selection {

    public void sort(int[] values) {
        int n = values.length;

        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                if(values[i] > values[j]) {
                    int tmp = values[i];
                    values[i] = values[j];
                    values[j] = tmp;
                }
            }
        }

        Arrays.stream(values).forEach(value -> System.out.println(value)    );
    }

    public static void main(String[] args) {
        int[] values = {64,25,12,22,11};

        Selection selection = new Selection();
        selection.sort(values);

    }
}
