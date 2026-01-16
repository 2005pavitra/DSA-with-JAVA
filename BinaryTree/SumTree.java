package BinaryTree;

public class SumTree {
    static class Node{
        int data;
        Node left; Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }

    public int sum(Node root){
        if(root == null) return 0;

        int left = sum(root.left);
        int right = sum(root.right);

        int originalVal = root.data;

        root.data = left+right;

        return originalVal+ left+right;
    }

    public static void main(String[] args) {
        /*
         * Input Tree:
         * 10
         * /  \
         * -2    6
         * / \  / \
         * 8 -4 7   5
         * * Expected Output (Sum Tree):
         * 20      <- (-2+8-4) + (6+7+5) = 2 + 18
         * /  \
         * 4    12   <- (7+5)
         * / \   / \
         * 0   0 0   0
         */
        Node root = new Node(10);
        root.left = new Node(-2);
        root.right = new Node(6);
        root.left.left = new Node(8);
        root.left.right = new Node(-4);
        root.right.left = new Node(7);
        root.right.right = new Node(5);

        SumTree st = new SumTree();
        st.sum(root);

        System.out.println("Root is now: " + root.data); // Should be 20
        System.out.println("Left child is now: " + root.left.data); // Should be 4
    }
}


//Alternative approach:
//public int sumOfNodes(Node root) {
//    if (root == null) return 0;
//    return root.data + sumOfNodes(root.left) + sumOfNodes(root.right);
//}
