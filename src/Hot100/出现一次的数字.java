package Hot100;

public class 出现一次的数字 {
    
    public static int singleNumber(int[] nums) {
        
        int res=0;
     for (int i : nums) {
        res^=i;
     }
     return res;
    }


    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{1,1,6,6,5,5,4,4,2}));
    }
}
