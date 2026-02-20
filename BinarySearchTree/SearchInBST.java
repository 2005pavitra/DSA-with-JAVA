package BinarySearchTree;

public class SearchInBST {
    static class Node{
        int data;
        Node left; Node right;

        Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    public static boolean search(Node root, int n){
        if(root == null) return false;

        if(root.data == n){
            return true;
        }
        else if(root.data > n){
            return search(root.left, n);
        }else{
            return search(root.right, n);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(6);
        root.left = new Node(2);
        root.right = new Node(8);
        root.right.left = new Node(7);
        root.right.right = new Node(9);

        int n = 17;
        // Searching for key in the BST
        System.out.println(search(root, n));
    }
}
