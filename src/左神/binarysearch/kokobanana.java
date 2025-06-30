package 左神.binarysearch;

/**
 * @author: ZeKai
 * @date: 2025/2/18
 * @description: Koko吃香蕉问题
 **/
public class kokobanana {
    public static int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = 0;
        int ans = 0;

        // 找到最大堆的香蕉数，作为右边界
        for (int i : piles) {
            r = Math.max(r, i);
        }

        // 二分查找
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (calculateTime(piles, mid) > h) {
                l = mid + 1; // 速度太慢，增加速度
            } else {
                r = mid - 1; // 速度足够快，尝试更小的速度
                ans = mid;   // 更新当前的最小速度
            }
        }

        return ans; // 返回最小速度
    }

    // 计算以给定速度吃完所有香蕉所需的时间
    public static long calculateTime(int[] piles, int speed) {
        long res = 0;
        for (int i : piles) {
            res += (i + speed - 1) / speed; // 向上取整
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {805306368, 805306368, 805306368};
        System.out.println(minEatingSpeed(arr, 1000000000)); // 输出应为4
    }
}