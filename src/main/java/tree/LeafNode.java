package tree;

import java.util.Stack;

/**
 * Created by bvenkatesan on 7/19/17.
 */
public class LeafNode {
    public static Stack<Integer> stack = new Stack<>();

    public void leafNode(int[] preorder) {
        int n = preorder.length;
        for(int i=0, j=1;j<n;i++, j++) {
            boolean found = false;

            if(preorder[i] > preorder[j]) {
                stack.push(preorder[i]);
                System.out.println(stack.toString());
            } else {
                System.out.println(stack.toString() + " " + preorder[j]);
                while(!stack.isEmpty()) {
                    if(preorder[j] > stack.peek()) {
                        stack.pop();
                        found = true;
                    } else {
                        break;
                    }
                }
            }


            if(found) {
                System.out.println(preorder[i] + " ");
            }

        }



        System.out.println(preorder[n-1]);
    }

    public static void main(String[] args) {
        int[] preorder = { 890, 325, 290, 530, 965 };
        LeafNode leafNode = new LeafNode();
        leafNode.leafNode(preorder);
    }
}
