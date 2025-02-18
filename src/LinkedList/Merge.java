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

        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)->a.val-b.val);
        if(lists.length == 0) return null;
        for(ListNode l : lists) {
            if(l != null) {
                pq.add(l);
            }
        }
        if(pq.isEmpty()) return null;
        ListNode head = new ListNode(0);
        ListNode cur = head;//虚拟头结点，相当于用cur让它工作
        while(!pq.isEmpty()) {
            ListNode p= pq.poll();
            cur.next = p;
            if(p.next != null) {
                pq.add(p.next);
            }
            cur = cur.next;
        }
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
        mergeKLists(new ListNode[]{});
    }
}
