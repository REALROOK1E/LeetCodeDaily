package LinkedList;

/**
 * @author: ZeKai
 * @date: 2025/2/14
 * @description:
 **/
public class Reverseinkgroup {
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
    public static ListNode reverseKGroup(ListNode head, int k) {
        //走k-1步
        //将大局逆转过后 还要接回来
        //第一步特殊，因为要改变头
        ListNode cur=head;
        int len = 0;
        while(cur!=null){
            cur=cur.next;
            len++;
        }
        cur=head;
        int rest=len%k;
        while(len>rest+k){
            len--;
            cur=cur.next;
        }
        System.out.println(cur.toString());

   return null;

    }

    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        reverseKGroup(head,2);
    }
}
