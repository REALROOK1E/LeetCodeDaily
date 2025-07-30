/**
 * LC2 - 两数相加
 * 难度：中等
 * 描述：
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 */
public class LC2_两数相加 {

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
     * 方法：链表遍历
     * @param l1 链表1
     * @param l2 链表2
     * @return 和链表
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 实现逻辑
        return null;
    }

    public static void main(String[] args) {
        LC2_两数相加 solution = new LC2_两数相加();
        
        // 构造测试用例：342 + 465 = 807
        // l1: [2,4,3] 表示 342
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        
        // l2: [5,6,4] 表示 465
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        
        ListNode result = solution.addTwoNumbers(l1, l2);
        
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
