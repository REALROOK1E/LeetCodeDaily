package 左神.Array;

/**
 * @author: ZeKai
 * @date: 2025/2/18
 * @description:
 **/
public class firstMissingpositive {
    public static int firstMissingPositive(int[] nums) {
  //what i need is from i+1-length and there are four conditions for that
        // l stands right border for valid area and r stands for left border of right border
        //from 0-r means my expectation of valid number
        //i want nums[i]==i+1
        int l=0;
        int r=nums.length-1;
        while(l<r) {
            if(nums[l]==l+1) l++;//fulfill the condition
                 //below is trash
            else if(nums[l]<l+1||nums[l]>r||nums[nums[l]+1]==nums[l])
                 swap(nums,l,--r);
            else swap(nums,l,r);

        }

return 0;
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        firstMissingPositive(new int[] {3,4,-1,1});
    }
}
