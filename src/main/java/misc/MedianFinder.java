package misc;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Created by bvenkatesan on 7/19/17.
 */
public class MedianFinder {
    public PriorityQueue<Integer> maxHeap;
    public PriorityQueue<Integer> minHeap;

    MedianFinder() {
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        minHeap = new PriorityQueue<>();
    }

    public void addNumber(int n) {
        maxHeap.offer(n);
        minHeap.offer(maxHeap.poll());

        System.out.println("maxHeap: " + maxHeap.toString());
        System.out.println("minHeap: " + minHeap.toString());

        if(maxHeap.size() < minHeap.size()) {
            maxHeap.offer(minHeap.poll());

            System.out.println("maxHeap1: " + maxHeap.toString());
        }

        System.out.println("=====");
    }

    public void findMedian() {
        if(maxHeap.size() == minHeap.size()) {
            System.out.println("Median: " + (maxHeap.peek() + minHeap.peek())/2);
        } else {
            System.out.println("Median: " + maxHeap.peek());
        }
    }


    public static void main(String[] args) {
        int[] array = {5, 15, 1, 3};
        MedianFinder medianFinder = new MedianFinder();

        for(int i=0;i<array.length;i++) {
            medianFinder.addNumber(array[i]);
            medianFinder.findMedian();
        }
    }
}
