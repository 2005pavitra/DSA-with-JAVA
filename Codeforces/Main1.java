package Codeforces;

import java.util.*;

public class Main1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            // if(n == 2){
            //     System.out.println("YES");
            //     // return;
            // }

            // int winner = 2+n-1;

            // for(int i = 2; i<=n; i++ ){
            //     int card = 2+n-i;
            //     if(winner % card){
            //         System.out.println("NO");
            //         // return ;
            //     }


            // }
//            if(!isPrime(n+1)){
//                System.out.println("YES");
//            }
            if (isPrime(n + 1)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }

    }

    private static boolean isPrime(int n){
        if(n < 2) return false;
        if(n == 2) return true;
        if(n % 2 == 0) return false;

        for(int i = 3; i * i <= n; i += 2){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }
}