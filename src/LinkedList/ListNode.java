package LinkedList;

/**
 * @author: ZeKai
 * @date: 2025/2/12
 * @description:
 **/
public class ListNode {
      int val;
      ListNode random;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; this.random = null;}

      @Override
      public String toString() {
            return
                     val +
                    "->" + next ;
      }
}