package Problems_Practice;

import java.util.Scanner;

public class LongestPalindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-->0){
            String s = sc.next();

            System.out.println(lp(s));
        }

        sc.close();

    }
    public static int lp(String s){
        int n = s.length();
        int[] cnt = new int[128];

        for(char c: s.toCharArray()){
            cnt[c]++;
        }

        int ans = 0;
        boolean isOddPresent = false;
        for(int i = 0; i<cnt.length; i++){
            if(cnt[i]%2 == 0){
                ans+=cnt[i];
            }else{
                isOddPresent = true;
                ans += (cnt[i]-1);
            }
        }

        return isOddPresent ? ans + 1 : ans;


    }
}
