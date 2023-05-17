public class maxtwosum {

    public static int maxtwinsum(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode nextNode, prev = null;

        while(slow != null){
            nextNode = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nextNode;
        }

        ListNode start = head;
        int maxsum = 0;

        while(prev!=null){
            maxsum = Math.max(maxsum, start.val + prev.val);
            start = start.next;
            prev = prev.next;
        }

        return maxsum;
    }
    public static void main(String args[]){
        
        ListNode head = new ListNode(5);
        head.next = new ListNode(4);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        System.out.println("Max twin sum: "+maxtwinsum(head));
    }
}
