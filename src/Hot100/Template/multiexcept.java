package Hot100.Template;

class multiexcept {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix=new int[nums.length];
        int val=1;
        prefix[0]=1;
        for(int i=1;i<nums.length;i++){
            val*=nums[i-1];
            prefix[i]=val;
        }
        // 1 1 2 6 除以自己的值
        int [] ans=new int[nums.length];
        val=1;
        ans[nums.length-1]=prefix[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            val*=nums[i+1];
            ans[i]=prefix[i]*val;
        }
        return ans;
}
}