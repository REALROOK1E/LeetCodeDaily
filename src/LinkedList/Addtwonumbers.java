package LinkedList; /**
 * @author: ZeKai
 * @date: 2025/2/12
 * @description:
 **/

/**public class LinkedList.ListNode {
 *     int val;
 *     LinkedList.ListNode next;
 *     LinkedList.ListNode() {}
 *     LinkedList.ListNode(int val) { this.val = val; }
 *     LinkedList.ListNode(int val, LinkedList.ListNode next) { this.val = val; this.next = next; }
 * }**/
public class Addtwonumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l=null;
        ListNode head=null;

        int add=0;
        while(l1!=null || l2!=null){

            int v1=l1!=null?l1.val:0;
            int v2=l2!=null?l2.val:0;

            int val=(v1+v2+add)%10;
            add=(v1+v2+add)/10;
            if(head==null){
              head=new ListNode(val);
                l=head;
            }else{
                l.next=new ListNode(val);
                l=l.next;
            }

            l1= l1!=null?l1.next:null;
            l2= l2 != null ? l2.next : null;
            System.out.println(head.toString());
        }
        if(add==1){l.next=new ListNode(1);}

        return head;

    }

    public static void main(String[] args) {
        ListNode head=new ListNode(9);
        head.next=new ListNode(9);
        head.next.next=new ListNode(9);
        head.next.next.next=new ListNode(9);
        System.out.println(head.toString());
        ListNode l2=new ListNode(9);
        l2.next=new ListNode(9);
        l2.next.next=new ListNode(9);
        //89901
        System.out.println(l2.toString());

        System.out.println("最后是——>"+addTwoNumbers(head, l2));
    }
}
