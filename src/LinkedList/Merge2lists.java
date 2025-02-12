package LinkedList;

/**
 * @author: ZeKai
 * @date: 2025/2/12
 * @description:
 **/
public class Merge2lists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null||list2==null)  return list1!=null? list1:list2;
        ListNode head= list1.val < list2.val ? list1 : list2;
        ListNode cur=head;
        ListNode l1=head.next;
        ListNode l2= head==list1? list2 : list1;//

        while(l1!=null && l2!=null){
            if(l1.val>=l2.val){
                cur.next=l2;
                l2=l2.next;
            }else{
                cur.next=l1;
                l1=l1.next;
            }
            cur=cur.next;
        }

        cur.next = l1 != null ? l1 : l2;//AI修正
        System.out.println(head.toString());
        return head;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        ListNode list2 = new ListNode(2);

        mergeTwoLists(list1, list2);

    }
}

