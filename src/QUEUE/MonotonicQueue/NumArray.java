package QUEUE.MonotonicQueue;

/**
 * @author: ZeKai
 * @date: 2025/2/27
 * @description:
 **/
class NumArray {

    int[] sum ;

    public NumArray(int[] nums) {
      sum=new int[nums.length+1];
      sum[0]=0;
      for (int i = 0; i < nums.length; i++) {
          sum[i+1] = nums[i]+sum[i];
      }
    }


    public int sumRange(int left, int right) {
            return sum[right+1]-sum[left];
    }


    public static void main(String[] args) {
        NumArray numArray = new NumArray(new int[]{1,2,3,4,5,6,7});
        System.out.println(numArray.sumRange(0, 2));
    }
}
/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */