package queue;

/**
 * Created by bvenkatesan on 7/16/17.
 */
public class ArrayQueue {
    public int capacity;
    public int front;
    public int rear;
    public int size;
    public int[] array;

    ArrayQueue(int capacity){
        this.capacity = capacity;
        this.front = this.size= 0;
        this.rear = capacity-1;
        this.array = new int[capacity];
    }

    public void enqueue(int data) {
        if(!isFull()) {
            this.rear = (this.rear + 1) % capacity;
            System.out.println("rear: " + this.rear);
            array[this.rear] = data;
            size++;
        }
    }

    public int dequeue() {
        if(isEmpty()) {
            return Integer.MIN_VALUE;
        }
        System.out.println("front: " + front);
        int item = array[this.front];
        this.front = (this.front+1) % capacity;
        size--;
        return item;
    }

    public int front() {
        if(isEmpty()) {
            return Integer.MIN_VALUE;
        }

        return array[front];
    }

    public int rear() {
        if(isEmpty()) {
            return Integer.MIN_VALUE;
        }

        return array[this.rear];
    }

    public boolean isFull() {
        return (this.size == this.capacity);
    }

    public  boolean isEmpty() {
        return (this.size == 0);
    }


    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(1000);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);



        System.out.println(queue.dequeue() +
                " dequeued from queue\n");

        System.out.println("Front item is " +
                queue.front());

        System.out.println("Rear item is " +
                queue.rear());
    }
}
