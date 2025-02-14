package LinkedList;

/**
 * @author: ZeKai
 * @date: 2025/2/14
 * @description:
 **/
public class IntersectionNode {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if(headA == null || headB == null) return null;
        if(headA == headB) return headA;
        ListNode cur=headA;
        int diff=0;
        while(cur!=null){
            cur=cur.next;
           diff++;
        }
        cur=headB;
        while(cur!=null){
            cur=cur.next;
            diff--;
        }
        ListNode l= diff>0?headA:headB;


        ListNode r= l==headA?headB:headA;
        int n=Math.abs(diff);
        while(n>0){
            l=l.next;
            n--;
        }
        while(r!=null){
            if(l==r) {
                System.out.println("Intersected at '"+l.val+"'");
                return l;
            }
            r=r.next;
            l=l.next;

        }
        System.out.println("No intersection");
        return null;
    }

    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(9);
        head.next.next=new ListNode(1);
        head.next.next.next=new ListNode(2);
        head.next.next.next.next=new ListNode(4);
        ListNode head2 =new ListNode(3);
       head2.next=head.next.next.next;
       getIntersectionNode(head,head2);
    }
}
