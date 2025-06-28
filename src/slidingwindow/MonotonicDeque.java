package slidingwindow;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 单调队列 - 支持在队尾添加元素，队首删除元素，并保持队列单调性
 */
public class MonotonicDeque {
    private Deque<Integer> deque;
    private boolean isIncreasing; // true为递增单调队列，false为递减单调队列
    
    public MonotonicDeque(boolean isIncreasing) {
        this.deque = new LinkedList<>();
        this.isIncreasing = isIncreasing;
    }
    
    // 默认递减单调队列（常用于求滑动窗口最大值）
    public MonotonicDeque() {
        this(false);
    }
    
    /**
     * 向队尾添加元素，保持单调性
     */
    public void push(int val) {
        if (isIncreasing) {
            // 递增单调队列：移除所有大于val的元素
            while (!deque.isEmpty() && deque.peekLast() > val) {
                deque.pollLast();
            }
        } else {
            // 递减单调队列：移除所有小于val的元素
            while (!deque.isEmpty() && deque.peekLast() < val) {
                deque.pollLast();
            }
        }
        deque.offerLast(val);
    }
    
    /**
     * 从队首弹出元素（如果等于val）
     */
    public void pop(int val) {
        if (!deque.isEmpty() && deque.peekFirst() == val) {
            deque.pollFirst();
        }
    }
    
    /**
     * 获取队首元素（当前窗口的最大值或最小值）
     */
    public int peek() {
        return deque.peekFirst();
    }
    
    /**
     * 判断队列是否为空
     */
    public boolean isEmpty() {
        return deque.isEmpty();
    }
    
    /**
     * 获取队列大小
     */
    public int size() {
        return deque.size();
    }
    
    /**
     * 清空队列
     */
    public void clear() {
        deque.clear();
    }
    
    public static void main(String[] args) {
        // 测试递减单调队列（求滑动窗口最大值）
        System.out.println("=== 递减单调队列测试（求最大值）===");
        MonotonicDeque maxQueue = new MonotonicDeque(false);
        int[] nums1 = {1, 3, -1, -3, 5, 3, 6, 7};
        int k1 = 3;
        
        for (int i = 0; i < nums1.length; i++) {
            maxQueue.push(nums1[i]);
            if (i >= k1 - 1) {
                System.out.print(maxQueue.peek() + " ");
                maxQueue.pop(nums1[i - k1 + 1]);
            }
        }
        System.out.println();
        
        // 测试递增单调队列（求滑动窗口最小值）
        System.out.println("=== 递增单调队列测试（求最小值）===");
        MonotonicDeque minQueue = new MonotonicDeque(true);
        int[] nums2 = {1, 3, -1, -3, 5, 3, 6, 7};
        int k2 = 3;
        
        for (int i = 0; i < nums2.length; i++) {
            minQueue.push(nums2[i]);
            if (i >= k2 - 1) {
                System.out.print(minQueue.peek() + " ");
                minQueue.pop(nums2[i - k2 + 1]);
            }
        }
        System.out.println();
    }
} 