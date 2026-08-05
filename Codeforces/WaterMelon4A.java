package Codeforces;

import java.util.*;

public class WaterMelon4A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();

        if(w%2 != 0)System.out.println("False");
        else{
            int i = 1;
            while(i<w){
                int rem1 = w%i;
                int rem2 = w-rem1;
                if(rem1 %2 == 0 && rem2 %2 == 0){
                    System.out.println("True");
                    return ;
                }
                i++;
            }
        }
        System.out.println("False");
        sc.close();
    }
}