package Problems_Practice;

import java.util.ArrayList;

// Node sturcture
class Node {
    int data;
    Node left, right;

    Node(int x) {
        data = x;
        left = right = null;
    }
}

class MorrisPreOrderTraversal {

    static ArrayList<Integer> preOrder(Node root) {
        ArrayList<Integer> res = new ArrayList<>();
        while (root != null) {

            // If left child is null, print the current node
            // data. Move to right child.
            if (root.left == null) {
                res.add(root.data);
                root = root.right;
            }
            else {

                // Find inorder predecessor
                Node current = root.left;
                while (current.right != null
                        && current.right != root)
                    current = current.right;

                // If the right child of inorder predecessor
                // already points to this node
                if (current.right == root) {
                    current.right = null;
                    root = root.right;
                }

                // If right child doesn't point to this
                // node, then print this node and make right
                // child point to this node
                else {
                    res.add(root.data);
                    current.right = root;
                    root = root.left;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {

        // Constructing binary tree.
        //             1
        //            / \
        //           2   3
        //          / \
        //         4  5
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        ArrayList<Integer> res = preOrder(root);

        for (int data : res) {
            System.out.print(data + " ");
        }
    }
}