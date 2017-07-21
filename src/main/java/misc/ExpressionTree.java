package misc;

/**
 * Created by bvenkatesan on 7/18/17.
 */
public class ExpressionTree {
    public static class TreeNode {
        char data;
        TreeNode left;
        TreeNode right;

        TreeNode(char data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public TreeNode convertExpression(char[] expression, int pos) {
        if(pos > expression.length) {
            return null;
        }

        TreeNode treeNode = new TreeNode(expression[pos]);

        ++pos;

        if(pos< expression.length && expression[pos] == '?') {
            treeNode.left = convertExpression(expression, pos+1);
        } else if(pos< expression.length) {
            treeNode.right = convertExpression(expression, pos+1);
        }

        return treeNode;
    }

    public void preOrderPrint(TreeNode node) {
        if(node == null) {
            return;
        }

        System.out.println(node.data);

        preOrderPrint(node.left);
        preOrderPrint(node.right);
    }

    public static void main(String[] args) {
        String str = "a?b?c:d:e";
        //String str = "a?b:c";
        ExpressionTree expressionTree = new ExpressionTree();
        TreeNode treeNode = expressionTree.convertExpression(str.toCharArray(), 0);
        expressionTree.preOrderPrint(treeNode);
    }
}
