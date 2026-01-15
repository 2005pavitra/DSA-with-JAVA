package BinaryTree;
import java.util.*;

//public class SumAtKthLevel package BinaryTree;

public class SumAtKthLevel {

    // Definition for Binary Tree Node
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    /**
     * Prints all nodes at a specific level K.
     * * @param root  The current node being visited
     * @param level The current level of this node (starts at 1 usually)
     * @param k     The target level we want to print
     */
    public static int sum(Node root, int level, int k) {
        // Base Case: If node is null, stop.
        if (root == null) {
            return 0;
        }

        // Target Case: If current level matches K, print data.
        if (level == k) {
            return root.data;
        }

        // Recursive Step: Go to children with incremented level
        int left = sum(root.left, level + 1, k);
        int right = sum(root.right, level + 1, k);
        return left + right;
    }

    public static void main(String[] args) {
        /*
         * Constructing Tree:
         * 1        (Level 1)
         * / \
         * 2   3      (Level 2)
         * / \   \
         * 4   5   6    (Level 3)
         * /
         * 7              (Level 4)
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        root.left.left.left = new Node(7);

        int K = 3;

        // We assume Root is at Level 1.
        // If you consider Root at Level 0, pass 0 as the second argument.
        int sum = sum(root, 1, K);
        System.out.println("Nodes at level " + K + ":"+ " and sum is: "+sum);
    }
}
