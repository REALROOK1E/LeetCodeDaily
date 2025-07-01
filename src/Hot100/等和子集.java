package Hot100;

import java.util.Arrays;
public class 等和子集 {
    
        public static boolean canPartition(int[] nums) {
            Arrays.sort(nums);
            int[] prefix =new int[nums.length];
            int sum=0;
          
          for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            prefix[i]=sum;
          }
        for (int i = 0; i < prefix.length; i++) {
            System.out.println(prefix[i]);
        }

          if(prefix[nums.length-1]%2!=0) return false;

     for (int i = 0; i < prefix.length-1; i++) {
        if (prefix[nums.length-1]-prefix[i]==prefix[i]) return true;
     }
     
            return false;       
        }
  
  
public static void main(String[] args) {

    if(canPartition(new int[] {2,2,1,1})) System.out.println("6");

}

    }

