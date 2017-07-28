package tree;

public class IsBinarySearchTree {
    public static class Node {
        int key;
        Node left;
        Node right;

        public Node(int key) {
            this.key = key;
            left = right = null;
        }

    }

    Node root, prev;

    public void printInOrder() {

        if(printInOrder(root)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    /**
     * In order traveral is left->node->right.
     * @param node
     * @return
     */
    private boolean printInOrder(Node node) {
        if(node != null) {
            if(!printInOrder(node.left)) {
                return false;
            }

            //since its inorder if the value of current node is < prev node then its not BST, beause left < node < right
            if(prev !=null && node.key <= prev.key) {
                return false;
            }

            prev = node;

            return printInOrder(node.right);

        }

        return true;
    }


    public static void main(String[] args) {
        IsBinarySearchTree tree = new IsBinarySearchTree();

        tree.root = new Node(10);
        tree.root.left = new Node(7);
        tree.root.right = new Node(11);
        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(8);

        System.out.println("In Order");
        tree.printInOrder();

    }
}
