package BinarySearchTree;

public class BuildBST {

    static class Node{
        int data;
        Node left; Node right;

        Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    public static Node insert(Node root, int n){
        if(root == null) return new Node(n);

//        return (root.data>n)? insert(root.left,n): insert(root.right, n);
        if(root.data > n) {
            root.left = insert(root.left, n);
        }else{
            root.right = insert(root.right, n);
        }

        return root;


    }

    public static void inOrder(Node root){
        if(root == null) return ;

        inOrder(root.left);
        System.out.println(root.data+" ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        int values[] = {5, 1, 3, 4, 2, 7};
        Node root = null;

        // Loop to insert each value into the BST
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        System.out.println("Inorder Traversal (Should be sorted):");
        inOrder(root);
        System.out.println();
    }
}
