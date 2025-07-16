import java.util.*;

/**
 * LeetCode 283 - 移动零
 * 
 * 题目描述：
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * 
 * 示例：
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * 
 * 说明：
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 * 
 * 提示：
 * 1 <= nums.length <= 10^4
 * -2^31 <= nums[i] <= 2^31 - 1
 */
public class LC283_移动零 {
    
    /**
     * 方法1：双指针
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     */
    public static void moveZeroes(int[] nums) {
        // 只要有一个为0，另一个就去找下一个非零然后换
        int l=0;
        int r=0;
        while(r<nums.length-1&&l<nums.length-1){
            r=l;
            if(nums[l]==0){
                while (r<nums.length&&nums[r]==0) {r++;}
                if(r==nums.length) return;
                swap(nums,l,r);
            }
            l++;
        }
    }
    public static void swap(int[] nums,int l,int r){
        int temp=nums[l];
        nums[l]=nums[r];
        nums[r]=temp;

    }


    public static void main(String[] args) {
        
        // 测试用例
        int[][] testCases = {
            {1, 0, 0, 0, 0},            // 期望输出: [1,0,0,0,0]
            {1, 0, 2, 0, 3, 0, 4},      // 期望输出: [1,2,3,4,0,0,0]

        };
        
        for (int i = 0; i < testCases.length; i++) {
            int[] nums = testCases[i].clone(); // 克隆数组避免修改原数组
            System.out.println("测试用例 " + (i + 1) + ":");
            System.out.println("输入: " + Arrays.toString(testCases[i]));
            moveZeroes(nums);
            System.out.println("输出: " + Arrays.toString(nums));
            System.out.println("---");
        }
    }
} 