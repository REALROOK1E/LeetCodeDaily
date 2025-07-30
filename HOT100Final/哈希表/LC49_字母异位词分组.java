/**
 * LC49 - 字母异位词分组
 * 难度：中等
 * 描述：
 * 给你一个字符串数组，请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表。
 * 字母异位词 是由重新排列源单词的字母得到的一个新单词，所有源单词中的字母通常恰好只用一次。
 */
import java.util.*;

public class LC49_字母异位词分组 {

    /**
     * 方法：哈希表
     * @param strs 字符串数组
     * @return 分组结果
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        // 实现逻辑
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        LC49_字母异位词分组 solution = new LC49_字母异位词分组();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = solution.groupAnagrams(strs);
        System.out.println("结果: " + result);
    }
}
