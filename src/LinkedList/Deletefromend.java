package LinkedList;

/**
 * @author: ZeKai
 * @date: 2025/2/15
 * @description:
 **/
public class Deletefromend {

        public static ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode fast=head;
            ListNode slow=head;
            ListNode prev=head;
            while(n>0){
                fast=fast.next;
                n--;
            }

            if(fast==null) return head.next;
            while(fast!=null){
               prev=slow;
                fast=fast.next;
                slow=slow.next;
            }


            if(prev!=null&&slow!=null){
                prev.next=prev.next.next;
                return head;}
            return null;
        }

    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        System.out.println(removeNthFromEnd(head,2).toString());

    }

}
