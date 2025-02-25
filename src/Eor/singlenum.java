package Eor;

/**
 * @author: ZeKai
 * @date: 2025/2/23
 * @description:
 **/
public class singlenum {
    public static int singleNumber(int[] nums) {
    int eor=0;
    for(int n:nums){
        eor=eor^n;
    }
    return eor;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{1,2,3,3,2};
        System.out.println(singleNumber(nums));
    }
}
