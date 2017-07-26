package misc;

import java.util.Stack;

/**
 * Created by bvenkatesan on 7/24/17.
 */
public class RectArea {

    public static int getMaxArea(int[] hist) {
        int n = hist.length;
        int i = 0;
        Stack<Integer> stack = new Stack<>();
        int max_area = 0;
        int tp;
        int area_with_top;

        while(i < n) {
            if(stack.isEmpty() || hist[stack.peek()] <= hist[i]) {
                stack.push(i++);

                System.out.println("push: " + stack.toString());
            } else {
                tp = stack.peek();
                stack.pop();

                System.out.println("pop: " + stack.toString());
                area_with_top = hist[tp] * (stack.isEmpty() ? i : i - stack.peek() -1);

                System.out.println("hist[tp]: " + hist[tp]);
                System.out.println("i: " + i);
                if(!stack.isEmpty()) {
                    System.out.println("peek: " + stack.peek());
                }

                System.out.println("area_with_top: " + area_with_top);

                if(max_area < area_with_top) {
                    max_area = area_with_top;
                    System.out.println("max_area: " + max_area);
                }
            }
        }

        while(!stack.isEmpty()) {
            tp = stack.peek();
            stack.pop();

            area_with_top = hist[tp] * (stack.isEmpty() ? i : i - stack.peek() -1);

            if(max_area < area_with_top) {
                max_area = area_with_top;
            }
        }


        return  max_area;
    }

    public static void main(String[] args) {
        int hist[] = { 6, 2, 5, 4, 5, 1, 6 };
        System.out.println(getMaxArea(hist));
    }
}
