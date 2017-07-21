package stack;

import java.util.ListIterator;
import java.util.Stack;

/**
 * Created by bvenkatesan on 7/14/17.
 */
public class StringLength {

    public static void findMaxLength(String str) {
        int len = str.length();

        java.util.Stack<Integer> stack = new Stack();
        stack.push(-1);

        int result = 0;

        for(int i=0;i<len;i++) {
            if(str.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();

                if(!stack.isEmpty()) {
                    printStack(stack);
                    System.out.println("result: " + result+", i: " + i + ", peek: " + stack.peek());
                    result = Math.max(result, i - stack.peek());
                } else {
                    stack.push(i);
                }
            }
        }

        System.out.println(result);
    }

    public static void printStack(Stack stack) {
        ListIterator<Integer> it = stack.listIterator(stack.size());
        while (it.hasPrevious()) {
            System.out.print(it.previous() + "<-");
        }
        System.out.println("Bottom!");
    }

    public static void main(String[] args) {
        findMaxLength("((()()(())");
        //findMaxLength("()((())))))()");


    }
}
