package LinkedList;

/**
 * @author: ZeKai
 * @date: 2025/2/14
 * @description:
 **/
public class PalinList {

    public static ListNode reverse(ListNode head) {
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

    public static boolean isPalindrome(ListNode head) {
        if (head == null) return false;
        ListNode slow = head;
        ListNode fast = head;
        while (fast!= null && fast.next != null) {
            if(fast.next.next==null) {fast = fast.next; break;}
            slow = slow.next;
            fast = fast.next.next;
        }
        reverse(slow);
        ListNode l=head;
        while(l!=null) {
            if(l.val!=fast.val) return false;
            l=l.next;
            fast=fast.next;
        }
        reverse(slow);//不管是不是回文，要逆转回去！
        return true;
    }

    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(2);
        head.next.next.next=new ListNode(1);
        //head.next.next.next.next=new ListNode(1);

        if(isPalindrome(head))
            System.out.println("Palindrome");
        else System.out.println("Not Palindrome");

    }
}
