package tree;

/**
 * Created by bvenkatesan on 7/17/17.
 */
public class BinaryTree {

    public static class Node {
        int key;
        Node left;
        Node right;

        public Node(int key) {
            this.key = key;
            left = right = null;
        }

    }

    Node root;

    BinaryTree() {
        this.root = null;
    }

    public void printInOrder() {
        printInOrder(root);
    }

    private void  printInOrder(Node node) {
        if(node == null) {
            return;
        }

        printInOrder(node.left);

        System.out.println(node.key + " ");

        printInOrder(node.right);
    }

    public void printPreOrder() {
        printPreOrder(root);
    }

    private void printPreOrder(Node node) {
        if(node == null) {
            return;
        }

        System.out.println(node.key + " ");

        printPreOrder(node.left);
        printPreOrder(node.right);
    }

    public void printPostOrder() {
        printPostOrder(root);
    }

    private void printPostOrder(Node node) {
        if(node == null) {
            return;
        }

        printPostOrder(node.left);
        printPostOrder(node.right);

        System.out.println(node.key + " ");
    }

    public Node search(Node node, int key) {
        if(node.key == key) {
            return node;
        }

        if(node.key > key) {//in BST left is lesser so go to left node
            return search(node.left, key);
        }

        return  search(node.right, key);

    }

    public void insertBST(int key) {
        root = insert(root, key);
    }

    public Node insert(Node root, int key) {
        if(root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key) {
            root.left = insert(root.left, key);
        } else {
            root.right = insert(root.right, key);
        }

        return root;
    }



    public int minValue(Node root) {
        int min = root.key;

        while(root.left != null) {
            min = root.left.key;
            root = root.left;
        }

        return min;
    }

    public void minValue() {
        System.out.println("Min: " + minValue(root));
    }

    public void deleteNode(int key) {
        this.root = deleteNode(root, key);
    }

    public Node deleteNode(Node root, int key) {
        if(root == null){
            return root;
        }

        if(key < root.key) {
            root.left = deleteNode(root.left, key);
        } else if(key > root.key) {
            root.right = deleteNode(root.right, key);
        } else {
            if(root.left == null) {
                return root.right;
            } else if(root.right == null) {
                return root.left;
            }

            root.key = minValue(root.right);

            root.right = deleteNode(root.right, root.key);
        }

        return root;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

/*        tree.root = new Node(10);
        tree.root.left = new Node(7);
        tree.root.right = new Node(13);
        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(8);*/

        tree.insertBST(50);
        tree.insertBST(30);
        tree.insertBST(20);
        tree.insertBST(40);
        tree.insertBST(70);
        tree.insertBST(60);
        tree.insertBST(80);

        System.out.println("In Order");
        tree.printInOrder();

        tree.minValue();

        tree.deleteNode(20);

        System.out.println("In Order");
        tree.printInOrder();

/*
        System.out.println("Pre Order");
        tree.printPreOrder();

        System.out.println("Post Order");
        tree.printPostOrder();

        System.out.println("Search");
        Node search = tree.search(tree.root, 8);
        System.out.println(search.key);
*/


    }
}
