package Hot100;
import java.util.HashMap;

import Hot100.LRU.DoubleNode;
import slidingwindow.noduplicateChar;

import java.util.*;
class LRU {
    public class DoubleNode{
        int key;
        int val;
        DoubleNode prev;
        DoubleNode next;
        public DoubleNode(int k,int v){
            key=k;
            val=v;
        }

    }

public class DoubleList{

private DoubleNode head;
private DoubleNode tail;


public void addNode(DoubleNode node){
    if(node==null) return;
    if(head==null){
        head=node;
        tail=node;
    }else{
        tail.next=node;
        node.prev=tail;
        tail=node;//忘了这个：更新尾部
    }
}

public void fixtime(DoubleNode node){
    if(tail==node) return;
    if(node==head){
        head=node.next;//这里写成head=head.next了，但是我要释放head，肯定不能用自己动
        head.prev=null;//这里释放错了！！
        }else{
        node.prev.next=node.next;
        node.next.prev=node.prev;
        }
        tail.next=node;    //这个忘了
        node.next=null;
        node.prev=tail;
        tail=node;
}

public DoubleNode removeHead(){
    //存头
    if(head==null) return null;

    DoubleNode ans=head;
    //忘记判断头尾是否一样了
    if(head==tail){
        head=null;
        tail=null;
    }else{
        head=ans.next;
        ans.next=null;
        head.prev=null;//记得这里应该断两个，因为双向链表
    }
  
    return ans;
} 

}

private  HashMap<Integer,DoubleNode> map;
private DoubleList list;
private final int cap;


    public LRU(int capacity) {//外面声明，构造里面是new
       list=new DoubleList();
        map = new HashMap<>();
        cap=capacity;
    }
    public void print(){

            map.forEach((k,v)->{
                System.out.println(v.val);
            });

    }
    public int get(int key) {
        if(map.containsKey(key)) {
            DoubleNode ans=map.get(key);
            list.fixtime(ans);
            return ans.val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        
        if(map.containsKey(key)){//有就更新值+时间
          DoubleNode node = map.get(key);
          node.val=value;
          list.fixtime(node);//这句话理解：把node的时间更新了
        }else{

            if(map.size()==cap)  map.remove(list.removeHead().key);//移除两个，写一起了
            
            map.put(key,new DoubleNode(key,value));
            list.addNode(map.get(key));
        }



    }
    public static void main(String[] args) {
        LRU test=new LRU(3);
        test.put(5,6);
        test.put(5,7);
        test.put(4,1);
        test.put(2,6);
        test.print();

    }
}

