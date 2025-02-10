package problem;

import java.util.Arrays;
import java.util.Deque;

/**
 * @author: ZeKai
 * @date: 2025/2/10
 * @description:
 **/
public class maxSlidingWindow {


          static int maxink (int[] arr, int l, int r) {
              int max = arr[l];

              // 遍历从 l 到 r 的范围，找到最大值
              for (int i = l + 1; i <= r; i++) {
                  if (arr[i] > max) {
                      max = arr[i];

                  }

              }
            return max;
        }

        public static int[] maxSlidingWindow(int[] nums, int k) {
            int max=maxink(nums,0,k-1);
            int[] res=new int[nums.length-k+1];
            int l=0;
            int r=k-1;

            res[0] = max;
            if (k==nums.length) return res;

           while(r<nums.length-1) {
               r++;
               if (nums[r]>=max) {
                   max=nums[r];
                   System.out.println("直接"+max);
                   l++;
               }else  {
                   if(nums[l]==max)
                     max = maxink(nums, l+1 , r);
                   l++;
                   System.out.println("重新算" + max);
               }
               res[l]=max;


           }
            System.out.println(Arrays.toString(res));
            return res;
        }


    public static void main(String[] args) {

      maxSlidingWindow(new int[]{1,3,1,2,0,5}, 3);
      //9，9，9，9，9，9，1，-5，99，1000，1000
    }
}
