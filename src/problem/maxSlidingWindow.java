package problem;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * @author: ZeKai
 * @date: 2025/2/10
 * @description:
 **/
public class maxSlidingWindow {

        public static int[] maxSlidingWindow(int[] nums, int k) {
            if(nums == null || nums.length == 0) return new int[0];
            int[] res = new int[nums.length - k + 1];
            Deque<Integer> deque = new ArrayDeque<>();
            for (int i = 0; i < nums.length; i++) {

                while (!deque.isEmpty() && deque.peekFirst()<i-k+1) {
                    deque.pollFirst();

                }
                while(!deque.isEmpty() && nums[i]>nums[deque.peekLast()]) {
                    deque.pollLast();
                }
                deque.addLast(i);

                if(i-k+1>0){
                    res[i-k+1] = nums[deque.peekFirst()];
                }

            }
            return res;


        }


    public static void main(String[] args) {

      maxSlidingWindow(new int[]{1,3,1,2,0,5}, 3);
      //9，9，9，9，9，9，1，-5，99，1000，1000
    }
}
