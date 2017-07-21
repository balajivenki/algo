package stack;


import java.util.Arrays;

/**
 * Created by bvenkatesan on 7/14/17.
 */
public class Stack {

    int[] data = new int[10];
    int pointer=0;

    public void push(int d){
        System.out.println("push: " + pointer);
        data[pointer] = d;
        pointer++;

        Arrays.stream(data).forEach(value -> System.out.println(value));
    }

    public void pop(){
        System.out.println("pop:" + pointer);
        System.out.println(data[--pointer]);
    }

    public void peek() {
        System.out.println("peek:" + pointer);
        System.out.println(data[pointer-1]);
    }

    public static void main(String[] args) {
        Stack stack=new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        stack.peek();

        stack.pop();

        stack.peek();
    }
}
