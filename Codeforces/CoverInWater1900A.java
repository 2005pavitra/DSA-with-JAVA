package Codeforces;

import java.util.*;

public class CoverInWater1900A{
    public static void main(String[] arsgs){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            String s= sc.next();

            int i = 0;
             int cnt = 0;
            int dots = 0;
            while(i< s.length()){
                if(s.charAt(i) == '.'){
                    while(i<s.length() && s.charAt(i) == '.'){
                        cnt++;
                        i++;

                        if(cnt ==3){
                            System.out.println("2");
                            return;
                        }
                    }

                    dots+=cnt;

                }else{
                    cnt = 0;
                    i++;
                }

            }

            System.out.println(dots);
        }
    }
}