import java.util.*;

/**
 * LeetCode 283 - 移动零
 * 
 * 题目描述：
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * 
 * 请注意，必须在不复制数组的情况下原地对数组进行操作。
 * 
 * 示例：
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * 
 * 输入: [1]
 * 输出: [1]
 * 
 * 说明：
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 */
public class LC283_移动零 {
    
    /**
     * 方法1：双指针 扔雪球
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     */
    public static void moveZeroes(int[] nums) {
        int l=0;
        int r=0;
        while(r<nums.length){
            if(nums[r]!=0){
                swap(nums, l, r);
                l++;
            }
            r++;
        }
    }
    public static void swap(int [] nums,int l,int r){
        int temp=nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
    }

    public static void main(String[] args) {

    
     
            int[] nums = {0,1,0,3,12}; // 克隆数组避免修改原数组
            System.out.println("输入: " + Arrays.toString(nums);
            moveZeroes(nums);
            System.out.println("输出: " + Arrays.toString(nums));
            System.out.println("---");
        
    }
} 