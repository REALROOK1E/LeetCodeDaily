package 左神.Array.twopointer;

import java.util.Arrays;

/**
 * @author: ZeKai
 * @date: 2025/2/18
 * @description:
 **/
public class    sortbyparity {
    public static int[] sortArrayByParityII(int[] nums) {
        int even=0;
        int odd=1;
        int i=nums.length-1;
        //题目要求按照单双数把数组分隔开，用一个i在后面座位工作位，两个指针分别对应单双数，用工作位数字判定，分别换到指针上上肉+2
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
