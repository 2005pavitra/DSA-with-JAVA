package BinaryTree;

public class MinDistNodes {
    static class Node{
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
            this.left = this.right = null;

        }
    }

    public static int minDist(Node root, int n1, int n2){
        Node lca = findLCA(root, n1, n2);

        int dist1 = getDist(lca, n1);
        int dist2 = getDist(lca, n2);

        return dist1 + dist2;
    }

    public static Node findLCA(Node root, int n1, int n2){
        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }

        Node left = findLCA(root.left, n1, n2);
        Node right = findLCA(root.right, n1, n2);

        if(left != null && right != null) return root;

        return (left != null) ? left : right;
    }

    public static int getDist(Node root, int n){
        if(root == null){
            return -1;
        }

        if(root.data == n){
            return 0;
        }

        int left = getDist(root.left, n);
        if(left!= -1) return left+1;


        int right = getDist(root.right, n);
        if(right != -1) return right + 1;

        return -1;
    }

    public static void main(String[] args) {
        /*
         * Tree Structure:
         * 1
         * / \
         * 2   3
         * / \   \
         * 4   5   6
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        int n1 = 4;
        int n2 = 6;

        // Path: 4 -> 2 -> 1 -> 3 -> 6 (Distance is 4)
        System.out.println("Min distance between " + n1 + " and " + n2 + " is: " + minDist(root, n1, n2));
    }
}
