package
import java.util.HashSet;

class 最长连续序列 {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> set=new HashSet<>();
        for (Integer i : nums) {
         set.add(i);   
        }
        int ans=0;
        for (int i = 0; i < nums.length; i++) {
            if(!set.contains(nums[i]-1)){
                int len=1;
                int n=nums[i];
                while(set.contains(n+1)){
                    n++;
                    len++;
                }
                ans=Math.max(ans ,len);
            }
        }
return ans;
    }
}