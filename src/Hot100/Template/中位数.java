package Hot100.Template;

import java.util.Arrays;

public class 中位数 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int l=nums1.length+nums2.length;
        int[] arr=new int[nums1.length+nums2.length];
        System.arraycopy(nums1, 0, arr, 0,nums1.length );
        System.arraycopy(nums2, 0, arr, nums1.length,nums2.length );
        Arrays.sort(arr);
        return l%2==0?(double)(arr[l/2]+arr[(l/2)-1])/2:(double)arr[l/2];
    }
    
    // 二分查找解法 - 最优解
    public static double findMedianSortedArraysBinary(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int left = (m + n + 1) / 2;  // 第left小的数
        int right = (m + n + 2) / 2; // 第right小的数
        
        // 如果是奇数，left == right
        // 如果是偶数，left + 1 == right
        return (findKth(nums1, 0, nums2, 0, left) + 
                findKth(nums1, 0, nums2, 0, right)) / 2.0;
    }
    
    // 寻找第k小的数
    private static int findKth(int[] nums1, int start1, int[] nums2, int start2, int k) {
        // 如果nums1用完了，直接返回nums2中的第k小
        if (start1 >= nums1.length) {
            return nums2[start2 + k - 1];
        }
        
        // 如果nums2用完了，直接返回nums1中的第k小
        if (start2 >= nums2.length) {
            return nums1[start1 + k - 1];
        }
        
        // 如果k==1，返回两个数组首元素的最小值
        if (k == 1) {
            return Math.min(nums1[start1], nums2[start2]);
        }
        
        // 二分查找
        int mid1 = start1 + k/2 - 1 < nums1.length ? 
                    nums1[start1 + k/2 - 1] : Integer.MAX_VALUE;
        int mid2 = start2 + k/2 - 1 < nums2.length ? 
                    nums2[start2 + k/2 - 1] : Integer.MAX_VALUE;
        
        if (mid1 < mid2) {
            // nums1的前k/2个元素都在第k小之前
            return findKth(nums1, start1 + k/2, nums2, start2, k - k/2);
        } else {
            // nums2的前k/2个元素都在第k小之前
            return findKth(nums1, start1, nums2, start2 + k/2, k - k/2);
        }
    }
    
    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2, 7};
        
        System.out.println("原始方法结果: " + findMedianSortedArrays(nums1, nums2));
        System.out.println("二分查找结果: " + findMedianSortedArraysBinary(nums1, nums2));
        
        // 测试更多例子
        int[] nums3 = {1, 2};
        int[] nums4 = {3, 4};
        System.out.println("\n测试2: " + findMedianSortedArraysBinary(nums3, nums4));
    }
}
