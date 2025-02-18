package LinkedList;

/**
 * @author: ZeKai
 * @date: 2025/2/16
 * @description:
 **/
public class ReverseList {
    public static ListNode reverseList(ListNode head) {
    ListNode prev = null;
    ListNode curr = head;
    ListNode next = head.next;
    while (next != null) {
        curr.next = prev;//关键一步，之后整体右移

        prev = curr;
        curr = next;
        next = next.next;
    }
    curr.next = prev;
        System.out.println(curr);
    return curr;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        reverseList(head);
    }
}
