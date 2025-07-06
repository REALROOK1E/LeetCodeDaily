package Hot100.Template;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.TreeMap;

/**
 * @author: ZeKai
 * @date: 2025/2/25
 * @description:
 *

 * 给你一个整数数组 nums，有一个大小为 k 的滑动窗口从数组的最左侧移动到数组的最右侧。你只可以看到在滑动窗口内的 k 个数字。滑动窗口每次只向右移动一位。
 * 返回 滑动窗口中的最大值 。
 * 输入：nums = [1,3,-1,-3,5,3,6,7], k = 3
 * 输出：[3,3,5,5,6,7]
 **/
public class slidingwindowmax {

    public static void main(String[] args) {
        int[] arr=new int[]{-7,-8,7,5,7,1,6,0};//5个答案对应的优先队列：75,7,71,76,760
        System.out.println("测试数组: " + Arrays.toString(arr) + ", k=3");
        System.out.println("期望结果: [7,7,7,7,6,6]");
        
        System.out.println("\n=== TreeMap方法 ===");
        maxSlidingWindowTreeMap(arr, 3);
        
        System.out.println("\n=== 单调队列方法 ===");
        maxSlidingWindow2(arr, 3);
        
        System.out.println("\n=== 标准单调队列方法 ===");
        maxSlidingWindow(arr, 3);
    }
    public static int[] q=new int[1000001];

    // TreeMap方法 - 最直观的实现
    public static int[] maxSlidingWindowTreeMap(int[] nums, int k) {
        // TreeMap: key是值，value是该值出现的次数
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int[] result = new int[nums.length - k + 1];
        
        for (int i = 0; i < nums.length; i++) {
            // 添加当前元素
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            
            // 当窗口大小达到k时，开始记录答案
            if (i >= k - 1) {
                // 当前窗口的最大值就是TreeMap的最后一个key
                result[i - k + 1] = map.lastKey();
                
                // 移除窗口最左边的元素
                int leftNum = nums[i - k + 1];
                map.put(leftNum, map.get(leftNum) - 1);
                if (map.get(leftNum) == 0) {
                    map.remove(leftNum);
                }
            }
        }
        
        System.out.println("TreeMap方法结果: " + Arrays.toString(result));
        return result;
    }

    public int[] maxSlidingWindow1(int[] nums, int k) {
        PriorityQueue<Integer> q=new PriorityQueue<>((a,b)->{
            return a-b;
        });
          for (int n : nums) {
            
                q.add(n);
            if(q.size()>k){
                
            }


          }
        return null;
    
        }









    public static int[] maxSlidingWindow2(int[] nums, int k) {
        //要四个变量
        int[] ans=new int[nums.length-k+1];
        int h=0;
        int t=0;
        int l=0;
        int r=0;
        for (int i = 0; i < k-1; i++) {
            while(t>0&&nums[q[t-1]]<nums[i]){
                t--;
            }
            q[t++]=i;
        }

        for (r=k-1; l< nums.length-k+1; l++,r++) {
            while(t>0&&nums[q[t-1]]<nums[r]){
                t--;
            }
            q[t++]=r;
            ans[l]=nums[q[h]];
            //每次都过期一个数。索引是l，只有过期的为当前最大值时候，h才++
            if(l==q[h]) h++;
        }

   for (int ans2 : ans) {
    System.out.println(ans2);
   }
        return ans;
    }







    public static int[] maxSlidingWindow(int[] nums, int k) {

        //用数组完成一遍，彻底理解，然后在上deque，基本就像玩一样简单
        /*首先，单调队列讲究的是一个成为最大值的可能性，因为lr的走向是单调的，假设有3212，当最后2进入的时候，把
        前面的12都弹出，因为他们要么小，要么先过期，永远没有出头之日了。
        这道题是一个定长的滑动窗口，用一个工作的指针tail来表示下一个要判断的数，t-1就代表队尾的那个数
        注意h活动的时机：如果入队的数比大于等于head，那就只能head++了
        首先搞一个k-1长度的窗口，然后右边加一个数——>算答案->左边再移动，答案就是head对应的值
        请注意，这个固定的滑动窗口和我的单调队列当然是分开的。在单调队列中，h永远是最大值。由于滑动窗口的强行变换，导致h会被强行更新。但是由于
        单调队列性质，强行更新之后还是最大值。
        举个例子，5143，记录一下答案是5，此时的单调队列应该最开始是51，然后是54，因为4比1大所以1滚了。
        当3进来的时候，5被强行删除了（用head++实现），现在head指向就是4，3在4的后面
        假设是5146，当6进去的时候，4也滚了（用t--实现），单调队列就剩一个head指向6
        理解了这个之后，开始吧

        */
        if (nums == null || nums.length == 0) return new int[0];
        int[] res = new int[nums.length - k + 1];
        int l = 0;
        int[] deq = new int[10001];//数据的最大量
        int h = 0, t = 0;//ht是滑动窗口的，lr是nums的
        //先构造k-1的窗口，注意deq存的是索引 最困惑的就在这，其实就是绕个弯
        //我先试着用直接不用索引的直观形式来一遍
        for (int i = 0; i < k -1; i++) {
            while (h < t && nums[deq[t - 1]] <= nums[i]) {
                //确保第一个数能进去&&从第二个数开始，如果比队尾索引对应的数大，
                // 那就弹出队尾，一直弹，一直到满足条件或者就剩一个
                t--;
            }
            deq[t++] = i;
        }
        //构造完了就可以搞了
        for (int r = k - 1; r < nums.length; r++,l++) {
            //小于等于当前数字的都滚
            while (h < t && nums[deq[t-1]] <= nums[r]) {
                t--;
            }
            deq[t++] = r;//while里已经满足条件了，当前索引可以进去了,最坏的情况，t被减到等于h，这样h就变了，单调队列只有一个数了
            res[l] = nums[deq[h]];
            //记录一次答案，这时候一定是记了一个最大值，
            // 因为比当前数小的都滚了,h对应的一定是最大值
            //然后就是，检测一下h是不是最左边，如果是的话要强制移动
            if (l== deq[h]) h++;//问题就在这里，这里的if不是判断值相等的，而是判断索引的，
            // 如果l正好是deq的首个索引，那说明最大值就在l。
            //这就是为什么只能单调队列只能存索引，你的明白？存值的话，如果最大值和l对应的值一样，那么h就不会改了
        }
        System.out.println(Arrays.toString(res));
        return res;

    }



}