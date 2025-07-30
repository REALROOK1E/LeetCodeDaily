
import java.util.*;

public class fuck {

    public static List<String> generateParenthesis(int n) {
        //选或者不选。。。选代表（，不选是），选n次
    List<String> ans=new ArrayList<>();
    StringBuffer sb=new StringBuffer("");
    f1(n,0,0,sb,ans);
    return ans;
    }
    
    public static void f1(int n,int l,int r,StringBuffer path,List<String> list){
            if(r==n){
                list.add(path.toString());
            }
            if(l<n){
                path.append("(");
                f1(n,l+1,r,path,list);
                path.deleteCharAt(path.length()-1);
            }
            if(r<n){
                path.append(")");
                f1(n,l,r+1,path,list);
                 path.deleteCharAt(path.length()-1);
            }
    }

    public static void main(String[] args) {

        List<String> result = generateParenthesis(2);
        System.out.println("结果: " + result);
    }
}
