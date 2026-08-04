package Codeforces;

import java.util.*;

public class Bit282A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int ans = 0;

        while(T-->0){
            String s = sc.next();
            int n =s.length();
            if(s.charAt(1) =='+'){
                ans++;
            }else{
                ans--;
            }
        }

        System.out.println(ans);
    }
}