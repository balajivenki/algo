package stack;

import java.util.ListIterator;
import java.util.Stack;

/**
 * Created by bvenkatesan on 7/14/17.
 */
public class SortStack {

    public void sort(Stack stack) {
        Stack<Integer> stack1 = new Stack();
        int tmp = 0;

        while (!stack.empty()) {
            int pop = (int) stack.pop();

            if (stack1.empty()) {
                stack1.push(pop);
            } else {

                int peek = stack1.peek();

                if (pop < peek) {
                    tmp = stack1.pop();
                    stack.push(tmp);
                    stack.push(pop);
                } else {
                    stack1.push(pop);
                }

            }


        }

        System.out.println("Stack1");
        printStack(stack);
        System.out.println("Stack2");
        printStack(stack1);

    }

    public void printStack(Stack stack) {
        ListIterator<Integer> it = stack.listIterator(stack.size());
        while (it.hasPrevious()) {
            System.out.print(it.previous() + "<-");
        }
        System.out.println("Bottom!");
    }

    public static void main(String[] args) {
        java.util.Stack<Integer> stack = new Stack();

        stack.push(10);
        stack.push(1);
        stack.push(11);
        stack.push(3);
        stack.push(20);

        SortStack sortStack = new SortStack();
        sortStack.sort(stack);
    }
}
