package Linked_List_1;

public class ListNode {
    int val;
    public ListNode next;

    public ListNode() {}

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public static ListNode rotate(ListNode head, int k) {
        if (head == null || head.next == null) return head;

        int sz = 1;
        ListNode temp = head;
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            sz++;
        }

        // FIX: Compute modulo first, then handle the 0 condition
        int x = k % sz;
        if (x == 0) return head;

        for (int i = 0; i < sz - x - 1; i++) {
            temp = temp.next;
        }

        ListNode curr = temp.next;
        temp.next = null;
        tail.next = head;

        return curr;
    }

    // Helper method to print the actual values inside the list
    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.print("Original: ");
        printList(head);

        ListNode result = rotate(head, 10);

        System.out.print("Rotated:  ");
        printList(result);
    }
}
