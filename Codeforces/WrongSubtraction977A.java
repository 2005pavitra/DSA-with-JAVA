package Codeforces;

import java.util.*;

public class WrongSubtraction977A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);



            long n = sc.nextLong();
            int k = sc.nextInt();

            while(k>0){
                if(n%10 != 0){
                    n = n-1;
                }else{
                    n = n/10;
                }
                k--;



        }
        System.out.println(n);
    }
}