package LinkedList;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author: ZeKai
 * @date: 2025/2/16
 * @description:
 **/
public class Merge {
    public static ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue <ListNode> q=new PriorityQueue<>((a,b)->{ return a.val-b.val;});

        if(lists.length==0) return null;
        for (ListNode node : lists) {
            if(node!=null)
             q.add(node);
  }     

        ListNode head=new ListNode();
        ListNode cur=head;
        while(!q.isEmpty()){
            ListNode newhead=q.peek().next;
            cur.next=q.poll();
            cur=cur.next;
            if(newhead!=null)
                q.add(newhead);
        }
      
        System.out.println(head.toString());

return head.next;





                  
    }

    public static void main(String[] args) {
        ListNode head1=new ListNode(1);
        head1.next=new ListNode(3);
        head1.next.next=new ListNode(5);
        head1.next.next.next=new ListNode(7);
        head1.next.next.next.next=new ListNode(8);


        ListNode head2 =new ListNode(2);
        head2.next=new ListNode(4);
        head2.next.next=new ListNode(6);
        mergeKLists(new ListNode[]{null,head1});
    }
}
