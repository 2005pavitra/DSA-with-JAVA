package BinaryTree;

import java.util.*;

// Definition for the Binary Tree Node
// (If you have a separate Node class, you can remove this inner class)
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}

public class TopView {

    /**
     * Helper class to store a Node alongside its Horizontal Distance (HD).
     * HD = 0 for root.
     * HD - 1 for left child.
     * HD + 1 for right child.
     */
    static class Info {
        Node node;
        int hd;

        public Info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    /**
     * Function to return a list of nodes visible from the top view 
     * from left to right in Binary Tree.
     * * Key Concept: 
     * 1. Horizontal Distance (HD): Determines vertical alignment.
     * 2. Level Order Traversal (BFS): Ensures we see the TOP-most node first.
     * If we used DFS, we might reach a bottom node first and incorrectly mark it as "top".
     */
    public static ArrayList<Integer> topView(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) return result;

        // Queue for Level Order Traversal (BFS)
        Queue<Info> q = new LinkedList<>();

        // Map to store the first node found at each horizontal distance.
        // Key: Horizontal Distance, Value: Node Data
        HashMap<Integer, Integer> map = new HashMap<>();

        // Variables to track the range of horizontal distances so we can print in order
        int min = 0;
        int max = 0;

        // Start BFS with root at HD = 0
        q.add(new Info(root, 0));

        while (!q.isEmpty()) {
            Info curr = q.remove();

            // CRITICAL LOGIC: 
            // Only add the node to the map if it's the FIRST time we are seeing 
            // this specific Horizontal Distance. Since we are doing BFS, the first 
            // time we see an HD, it is guaranteed to be the topmost node.
            if (!map.containsKey(curr.hd)) {
                map.put(curr.hd, curr.node.data);
            }

            // Add left child (HD - 1)
            if (curr.node.left != null) {
                q.add(new Info(curr.node.left, curr.hd - 1));
                min = Math.min(min, curr.hd - 1); // Update left boundary
            }

            // Add right child (HD + 1)
            if (curr.node.right != null) {
                q.add(new Info(curr.node.right, curr.hd + 1));
                max = Math.max(max, curr.hd + 1); // Update right boundary
            }
        }

        // Iterate from min HD to max HD to ensure sorted output (Left -> Right)
        for (int i = min; i <= max; i++) {
            if (map.containsKey(i)) {
                result.add(map.get(i));
            }
        }

        return result;
    }

    // Main method for testing
    public static void main(String[] args) {
        /*
         * Constructed binary tree:
         * 1
         * /   \
         * 2     3
         * / \   / \
         * 4   5 6   7
         * * Top View should be: 4 2 1 3 7
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        ArrayList<Integer> output = topView(root);

        System.out.println("Top View: " + output);
    }
}