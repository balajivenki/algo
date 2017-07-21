package queue;

/**
 * Created by bvenkatesan on 7/16/17.
 */
public class LinkedQueue {
    public static class QNode {
        int data;
        QNode next;

        QNode(int data) {
            this.data = data;
            next = null;
        }
    }

    public QNode front, rear;

    public void enqueue(int data) {
        QNode qNode = new QNode(data);

        if(rear == null) {
            this.front = this.rear = qNode;
            return;
        } else {
            this.rear.next = qNode;
            this.rear = qNode;
        }

    }

    public int dequeue() {
        if(this.front == null) {
            return Integer.MIN_VALUE;
        }

        int item = this.front.data;

        this.front = this.front.next;

        if(this.front == null) {
            this.rear = null;
        }

        System.out.println("Dequeued item is "+ item);

        return item;
    }


    public static void main(String[] args) {
        LinkedQueue q=new LinkedQueue();
        q.enqueue(10);
        q.enqueue(20);
        q.dequeue();
        q.dequeue();
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        q.dequeue();
    }
}
