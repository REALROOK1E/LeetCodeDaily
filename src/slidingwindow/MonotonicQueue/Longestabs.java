package slidingwindow.MonotonicQueue;

/**
 * @author: ZeKai
 * @date: 2025/2/26
 * @description:
 **/
public class Longestabs {
    public static int longestSubarray(int[] nums, int limit) {
/*整体思路就是：在一个数组里维护一个最大队列，一个最小队列，从序号0开始扩充
由于单调性，扩充的终点之前的所有序列应该全是符合标准的，当扩充到不符合标准的时候，左边缩是没用的，因为长度只会更短
有一定的贪心思想
8,2，4,7 limit是4  最后最长是2
解析一下，8，2这时候就已经不符合了，那么记录一下长度，、
Input: nums = [10,1,2,4,7,2], limit = 5
Output: 4
最大队列就依次是[10] [10,1] [10,2] [10,4] [10,7] [10,7,2]
最小队列以此是  [10] [1，10] [1,2] [1,2,4] [1,2,4,7] [1,2]
极差：0,9,到这里已经不行了，l来到1
重新构造最大  [1][2][4][7][7,2]
最小        [1][1,2][1,4][1,4,7][1,2]
极差  0,1,3,6
不用考虑滑动 直接从停下来的index开始继续，一直到end
 */
int ans=0;
int MAXN=100001;
int [] max=new int[MAXN];
int hmax=0;
int tmax=1;
int [] min=new int[MAXN];
int hmin=0;
int tmin=1;
//lr操作数组
        for(int l=0, r=0;r<nums.length;r++){

            while(hmax<tmax&&nums[max[tmax-1]]<=nums[r]){
                tmax--;
            }
            max[tmax++]=r;

            while(hmin<tmin&&nums[min[tmin-1]]>=nums[r]){
                tmin--;
            }

            min[tmin++]=r;
            while (nums[max[hmax]] - nums[min[hmin]] > limit) {
                // 如果极差超过 limit，移动左边界 l
                if (max[hmax] == l) {
                    hmax++; // 移除队头元素（最大值）
                }
                if (min[hmin] == l) {
                    hmin++; // 移除队头元素（最小值）
                }
                l++; // 左边界向右移动
            }
            ans=Math.max(ans,r-l+1);

           //记一下答案，然后判断下一个？l不动，应该不用，现在就判断什么时候不符合条件了，
        }
        System.out.println(ans);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{10,1,2,4,7,2};
        longestSubarray(arr,5);
    }
}
