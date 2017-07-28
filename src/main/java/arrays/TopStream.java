package arrays;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Created by bvenkatesan on 7/26/17.
 */
public class TopStream {

    PriorityQueue<Integer> minHeap;

    int[] frequency;

    TopStream(int size) {
        minHeap = new PriorityQueue<>();
        frequency = new int[size];

        Arrays.fill(frequency, 0);
    }

    public void add(int data) {
        minHeap.offer(data);
        //frequency[data]++;


    }

    public void printTopStream(int top) {
        System.out.println(minHeap.toString());
        Arrays.toString(frequency);
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 1, 3, 2};

        int top = 4;

        TopStream topStream = new TopStream(array.length);

        for(int i=0;i<array.length-1;i++) {
            topStream.add(array[i]);
            topStream.printTopStream(top);
        }
    }
}
