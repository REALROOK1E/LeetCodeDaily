package 左神.binarysearch;

import java.util.Arrays;

/**
 * @author: ZeKai
 * @date: 2025/2/20
 * @description:
 **/
public class batteryproblem {
    public static long maxRunTime(int n, int[] batteries) {
 /*值域：如果所有电量都被用，那么因为可以切换，最大时间就是 batterie[sum]/n,也就是 总电量=n*总时间，理想状态下没有任何的浪费
 从0-sum/n,辅助函数：作用：如果n台电脑的公共运行时间是t小时，int[]battery 够不够
 例子：[3,3,3] 2 t=0-4 mid=2 够了 l=3 r=4 mid=3 够了 l=4 r=4 mid=4 够了
 例子：[1,1,1,1] 2 t=0-2 mid=1 够了 mid=2 够了
 例子：[1,3,5,7] 3 t=0-5 mid=2 够了 mid=3 够了 mid=4 够了 mid=5 不够
 电池大的直接放，小的怎么都行，那么就好说了
  */
        Arrays.sort(batteries);
        long ans=0;
        long l=0;
        long r=0;

        for(int i:batteries){
            r+=i;
        }

        while(l<=r){
           long mid=l+(r-l)/2;
           if(isenough(n,batteries,mid)){
               ans=Math.max(ans,mid);
               l=mid+1;
           }else r=mid-1;
        }

     return ans;
    }

    public static boolean isenough(int n, int[] batteries,long time) {
        long count=0;//计数器，为什么？因为我要看time时间够不够n个电脑在batteries电量运行
        int r=batteries.length-1;
        while(batteries[r]>=time&&r>0){
            count++;//比我理论最大的时间的供电量还打，那我肯定至少充了一个
            r--;
        }

        long e=0;
       while(r>=0){
           e+=batteries[r--];
       }

        count+=time==0?1:e/time;

        return count>=n;
    }


     /*
     最厉害的点在于 因为同时充电 所以 最大的那个电池比我max大的话，哪怕是100-1剩下的99也废了，所以count+1然后就跳下一个电池算了，
     两个黄金原则就是 大的充完就废，所有小的都能充到
     8-9
     1，3,4,7,10
     最大12
     9-12   11
     max 9  取一个7先试试
     2.2,2,2,5  //1
    */



    public static void main(String[] args) {
        int[] batteries = {1,3,4,7,10};
        maxRunTime(2,batteries);

    }
}
