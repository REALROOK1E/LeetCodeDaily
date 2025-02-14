package LinkedList;

/**
 * @author: ZeKai
 * @date: 2025/2/14
 * @description:
 **/
public class randomlistlink {
    public static ListNode copyRandomList(ListNode head) {
            ListNode cur=head;
        //我们通过两个指针一起遍历，替代哈希表！

            while(cur!=null){
                ListNode copy=new ListNode();
                copy.next=cur.next;
                cur.next=copy;
                cur=cur.next.next;
                System.out.println("haha");
            }

            ListNode l1=head;
            ListNode l2=head.next;
            while(l1!=null&&l2!=null){
                l2.random=l1.random==null?null:l1.random.next;
                l1=l1.next.next;
                l2=l2.next.next;
            }
        System.out.println(head.toString());

            ListNode copyhead=head.next;
             l1=head;
             l2=head.next;
        while (l1 != null) {
           cur=l1.next.next;
           l2=l1.next;
           l1.next=cur;
           l2.next=cur!=null?cur.next:null;
           l1=cur;
        }
        System.out.println(head.toString());
        System.out.println(copyhead.toString());

    return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        copyRandomList(head);
    }
}
