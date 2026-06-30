package Problems_Practice;
import java.util.*;

public class ReverseStringsInWords {
    public static void main(String[] args ){
//        String s = "  hello world  ";
        String s = "the sky is blue";
        StringBuilder sb = new StringBuilder();
        int l = s.length() - 1;
        int start = 0;
        while (l >= 0) {
            while (l>= 0 && s.charAt(l) == ' ') {
                l--;
            }

            if(l<0)break;

            start = l;
            while(l>= 0 && s.charAt(l)!= ' '){
                l--;
            }
            sb.append(s.substring(l+1, start+1));
            sb.append(" ");
        }

        String ans = sb.toString();
        int sz = sb.length();
         ans.substring(0, sz-1);
        System.out.print(ans);
    }



}
