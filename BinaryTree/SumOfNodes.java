package BinaryTree;

public class SumOfNodes {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    // The Sum method should be defined outside the Node class but within SumOfNodes class
    public static int Sum(Node root) {
        if (root == null) {
            return 0;
        }
        int ls = Sum(root.left);
        int rs = Sum(root.right);
        return root.data + ls + rs;
    }

    public static void main(String[] args) {
        // Example Tree Structure:
        //        1
        //       / \
        //      2   3
        //     / \   \
        //    4   5   6

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        int totalSum = Sum(root);
        System.out.println("The sum of all nodes in the tree is: " + totalSum); // Expected output: 21 (1+2+3+4+5+6)
    }
}
