package Stack.monotonicstack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: ZeKai
 * @date: 2025/6/25
 * @description: 单调栈 - 找到每个元素左边最近的较小值和右边最近的较小值
 **/

public class monoStack {

    static int [] arr = new int[]{2,4,5,3,6,1};
    
    public static void monoinfo(int [] arr){
        int r = 0;  // 栈顶指针
        int [] stack = new int[arr.length];  // 栈数组，存储索引
        HashMap<Integer, String> ans = new HashMap<>();

        for (int i = 0; i < arr.length; i++){
            // 当栈不为空且当前元素小于栈顶元素时，弹出栈顶
            while(r > 0 && arr[i] < arr[stack[r-1]]){
                int poppedIndex = stack[r-1];  // 弹出的元素索引
                r--;  // 出栈
                
                // 找到右边最近的较小值
                String rightSmaller = "右边：" + arr[i];
                
                // 找到左边最近的较小值
                String leftSmaller;
                if(r > 0) {
                    leftSmaller = "左边：" + arr[stack[r-1]];
                } else {
                    leftSmaller = "左边：没有";
                }
                ans.put(poppedIndex, leftSmaller + " " + rightSmaller);
            }
            // 当前元素入栈
            stack[r] = i;
            r++;
        }
        
        // 处理栈中剩余的元素（它们右边没有更小的元素）
        while(r > 0){
            int remainingIndex = stack[r-1];
            r--;
            String leftSmaller=r>0?"左边：" + arr[stack[r-1]]:"左边：没有";
            ans.put(remainingIndex, leftSmaller + " 右边：没有");
        }

        // 打印结果
        System.out.println("数组：" + Arrays.toString(arr));
        System.out.println("每个元素左边最近的较小值和右边最近的较小值：");
        for(int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]=" + arr[i] + " -> " + ans.get(i));
        }
    }
    
    public static void main(String[] args) {
        monoinfo(arr);
    }
}


