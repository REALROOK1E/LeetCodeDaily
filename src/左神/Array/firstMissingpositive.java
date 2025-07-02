package 左神.Array;

/**
 * @author: ZeKai
 * @date: 2025/2/18
 * @description: 因为是定长的数组，那么应该每个i位置都对应i+1，能出现的数在l-r这个区间
 * 有不满足的话我的最好情况就压缩了，那么垃圾区就扩张
 * 一个答案，三个垃圾
 * 有三种情况不满足：大，小，重复  如果i后面位置的 nums[nums[l]+1] 
 * 出现了i对应的位置，那说明有两个重复了，也是垃圾 
 * nums[nums[l]+1]==nums[l] l=4，nums[4]应该为5 如果 6位置也是5 出现重复  错了！
 * nums[nums[l]-1]==nums[l] l=4，nums[4]应该为5 如果 5位置也是4 出现重复 
 * 很好理解，因为nums[l]-1=l(答案应该长这样) 所以怎么表示这个对应关系：这样才对  l+1  l+2   应该是对角线相等
 *                                                                          l   l+1         
 *                                                       但如果两个重复的话  l+1  l+1  nums[l]==nums[l+1]
                                                                            l   l+1   

 */
public class firstMissingpositive {
    public int firstMissingPositive(int[] nums) {
        int l=0;
        int r=nums.length;
        while(  l<r    )
        {
            if(nums[l]==l+1) l++;
            else if(nums[l]<=l||nums[l]>r||nums[nums[l]-1]==nums[l])
            {
                r--;
                swap(nums,l,r);
            }
            else swap(nums,l,nums[l]-1);

        }
        return ++l;
    }
    public void swap(int[] nums, int l,int r){
        int temp=nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
    }

    public static void main(String[] args) {
        firstMissingPositive(new int[] {3,4,-1,1});
    }
}
