/**
 * LC23 - 合并K个升序链表
 * 难度：困难
 * 描述：
 * 给你一个链表数组，每个链表都已经按升序排列。
 * 请你将所有链表合并到一个升序链表中，返回合并后的链表。
 */
import java.util.*;

public class LC23_合并K个升序链表 {

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
     * 方法：优先队列
     * @param lists 链表数组
     * @return 合并后的链表
     */
    public ListNode mergeKLists(ListNode[] lists) {
        // 实现逻辑
        return null;
    }

    public static void main(String[] args) {
        LC23_合并K个升序链表 solution = new LC23_合并K个升序链表();
        
        // 构造测试用例：[[1,4,5],[1,3,4],[2,6]]
        ListNode[] lists = new ListNode[3];
        
        lists[0] = new ListNode(1);
        lists[0].next = new ListNode(4);
        lists[0].next.next = new ListNode(5);
        
        lists[1] = new ListNode(1);
        lists[1].next = new ListNode(3);
        lists[1].next.next = new ListNode(4);
        
        lists[2] = new ListNode(2);
        lists[2].next = new ListNode(6);
        
        ListNode result = solution.mergeKLists(lists);
        
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
