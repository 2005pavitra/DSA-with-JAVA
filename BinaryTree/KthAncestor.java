package BinaryTree;

public class KthAncestor {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int kth(Node root, int n, int k){
        if(root == null) return -1;
        if(root.data == n) return 0;

        int leftDist = kth(root.left, n, k);
        int rightDist = kth(root.right, n, k);

        if(leftDist == -1 && rightDist == -1){
            return -1;
        }

        int max = Math.max(leftDist, rightDist);
        if(max+1 == k) {
            System.out.println(root.data);
        }
        return max+1;
    }

    public static void main(String[] args) {
        /*
         * Tree:
         * 1
         * /   \
         * 2     3
         * / \
         * 4   5
         * * Target: 4, K: 1 -> Ancestor should be 2
         * Target: 5, K: 2 -> Ancestor should be 1
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        int n = 5;
        int k = 2;
        kth(root, n, k);
    }

}
