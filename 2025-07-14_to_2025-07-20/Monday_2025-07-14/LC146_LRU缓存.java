import java.util.*;

/**
 * LeetCode 146 - LRU缓存
 * 
 * 题目描述：
 * 请你设计并实现一个满足 LRU (最近最少使用) 缓存约束的数据结构。
 * 
 * 实现 LRUCache 类：
 * - LRUCache(int capacity) 以正整数作为容量 capacity 初始化 LRU 缓存
 * - int get(int key) 如果关键字 key 存在于缓存中，则返回关键字的值，否则返回 -1
 * - void put(int key, int value) 如果关键字 key 已经存在，则变更其数据值 value；
 *   如果不存在，则向缓存中插入该组 key-value。如果插入操作导致关键字数量超过 capacity，
 *   则应该逐出最久未使用的关键字。
 * 
 * 函数 get 和 put 必须以 O(1) 的平均时间复杂度运行。
 * 
 * 示例：
 * 输入
 * ["LRUCache", "put", "put", "get", "put", "get", "put", "get", "get", "get"]
 * [[2], [1, 1], [2, 2], [1], [3, 3], [2], [4, 4], [1], [3], [4]]
 * 输出
 * [null, null, null, 1, null, -1, null, -1, 3, 4]
 * 
 * 解释
 * LRUCache lRUCache = new LRUCache(2);
 * lRUCache.put(1, 1); // 缓存是 {1=1}
 * lRUCache.put(2, 2); // 缓存是 {1=1, 2=2}
 * lRUCache.get(1);    // 返回 1
 * lRUCache.put(3, 3); // 该操作会使得关键字 2 作废，缓存是 {1=1, 3=3}
 * lRUCache.get(2);    // 返回 -1 (未找到)
 * lRUCache.put(4, 4); // 该操作会使得关键字 1 作废，缓存是 {4=4, 3=3}
 * lRUCache.get(1);    // 返回 -1 (未找到)
 * lRUCache.get(3);    // 返回 3
 * lRUCache.get(4);    // 返回 4
 * 提示：
 * 1 <= capacity <= 3000
 * 0 <= key <= 10^4
 * 0 <= value <= 10^5
 * 最多调用 2 * 10^5 次 get 和 put
 */
public class LC146_LRU缓存 {
    
    /**
     * 方法1：哈希表 + 双向链表
     * 时间复杂度：O(1)
     * 空间复杂度：O(capacity)
     */
    class LRUCache {
        // TODO: 实现你的解法
        class DoubleNode{
            int key;
            int val;
            DoubleNode prev;
            DoubleNode next;
            DoubleNode(int k,int v){
                key=k;
                val=v;

            }
        }
        class DoubleList{

          DoubleNode head;
          DoubleNode tail;
      
          public void addNode(DoubleNode node){
            if(node==null) return;
            if(head==null){
                head=node;
                tail=node;
            }else{
                tail.next=node;
                node.prev=tail;
                tail=node;
            }
          }
          //尾部是最后访问的，也是最先加进去的
          //应该更新到尾部
          public void fixTime(DoubleNode node){
            //释放，插入尾部
            if (tail == node) return;//忘了
            if(node==head){
                head=node.next;
                if (head != null) {
                    head.prev = null;
                }
            }else{
                node.prev.next=node.next;
                node.next.prev=node.prev;
            }
            tail.next=node;
            node.prev=tail;
            node.next=null;
            tail=node;
          }
          public DoubleNode removeHead(){
            DoubleNode node=head; 
            if(head==tail){
                head=null;
                tail=null;}
            else{
                head=node.next;
                head.prev=null;
                node.next=null;
            }
return node;
          }

        }

     private  HashMap<Integer,DoubleNode> map;
private DoubleList list;
private final int cap;


        public LRUCache(int capacity) {
            map = new HashMap<>();
            list = new DoubleList();
            cap = capacity;
        }
        
        public int get(int key) {
            if(map.containsKey(key)){
             DoubleNode ans=map.get(key);
                list.fixTime(ans);
                return ans.val;
            }   
            return -1;
        }
        
        public void put(int key, int value) {
            if(map.containsKey(key)){
                DoubleNode ans=map.get(key);
                ans.val=value;
                list.fixTime(ans);
            }else{
                DoubleNode node=new DoubleNode(key,value);
                if(map.size()==cap){
                    map.remove(list.removeHead().key);
                } 
                list.addNode(node);
 map.put(key, node);
            }
        }
    }
    
    /**
     * 方法2：使用LinkedHashMap
     * 时间复杂度：O(1)
     * 空间复杂度：O(capacity)
     */

    public static void main(String[] args) {
        System.out.println("=== 测试方法1 ===");
        LC146_LRU缓存 solution = new LC146_LRU缓存();
        LRUCache lruCache = solution.new LRUCache(2);
        
        lruCache.put(1, 1);
        System.out.println("put(1, 1)");
        
        lruCache.put(2, 2);
        System.out.println("put(2, 2)");
        
        int result1 = lruCache.get(1);
        System.out.println("get(1) = " + result1 + " (期望: 1)");
        
        lruCache.put(3, 3);
        System.out.println("put(3, 3)");
        
        int result2 = lruCache.get(2);
        System.out.println("get(2) = " + result2 + " (期望: -1)");
        
        lruCache.put(4, 4);
        System.out.println("put(4, 4)");
        
        int result3 = lruCache.get(1);
        System.out.println("get(1) = " + result3 + " (期望: -1)");
        
        int result4 = lruCache.get(3);
        System.out.println("get(3) = " + result4 + " (期望: 3)");
        
        int result5 = lruCache.get(4);
        System.out.println("get(4) = " + result5 + " (期望: 4)");
    }
} 