package 动态规划;
/*
 * 有一串括号，dp[i] 表示的是：往左边数能数多长的括号列
 * 最短就是2  动态规划：有一个游走的p，看往前多少就不能了
 * 如果是左括号，就为0，因为一定不能往左数
 * 如果是右括号，看dp[i-1]，决定了第一个和这个右括号匹配的左括号在哪。
 * 然后就是再-1，看看前面有没有连着的，然后就没有了。三段。
 * 给你一个只包含 '(' 和 ')' 的字符串，找出最长有效（格式正确且连续）括号子串的长度。
 * dp[i]=dp[i-1]+2+dp[i-dp[i-1]-1]
 * p=i-dp[i-1]-1,这就是和当前右括号匹配的位置，不能越界，而且p位置要是左括号。越界了就是没有
 * 最后答案再加上dp[p-1];
输入：s = "(()"
输出：2
解释：最长有效括号子串是 "()"

示例 2：
输入：s = ")()())"
输出：4
解释：最长有效括号子串是 "()()"

示例 3：
输入：s = ""
输出：0
 * 为什么？因为前面之所以是断的，就是因为已经找过了
 */
public class 最长的括号序列 {
        public static int longestValidParentheses(String s) {
   //构造一个序列，右括号才可以，左括号就是0，然后遇到右括号往左边探路
            char[] c=s.toCharArray();
            int [] dp= new int [s.length()];
            for(int i=1;i<c.length;i++){
                if(c[i]==')'){
                 int match=i-dp[i-1]-1;
                if(match>=0&&c[match]=='(')
                {
                    dp[i]=2+dp[i-1]+(match>0?dp[match-1]:0);
                }   
                }
            }
            int ans=0;  // 修复：初始化为0而不是-1
            for(int i=0;i<c.length;i++){
                ans=Math.max(ans,dp[i]);
            }
            return ans;

    }
public static void main(String[] args) {
    System.out.println(longestValidParentheses("()(())"));
}
  

}
