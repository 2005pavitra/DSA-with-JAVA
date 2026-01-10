package BinaryTree;

public class PostOrder {
    static class Node {
        int data;
        // It should refer to the local Node class or be generic.
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (idx >= nodes.length || nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static void postOrder(Node root) {
            if (root == null) {
                return;
            }

            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

    // Main method to demonstrate usage
    public static void main(String[] args) {
        // Sample input array for a binary tree (using -1 for null/missing nodes)
        // Represents:      1
        //                / \
        //               2   3
        //              / \ / \
        //             4  5 6  7
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1};

        // Reset the static index before building
        BinaryTree.idx = -1;
        Node root = BinaryTree.buildTree(nodes);

        System.out.println("Post-order traversal:");
        BinaryTree.postOrder(root); // Expected Output: 4 5 2 6 7 3 1
    }
}
