package queue;

import java.util.Stack;

/**
 * Created by bvenkatesan on 8/2/17.
 */
public class StackQueue {

    public Stack<Integer> newestOnTop = new Stack<>();
    public Stack<Integer> oldestOnTop = new Stack<>();

    public void enqueue(int n) {
        rebalance();
        newestOnTop.push(n);
    }

    public int dequeue() {
        rebalance();
        return oldestOnTop.pop();
    }

    public int peek() {
        rebalance();
        return oldestOnTop.peek();
    }

    private void rebalance() {
        if(oldestOnTop.isEmpty()) {
            while(!newestOnTop.isEmpty()) {
                oldestOnTop.push(newestOnTop.pop());
            }
        }
    }


    public static void main(String[] args) {
        StackQueue stackQueue = new StackQueue();
        stackQueue.enqueue(1);
        stackQueue.enqueue(2);
        System.out.println(stackQueue.dequeue());
        stackQueue.enqueue(3);
        System.out.println(stackQueue.peek());
    }
}
