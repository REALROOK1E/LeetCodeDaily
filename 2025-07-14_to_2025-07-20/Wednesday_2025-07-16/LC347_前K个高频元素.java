import java.util.*;

import javax.swing.event.InternalFrameAdapter;

/**
 * LeetCode 347 - 前K个高频元素
 * 
 * 题目描述：
 * 给你一个整数数组 nums 和一个整数 k ，请你返回其中出现频率前 k 高的元素。你可以按任意顺序返回答案。
 * 
 * 示例：
 * 输入: nums = [1,1,1,2,2,3], k = 2
 * 输出: [1,2]
 * 
 * 输入: nums = [1], k = 1
 * 输出: [1]
 * 
 * 提示：
 * 1 <= nums.length <= 10^5
 * k 的取值范围是 [1, 数组中不相同的元素的个数]
 * 题目数据保证答案唯一，换句话说，数组中前 k 个高频元素的集合是唯一的
 * 
 * 进阶：你所设计算法的时间复杂度必须优于 O(n log n) ，其中 n 是数组大小。
 */
public class LC347_前K个高频元素 {
    
    /**
     * 方法1：最小堆
     * 时间复杂度：O(n log k)
     * 空间复杂度：O(n)
     */
    public int[] topKFrequent(int[] nums, int k) {
        // 1. 统计每个元素出现的频率
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        // 2. 用最小堆维护前k个高频元素
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap =
            new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            minHeap.offer(entry);
            if (minHeap.size() > k) {
                minHeap.poll(); // 堆大小超过k时弹出最小的
            }
        }
        int[] res = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            res[i] = minHeap.poll().getKey();
        }
        return res;
    }
    
    /**
     * 方法2：桶排序
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     */
    public int[] topKFrequent2(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        // 桶的下标是频率，值是出现该频率的所有数
        List<Integer>[] buckets = new List[nums.length + 1];
        for (int key : freqMap.keySet()) {
            int freq = freqMap.get(key);
            if (buckets[freq] == null) buckets[freq] = new ArrayList<>();
            buckets[freq].add(key);
        }
        
        List<Integer> res = new ArrayList<>();
        for (int i = buckets.length - 1; i >= 0 && res.size() < k; i--) {
            if (buckets[i] != null) res.addAll(buckets[i]);
        }
        // 只取前k个
        return res.stream().mapToInt(x -> x).limit(k).toArray();
    }
    
    /**
     * 方法3：快速选择
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     */
    public int[] topKFrequent3(int[] nums, int k) {
        // TODO: 实现你的解法
        return new int[0];
    }
    
    public static void main(String[] args) {

        
        // 测试用例
        int[][] testCases = {
            ({1, 1, 1, 2, 2, 3}, 2,)           // 期望输出: [1,2]
          ()  {1}, 1,_                           // 期望输出: [1]
            {1, 1, 2, 2, 3, 3, 3}, 2,        // 期望输出: [3,1] 或 [3,2]
            {1, 2, 3, 4, 5}, 3,              // 期望输出: [1,2,3] 或任意三个元素
            {1, 1, 1, 2, 2, 3, 3, 3, 3}, 2   // 期望输出: [3,1]
        };
        
        for (int i = 0; i < testCases.length; i += 2) {
            int[] nums = testCases[i];
            int k = testCases[i + 1];
            int[] result = topKFrequent(nums, k);
            System.out.println("测试用例 " + (i/2 + 1) + ":");
            System.out.println("输入: nums = " + Arrays.toString(nums) + ", k = " + k);
            System.out.println("输出: " + Arrays.toString(result));
            System.out.println("---");
        }
    }
} 