package LinkedList;

/**
 * @author: ZeKai
 * @date: 2025/2/16
 * @description:
 **/
public class Midoflist{
   public static ListNode middleNode(ListNode head) {
    ListNode fast=head;
    ListNode slow=head;
    while(fast!= null&&fast.next!= null){
        fast=fast.next.next;
        slow=slow.next;
    }
       System.out.println(slow);
    return slow;
}

public static void main(String[] args) {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    head.next.next.next.next.next = new ListNode(6);
    middleNode(head);
}
}
