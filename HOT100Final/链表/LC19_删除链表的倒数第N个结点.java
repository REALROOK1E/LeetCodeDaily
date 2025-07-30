/**
 * LC19 - 删除链表的倒数第N个结点
 * 难度：中等
 * 描述：
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 */
public class LC19_删除链表的倒数第N个结点 {

    /**
     * Definition for singly-linked list.
     */
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    /**
     * 方法：双指针
     * @param head 链表头节点
     * @param n 倒数第n个
     * @return 删除后的链表头节点
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // 实现逻辑
        return head;
    }

    public static void main(String[] args) {
        LC19_删除链表的倒数第N个结点 solution = new LC19_删除链表的倒数第N个结点();
        
        // 构造测试用例：[1,2,3,4,5]，删除倒数第2个节点
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        
        ListNode result = solution.removeNthFromEnd(head, 2);
        
        // 打印结果
        System.out.print("结果: ");
        while (result != null) {
            System.out.print(result.val);
            if (result.next != null) System.out.print(" -> ");
            result = result.next;
        }
        System.out.println();
    }
}
