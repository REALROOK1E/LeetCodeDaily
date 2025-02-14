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
    public ListNode reverseKGroup(ListNode head, int k) {
        //走k-1步
        //将大局逆转过后 还要接回来
        //第一步特殊，因为要改变头

   return reverse(head);

    }
}
