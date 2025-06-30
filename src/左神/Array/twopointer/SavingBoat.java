package 左神.Array.twopointer;

import java.util.Arrays;

/**
 * @author: ZeKai
 * @date: 2025/2/18
 * @description:
 **/
public class SavingBoat {
    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);//1355
        //最多坐limit个人，最少几艘船可以送过去？

       int l=0;
       int r=people.length-1;
       int res=0;

       while(l<=r) {
           if(people[l]+people[r]<=limit){
               res++;
               l++;
               r--;
           }else {
               r--;
               res++;
           }
           if (r==l) return res+1;//我加这个特判真是天才啊一下整好了
       }
       return res;

    }

    public static void main(String[] args) {
        int[] people = {1,5,3,5};//1355
        System.out.println(numRescueBoats(people,7));
    }
}
