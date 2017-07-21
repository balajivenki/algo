package list;

/**
 * Created by bvenkatesan on 7/13/17.
 */
public class LinkedList {

    Node head;

    public static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data=d;
            next=null;
        }
    }

    public void push(int new_data) {

        Node newNode = new Node(new_data);

        newNode.next = head;

        head = newNode;


    }

    public void append(int new_data) {
        Node newNode = new Node(new_data);
        newNode.next = null;

        if(head == null){
            head=newNode;
        } else {
            Node last = head;

            while(last.next != null){
                last = last.next;
            }

            last.next=newNode;
        }


    }

    public void insertAfter(Node prev_node, int new_data) {
        Node newNode = new Node(new_data);

        if(prev_node != null){
            newNode.next=prev_node.next;
            prev_node.next=newNode;
        }
    }

    public void printList() {
        Node start =head;
        StringBuffer stringBuffer = new StringBuffer();
        while(start != null){
            stringBuffer.append(" -> " + start.data);
            start = start.next;
        }

        System.out.println(stringBuffer);
    }

    public void printLength() {
        Node p1 = head;

        int cnt=0;
        while(p1!=null){
            p1=p1.next;
            cnt++;
        }

        System.out.println(cnt);
    }


    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        linkedList.push(10);
        linkedList.push(11);
        linkedList.append(8);
        linkedList.append(7);
        linkedList.insertAfter(linkedList.head.next, 9);

        linkedList.printList();

        linkedList.printLength();
    }
}
