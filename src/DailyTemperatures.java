import java.util.Arrays;

/**
 * @author: ZeKai
 * @date: 2025/2/11
 * @description:
 **/
public class DailyTemperatures {
    public static int[] dailyTemperatures(int[] temperatures) {
       if (temperatures == null || temperatures.length ==0) {return new int[0];}
       int[] res=new int[temperatures.length];

       for (int i = 0; i < temperatures.length; i++) {
           int p=i+1;
           //对于每一个数i，都把p移动到第一个比它大的值上，如果没有就是0;
           while(p<temperatures.length)
           {
               if(temperatures[p]<=temperatures[i])
                p=p+1; else break;
           }
           //如何判断是没有最大的还是最大的在最后
           if(p==temperatures.length) res[i]=0;
           else res[i]=p-i;
           System.out.println(res[i]);
       }

        System.out.println(Arrays.toString(res));
       return res;
    }
    public static void main(String[] args) {
        dailyTemperatures(new int[]{1,1,1,1,1,1,1,1,1,1,1,1,2});
    }
}
