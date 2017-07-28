package tree;


import java.util.Stack;

/**
 * Created by bvenkatesan on 7/27/17.
 */
public class FindLCAStack {

    public static class LCANode {
        int data;
        LCANode left;
        LCANode right;

        LCANode(int data) {
            this.data = data;
            left = right = null;
        }
    }

    LCANode root;

    public void findLCA(int n1, int n2) {

        Stack<LCANode> pathToN1 = findPath(root, n1);
        Stack<LCANode> pathToN2 = findPath(root, n2);

        if(pathToN1 == null || pathToN2 == null) {
            return;
        }

        LCANode prev = null;
        while(!pathToN1.isEmpty() && !pathToN2.isEmpty()) {
            LCANode s = pathToN1.pop();
            LCANode t = pathToN2.pop();

            if(s.equals(t)) {
                prev = s;
            } else {
                break;
            }
        }

        if(prev != null) {
            System.out.println("LCA: " + prev.data);
        }

    }

    public java.util.Stack<LCANode> findPath(LCANode node, int data) {

        if(node == null) {
            return null;
        }


        if(node.data == data) {
            Stack<LCANode> stack = new Stack<>();
            stack.push(node);
            return stack;
        }

        Stack<LCANode> left = findPath(node.left, data);
        Stack<LCANode> right = findPath(node.right, data);

        if(left != null) {
            left.push(node);
            return left;
        }

        if(right != null) {
            right.push(node);
            return right;
        }

        return null;
    }


    public static void main(String[] args) {
        FindLCAStack tree = new FindLCAStack();
        tree.root = new LCANode(1);
        tree.root.left = new LCANode(2);
        tree.root.right = new LCANode(3);
        tree.root.left.left = new LCANode(4);
        tree.root.left.right = new LCANode(5);
        tree.root.right.left = new LCANode(6);
        tree.root.right.right = new LCANode(7);

        tree.findLCA(4, 6);
    }
}
