/**
 * LC141 - 环形链表
 * 难度：简单
 * 描述：
 * 给你一个链表的头节点 head ，判断链表中是否有环。
 * 如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。
 * 为了表示给定链表中的环，评测系统内部使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。
 * 注意：pos 不作为参数进行传递 。仅仅是为了标识链表的实际情况。
 * 如果链表中存在环 ，则返回 true 。 否则，返回 false 。
 */
public class LC141_环形链表 {

    /**
     * Definition for singly-linked list.
     */
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    /**
     * 方法：快慢指针
     * @param head 链表头节点
     * @return 是否有环
     */
    public boolean hasCycle(ListNode head) {
        // 实现逻辑
        return false;
    }

    public static void main(String[] args) {
        LC141_环形链表 solution = new LC141_环形链表();
        
        // 构造测试用例：[3,2,0,-4] 其中尾节点指向第二个节点
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next; // 形成环
        
        boolean result = solution.hasCycle(head);
        System.out.println("结果: " + result);
    }
}
