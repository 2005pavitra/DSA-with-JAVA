package BinaryTree;
import java.util.ArrayList;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class LowestCommonAncestor {

    /*
     * CONCEPT:
     * 1. Imagine two people walking from the Root to their destinations (n1 and n2).
     * 2. We record the path (list of nodes) for both.
     * 3. The LAST common node in their paths is where they split ways.
     * That split point is the Lowest Common Ancestor (LCA).
     */

    public static Node lowestCommonAncestor(Node root, int n1, int n2) {
        // Step 1: Create two lists to store the "roadmap" to each node
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        // Step 2: Fill the lists using our helper function
        // If either node doesn't exist in the tree, we can't find an LCA.
        if (!getPath(root, n1, path1) || !getPath(root, n2, path2)) {
            System.out.println("One of the nodes is missing from the tree!");
            return null;
        }

        // Step 3: Compare the paths side-by-side
        // Loop as long as the nodes at the same index match
        int i = 0;
        while (i < path1.size() && i < path2.size()) {
            if (path1.get(i) != path2.get(i)) {
                break; // Found the divergence point!
            }
            i++;
        }

        // The mismatch happened at 'i', so the last matching node was at 'i-1'
        return path1.get(i - 1);
    }

    /*
     * HELPER: getPath
     * This function tries to find a path from 'root' to 'target'.
     * It uses BACKTRACKING.
     */
    private static boolean getPath(Node root, int target, ArrayList<Node> path) {
        // Base case: If the path is a dead end
        if (root == null) {
            return false;
        }

        // 1. Add current node to our potential path (breadcrumbs)
        path.add(root);

        // 2. Check if we arrived at the destination
        if (root.data == target) {
            return true;
        }

        // 3. Try to find the target in the Left OR Right subtrees
        if (getPath(root.left, target, path) || getPath(root.right, target, path)) {
            return true;
        }

        // 4. BACKTRACKING STEP:
        // If we reached here, it means the target is NOT in the left or right child.
        // So, this current node is NOT part of the valid path. Remove it.
        path.remove(path.size() - 1);

        return false;
    }

    public static void main(String[] args) {
        /*
         * Tree Structure:
         * 1
         * / \
         * 2   3
         * / \ / \
         * 4  5 6  7
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n1 = 4;
        int n2 = 5;

        // Find LCA of 4 and 5 (Should be 2)
        Node lca = lowestCommonAncestor(root, n1, n2);

        if (lca != null) {
            System.out.println("LCA of " + n1 + " and " + n2 + " is: " + lca.data);
        } else {
            System.out.println("LCA not found.");
        }
    }
}