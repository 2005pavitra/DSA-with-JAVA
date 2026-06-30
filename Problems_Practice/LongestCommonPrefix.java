package Problems_Practice;
import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-->0){
            int n = sc.nextInt();

            String[] s = new String[n];

            for(int i = 0; i< n; i++){
                 s[i] = sc.next();
            }
            System.out.println(lcp(s));
        }

    }
    public static String lcp(String[] strs){
        int n = strs.length;
        if(strs.length <= 1) return null;
        int l =0;


        int j = 1;
        while( j< n){

            if(strs[0].charAt(l) != strs[j].charAt(l) ){
                break ;
            }
            else{
                j++;
            }
            l++;
        }


        return strs[0].substring(0, l);
    }
}
