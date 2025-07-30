/**
 * LC131 - 分割回文串
 * 难度：中等
 * 描述：
 * 给你一个字符串 s，请你将 s 分割成一些子串，使每个子串都是回文串。返回 s 所有可能的分割方案。
 * 回文串 是正着读和反着读都一样的字符串。
 */
import java.util.*;

public class LC131_分割回文串 {

   public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        f1(candidates, target, 0, list, 0, ans);
        return ans;
    }

    public void f1(int[] candidates, int target, int sum, List<Integer> list, int start, List<List<Integer>> ans) {
        if (sum == target) {
            ans.add(list);
            list = new ArrayList<>();
        }
        for (int j = start; j < candidates.length; j++) {
            if (sum + candidates[j] > target)
            break;
            list.add(candidates[j]);
            f1(candidates, target, sum + candidates[j], list, start + 1, ans);
            list.remove(list.size()-1);
        }
    }

    public boolean ishui(String s){
        char[] c=s.toCharArray();
        int l=0;
        int r=c.length-1;
        while(l<r) if(c[l++]!=c[r--]) return false;
        return true;
    }

    public static void main(String[] args) {
        LC131_分割回文串 solution = new LC131_分割回文串();
        String s = "aab";
        List<List<String>> result = solution.partition(s);
        System.out.println("结果: " + result);
    }
}
