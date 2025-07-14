package 递归;

import java.util.HashSet;

public class 子序列 {
    /*base case：i到了字符串终止位置，就把路径上的字符收集进去
    然后递归，减回去，再递归，因为一共就是有和没有两种状态
   答案在一个set里面
    */


    public static String[] subsequence (String s) {
        HashSet<String> set= new HashSet<>();

       
        StringBuilder path=new StringBuilder();
        f1(s.toCharArray(), 0, path, set);

        String ans[]=new String [set.size()];
        int i=0;
        for (String a : set) {
            ans[i++]=a;
        }
        return ans;
    }
    public static void main(String[] args) {
        
    }
    public static void f1(char[] s,int i,StringBuilder path,HashSet<String> set){

        if(i==s.length) set.add(path.toString());
        else{
            path.append(s[i]);//加上
            f1(s,i+1,path,set);
            path.deleteCharAt(path.length()-1);//减去刚才加上的
            //为什么每次都减最后一个？因为递归的每一步自己对自己负责，子过程的有子过程的删除，不用你管，你加上的是最后一个，那就删最后一个
            f1(s, i+1, path, set);
        }
    }
    public static void f2(char[] s,int i,char[] path,int size,HashSet<String> set){
        if(i==s.length) set.add(String.valueOf(path,0,size));//从0-size收集
        else{
           path[size]=s[i];
           f2(s,i+1, path, size+1, set);
           f2(s, i+1,path, size, set);
        }
    }
}
