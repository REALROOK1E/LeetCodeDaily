package DSdesign;


public class numberof1bits {
    public int hammingWeight(int n) {
     int res=0;
     while(n!=0){
         res+=(n&1);
         n>>=1;
     }
     return res;
    }

    public static void main(String[] args) {
        System.out.println(new numberof1bits().hammingWeight(1));
    }
}