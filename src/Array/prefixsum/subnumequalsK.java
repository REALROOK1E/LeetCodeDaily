package Array.prefixsum;

import java.util.HashMap;

/**
 * @author: ZeKai
 * @date: 2025/2/27
 * @description:
 **/
public class subnumequalsK {
    public int subarraySum(int[] nums, int k) {
  //这种题 相当于2sum，当前数的和是10，目标是7，那我就找前面3出现过几次就行。
        /*
        准则就是，前三个数字的和是3，那么后面的所有位置i的sum，只要-3=k，都能构建一个从3开始到i的数组
        3出现了value次，那么意味着每个数都对应着可能的value个答案
         */
        int[] sum=new int[nums.length];
        int ans=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);//前缀和为0，出现了一次
        int s=0;
        for (int i = 0; i < nums.length; i++) {
            sum[i]+=nums[i]+s;
            s=sum[i];
            ans+=map.getOrDefault(sum[i]-k,0);
            map.put(sum[i],map.getOrDefault(sum[i],0) + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new subnumequalsK().subarraySum(new int[]{1,1,1}, 2));
    }
}
