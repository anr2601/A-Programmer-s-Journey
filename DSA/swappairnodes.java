import java.util.*;
public class swappairnodes {
    
    public static ListNode swap(ListNode head){

        if(head == null || head.next == null){
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;

        while(curr.next != null && curr.next.next !=null){
            
            ListNode first = curr.next;
            ListNode second  = first.next;

            first.next = second.next;
            second.next  = first;
            curr.next = second;

            curr = second.next;
    }

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        ListNode curr = swap(head);
        while(curr!=null){
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }
}

