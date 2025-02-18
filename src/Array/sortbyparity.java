package Array;

import java.util.Arrays;

/**
 * @author: ZeKai
 * @date: 2025/2/18
 * @description:
 **/
public class sortbyparity {
    public static int[] sortArrayByParityII(int[] nums) {
        int even=0;
        int odd=1;
        int i=nums.length-1;
        while(even<nums.length&&odd<nums.length){
            int temp;
            if(nums[i]%2!=0) {
                temp = nums[odd];
                nums[odd] = nums[i];
                odd+=2;
            } else {
                temp = nums[even];
                nums[even]=nums[i];
                even+=2;
            }
            nums[i] = temp;
        }
        System.out.println(Arrays.toString(nums));
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
       sortArrayByParityII(nums);
    }
}
