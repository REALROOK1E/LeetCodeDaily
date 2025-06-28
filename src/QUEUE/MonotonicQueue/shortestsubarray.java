package QUEUE.MonotonicQueue;

/**
 * @author: ZeKai
 * @date: 2025/2/26
 * @description:
 **/
public class shortestsubarray {
    public static int shortestSubarray(int[] nums, int k) {
    //为什么不可以用传统的滑动窗口：因为数组里面有负数，这样数组往右移动，数组的和不一定增加，这时候就要用前缀和数组+滑动窗口了
        //例子：看看前6个数字减去前0个数字满足要求吗，满足就记录一个答案就试试缩短1个。
        //一直到不满足了，继续往下走
        
        /*那为什么要单调队列呢？
        因为当我找到第i个数时候，我希望往左找一个尽可能短的数组。如果前缀和是 2 3 5 1 6 ，
        我要求从6开始往左找k大于5的数，那么在往左找到一个小值1之后，再往左边的所有更大的值都没有意义了，因为只会距离目标k越来越远。
        在演算的时候会发现，不用优先队列会失去可能的最优解，因为需要从左往右减法，然后和k比，减去一个大的直接后面小的别玩了
        这种单调性决定了我需要用一个单调队列去进行前缀和的运算。
         */
        int[] deque = new int[100001];
        int h=0,t=0;
        int[] sum=new int[nums.length+1];
        int temp=0;
        int ans=Integer.MAX_VALUE;
        /*
         对于5, 4, 3，-4, 6,  3,  7
     前缀和 0,5, 9，12, 8, 14, 17,  24
         */
        for(int i=0;i<nums.length;i++){
            sum[i]=temp;
            temp+=nums[i];//这样角标和数字就是对应的
        }
        sum[nums.length]=temp;

        for(int i=0;i<sum.length;i++) {
            while (h<t&&sum[i] - sum[deque[h]]>=k) {
                /*这里的条件：什么时候算答案？
                当前的前缀和-单调队列头部对应的前缀和>=k时候
                     sum[i]-sum[deque[h]]>=k
                记录一个答案，然后h++，再看看满足不满足，h卡一个上限是t
               */
                ans=Math.min(ans,i-deque[h++]);
            }
            while (h<t&&sum[i] <= sum[deque[t-1]] ) {
                /*
                单调队列怎么维护？就是看当前的前缀和和t-1对应的索引的前缀和进行对比，小就t--
                 */
                t--;
            }//这里是维护单调队列的条件
            deque[t++]=i;
        }


        return ans==Integer.MAX_VALUE?-1:ans;
    }

    public static void main(String[] args) {
        int nums[]=new int[] {5, 4, 3,-4, 6,  3,  7};
        shortestSubarray(nums,10);
    }
}

