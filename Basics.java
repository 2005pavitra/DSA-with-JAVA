public class Basics {

    // ------------- Node Class -------------
    public static class Node {
        int data;     // value stored in this node
        Node next;    // reference to next node

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // ------------ Linked List State -------------
    public static Node head;  // points to first node
    public static Node tail;  // points to last node


    // ------------ Insert at Beginning (O(1)) ------------
    public void addFirst(int data) {

        Node newNode = new Node(data);

        // Case 1: empty list
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Case 2: attach before head
        newNode.next = head;
        head = newNode;
    }


    // ------------ Insert at End (O(1)) ------------
    public void addLast(int data) {
        Node newNode = new Node(data);

        // Case 1: list empty → head & tail become same
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Case 2: attach after tail
        tail.next = newNode;
        tail = newNode;
    }

    public void printList(){
        if(head == null){
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;

        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }

        System.out.println("null");
    }


    public static void main(String[] args) {


         Basics ll = new Basics();
         ll.addFirst(10);
         ll.addFirst(5);
         ll.addLast(20);
         ll.addLast(25);

        ll.printList();
    }
}
