package BinaryTree;

public class PreOrder {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }

    static class BinaryTree{
        static int idx = -1;

        public static Node buildTree(int nodes[]){
            idx++;
            if(idx >= nodes.length || nodes[idx] == -1){
                return null;
            }

            Node newNode= new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static void preOrder(Node root){
            if(root == null){
                return;
            }
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        // Reset idx before building a new tree if running multiple times in the same class context
        BinaryTree.idx = -1;

        Node root = BinaryTree.buildTree(nodes);
//
//        BinaryTree.Basics.Node root = BinaryTree.Basics.BinaryTree.buildTree(nodes);
        System.out.println("Root node data: " + root.data);
        System.out.println("Root's left child data: " + root.left.data);

        BinaryTree.preOrder(root);
    }

}
