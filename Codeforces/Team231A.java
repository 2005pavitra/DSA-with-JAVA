package Codeforces;
import java.util.*;

 class Team231{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if(a+b+c>=2)System.out.println(1);
            else {
                 System.out.println(0);
            }
        }
    }
}