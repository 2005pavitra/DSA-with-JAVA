package Problems_Practice;
import java.util.*;


public class SwapPairsInLL {
    public ListNode swapPairs(ListNode head){
            if(head == null || head.next == null) return head;
            ListNode curr = head;
            swap(curr, curr.next);
        return head;
    }
    private void swap(ListNode a, ListNode b){
        ListNode temp = a;
        a = b;
        b = temp;
    }


}

/**
 * public class Main{
 *     public static void main(String[] args){
 *         print(3);
 *     }
//       System.out.println(n);
 *     private void print(int n){
       System.out.println(n);
 *
 *
 *
 *         System.out.println("Bye");
 *     }
 *
 * }
 */

