package LinkedList;

/**
 * @author: ZeKai
 * @date: 2025/3/2
 * @description:
 **/
public class swap2nodes {
    public static ListNode swapPairs(ListNode head) {
        ListNode node1=head;
        ListNode node2=head.next;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        if(head.next == null) return dummy.next;
        while(node1!=null && node2!=null){
            node1.next=node2.next;
            node2.next=prev.next;
            prev.next=node2;
            node1=node1.next;
            if(node2.next.next==null)   return dummy.next;
            node2=node2.next.next.next;
            prev=prev.next.next;
        }
        System.out.println(dummy.next);
        return dummy.next;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        swapPairs(head);
    }
}
