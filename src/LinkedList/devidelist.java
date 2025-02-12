package LinkedList;

/**
 * @author: ZeKai
 * @date: 2025/2/12
 * @description:
 **/
public class devidelist {
    public static  ListNode partition(ListNode head, int x) {
      ListNode sl = null;
      ListNode sr = null;

      ListNode bl = null;
      ListNode br = null;


      while (head != null) {
          if(head.val>=x) {
              if(bl==null) {
                  bl=new ListNode(head.val);
                  br=bl;
              }else{
              br.next=new ListNode(head.val);
              br=br.next;
              }
          }
          else{
              if(sl==null) {
                  sl=new ListNode(head.val);
                  sr=sl;
              }else{
                  sr.next=new ListNode(head.val);
                  sr=sr.next;
              }

             }

          head=head.next;
      }
      if(sl!=null&&bl!=null) {sr.next=bl; return sl;}
      return sl!=null? sl:bl;

    }

    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(4);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(2);//1243
        head.next.next.next.next=new ListNode(5);
        head.next.next.next.next.next=new ListNode(2);


        System.out.println(partition(head,3).toString());
    }
}
