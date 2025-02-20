package binarysearch;

/**
 * @author: ZeKai
 * @date: 2025/2/19
 * @description:
 **/
public class aplitarray {
    public static  int splitArray(int[] nums, int k) {
    //分析单调性，判断是不是二分问题
        //最小就是0，最大是数组的所有sum
        //和顺序无关
        //我大胆的猜测，辅助函数就是利用给定的参数表示答案
        //比如：这里要求固定分成k个组，那我的函数目的就要算k在一个范围内能不能分成功，在所有的范围内进行二分
        //也就是说，这里函数接受一个arr，一个k，假定一个组有x人，看能不能分成功
        //如果能就接受这个答案，然后缩小范围二分，否则就换范围。
        //比如一个组：1,2,3,4,5，假设5人一组 1，2一组，3 4,5各自一组，就是四组，其实加到第三时候就可以返回false了
        //还是上面的例子，二分应该是7人一组开始，123 一组，4一组，5一组，三组比两组大，所以边界往右边找 8-15
        //11人一组->1234一组，5一组，可以两组分好，那么这个时候记录答案，然后往左边找更优解答 8-10
        //9 人一组 ——> 123一组，45一组，这个也可以而且最大值是9比上一个答案的最大值10要小，是最佳答案。

        /*
        同理分析一下[7,2,5,10,8] 先排个序？不可以，因为是subarray  总和是32 要求分两组
        假定一个组有k=16人 257+10+8，三组不可以，k不够，那么k找右边17-32
        k=24   2 5 7 10 + 8 可以，存一个答案，然后旺座！23-17
        k=20   7+2+5=10+8  可以 存一个答案 然后往左找 17-19
        k=18   7+2+5=10+8 可以 找完了 大小没变 ，往左找 17-17
        优先想到把返回值作为“要找的那个数”
         */
        int ans=0;
        int sum=0;

        for(int i:nums){
            sum+=i;

        }
        ans=sum;
        int l=0;
        int r=sum;
     while(l<=r){
         int mid=l+(r-l)/2;
         if(f(nums,mid,k)){
             ans=Math.min(ans,mid);
             r=mid-1;
         }else{
             l=mid+1;
         }
     }
        return ans;
    }
    //意思是：每一组x个人能分成对应的组数吗
    public static boolean f(int[] nums, int x,int k) {
        int count = 0;
        int groups=1;
        for(int i:nums){
            if(count+i>x){
                groups++;
                count=i;
            }else{
                count+=i;
            }
           if(groups>k||count>x){
               return false;
           }
        }
        return true;
    }

    public static void main(String[] args) {
       // int[] nums=new int[] {1,2,3,4,5};
        int[] nums2=new int[] {1,4,4};
       // splitArray(nums,2);
        //x=4
        splitArray(nums2,3);

    }
}
