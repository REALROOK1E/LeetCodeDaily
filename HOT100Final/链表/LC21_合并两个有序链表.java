/**
 * LC21 - 合并两个有序链表
 * 难度：简单
 * 描述：
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 */
public class LC21_合并两个有序链表 {

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
     * 方法：链表合并
     * @param list1 链表1
     * @param list2 链表2
     * @return 合并后的链表
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // 实现逻辑
        return null;
    }

    public static void main(String[] args) {
        LC21_合并两个有序链表 solution = new LC21_合并两个有序链表();
        
        // 构造测试用例：[1,2,4] 和 [1,3,4]
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);
        
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);
        
        ListNode result = solution.mergeTwoLists(list1, list2);
        
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
