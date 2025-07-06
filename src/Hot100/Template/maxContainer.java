package Hot100.Template;

import java.util.Arrays;

public class maxContainer {
    public static int maxArea(int[] height) {
        //当左边>右边时候，右指针左边比右指针小的都不算，反之也是

        int l=0;
        int r=height.length-1;
        int ans=0;
        while(l<r){
            if(height[l]<height[r])

            ans=Math.max(ans,(r-l)*Math.min(height[l++],height[r]));

            else
            
            ans=Math.max(ans,(r-l)*Math.min(height[l],height[r--]));
        }
return ans;
        
    }

    public static void main(String[] args) {
        maxArea(new int[] {1,8,6,2,5,4,8,3,7});
    }
}
