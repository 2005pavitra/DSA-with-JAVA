package Codeforces;

import java.util.*;

 class WayTooLong71A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-->0){
            String s = sc.next();
            System.out.println(solve(s));
        }
    }

    private static String solve(String s){
        int n = s.length();
        StringBuilder ans = new StringBuilder();
        if(n>10){
            int t = n -2;
            ans.append(s.charAt(0)+String.valueOf(t)+s.charAt(n-1));
            return ans.toString();
        }
        return s;

    }
}