package slidingwindow;

import java.util.Arrays;

/**
 * @author: ZeKai
 * @date: 2025/2/25
 * @description:
 **/
public class slidingWindowMax {
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
            //
            while (h < t && nums[deq[t - 1]] <= nums[i]) {//确保第一个数能进去&&从第二个数开始，如果比队尾索引对应的数大，
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
            res[l] = nums[deq[h]];//记录一次答案，这时候一定是记了一个最大值，因为比当前数小的都滚了,h对应的一定是最大值
            //然后就是，检测一下h是不是最左边，如果是的话要强制移动
            if (l== deq[h]) h++;//问题就在这里，这里的if不是判断值相等的，而是判断索引的，如果l正好是deq的首个索引，那说明最大值就在l。
            //这就是为什么只能单调队列只能存索引，你的明白？存值的话，如果最大值和l对应的值一样，那么h就不会改了
        }
        System.out.println(Arrays.toString(res));
        return res;

    }

    public static void main(String[] args) {
        int[] arr=new int[]{-7,-8,7,5,7,1,6,0};//5个答案对应的优先队列：75,7,71,76,760
        maxSlidingWindow(arr, 4);
    }
}