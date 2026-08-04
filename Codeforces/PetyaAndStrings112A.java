package Codeforces;

import java.util.Scanner;

public class PetyaAndStrings112A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        int i = 0;
        while(i< s1.length()){
            if(s1.charAt(i)<s2.charAt(i)){
                System.out.println(-1);
                return;
            }else if(s1.charAt(i)>s2.charAt(i)){
                System.out.println(1);
                return ;
            }else{
                i++;
            }
        }
        System.out.println(0);
    }
}
