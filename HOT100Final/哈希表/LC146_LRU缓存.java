/**
 * LC146 - LRU缓存
 * 难度：中等
 * 描述：
 * 请你设计并实现一个满足 LRU (最近最少使用) 缓存 约束的数据结构。
 * 实现 LRUCache 类：
 * - LRUCache(int capacity) 以 正整数 作为容量 capacity 初始化 LRU 缓存
 * - int get(int key) 如果关键字 key 存在于缓存中，则返回关键字的值，否则返回 -1 。
 * - void put(int key, int value) 如果关键字 key 已经存在，则变更其数据值 value ；
 *   如果不存在，则向缓存中插入该组 key-value 。如果插入操作导致关键字数量超过 capacity ，则应该 逐出 最近最少使用的关键字。
 */
import java.util.*;

public class LC146_LRU缓存 {

    /**
     * 初始化LRU缓存
     * @param capacity 容量
     */
    public LC146_LRU缓存(int capacity) {
        // 实现逻辑
    }

    /**
     * 获取值
     * @param key 键
     * @return 值
     */
    public int get(int key) {
        // 实现逻辑
        return -1;
    }

    /**
     * 放入键值对
     * @param key 键
     * @param value 值
     */
    public void put(int key, int value) {
        // 实现逻辑
    }

    public static void main(String[] args) {
        LC146_LRU缓存 lRUCache = new LC146_LRU缓存(2);
        lRUCache.put(1, 1); // 缓存是 {1=1}
        lRUCache.put(2, 2); // 缓存是 {1=1, 2=2}
        System.out.println("get(1): " + lRUCache.get(1));    // 返回 1
        lRUCache.put(3, 3); // 该操作会使得关键字 2 作废，缓存是 {1=1, 3=3}
        System.out.println("get(2): " + lRUCache.get(2));    // 返回 -1 (未找到)
        lRUCache.put(4, 4); // 该操作会使得关键字 1 作废，缓存是 {4=4, 3=3}
        System.out.println("get(1): " + lRUCache.get(1));    // 返回 -1 (未找到)
        System.out.println("get(3): " + lRUCache.get(3));    // 返回 3
        System.out.println("get(4): " + lRUCache.get(4));    // 返回 4
    }
}
