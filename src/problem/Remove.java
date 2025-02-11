package problem;

/**
 * @author: ZeKai
 * @date: 2025/2/11
 * @description:
 **/
public class Remove {
    public static String removeOccurrences(String s, String part) {
        char[] ch= s.toCharArray();
        int j=0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(ch[i]);

            if(sb.toString().length()<part.length()) { j++; continue;};
            if(sb.substring(j-part.length()+1).equals(part)){
                sb.delete(sb.length()-part.length(), sb.length());
                j-=part.length();
            }
            j++;
            System.out.println(sb.toString());
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        removeOccurrences("axxxyyyb","xy");
}}
