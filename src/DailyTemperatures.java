import java.util.Arrays;
import java.util.Stack;

/**
 * @author: ZeKai
 * @date: 2025/2/11
 * @description:
 **/
public class DailyTemperatures {
    public static int[] dailyTemperatures(int[] temperatures) {
        //维护单调栈，因为我要使用的是最大值，所以是最大单调栈，最下面的值应该是最大值
        //有一个固定的写法
        int[] res=new int[temperatures.length];
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < temperatures.length; i++) {
            while (!s.isEmpty() && temperatures[i] > temperatures[s.peek()]) {
                Integer p=s.pop();
                res[p]=i-p;
            }
            //注意思考得到答案的位置，5的位置直接决定了前面的答案，所以必然是小循环里出答案，怎么可能在不知道后面的情况下在每一次循环里都有答案呢？
            //不要陷入思维的定式
            s.push(i);
        }
        System.out.println(Arrays.toString(res));
        return res;
    }
    public static void main(String[] args) {
        dailyTemperatures(new int[]{4,2,1,5,6,9,1,5,6});
    }
}
