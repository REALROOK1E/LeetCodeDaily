package 左神.Array;

/**
 * @author: ZeKai
 * @date: 2025/2/18
 * @description:
 **/
public class findduplicate {
    public static int findDuplicate(int[] a) {

        int slow=a[0];
        int fast=a[a[0]];
        while (slow!=fast) {
            slow=a[slow];
            fast=a[a[fast]];
        }
        //是索引
        fast=0;
        while (fast!=slow) {
            fast=a[fast];
            slow=a[slow];
        }
        return slow;
    }
    public static void main(String[] args) {
        int[] arr=new int[] {1,3,4,2,2};
        System.out.println(findDuplicate(arr));
        int[] arr2=new int[] {3,1,3,4,2};
        System.out.println(findDuplicate(arr2));
        int[] arr3=new int[] {3,3,3,3,3};
        System.out.println(findDuplicate(arr3));
    }
}
