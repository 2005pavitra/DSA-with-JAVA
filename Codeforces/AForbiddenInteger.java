// https://codeforces.com/contest/1845/problem/A

import java.util.Scanner;

public class AForbiddenInteger{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt(); 
            int k = sc.nextInt(); 
            int x = sc.nextInt(); 

            
            if(k == 1){
                System.out.println("No");
            }
            else if( n%2 ==1 && (k == 2 && x == 1)){
                System.out.println("No");
            }else{
                System.out.println("Yes");

                if(x != 1){
                    System.out.println(n);
                    for(int i = 0; i< n;i++){
                        System.out.print("1"+" ");
                    }
                }else if(x== 1){
                    if(n%2 == 0){
                        System.out.println(n/2);
                        for(int i = 0; i<n/2; i++){
                            System.out.print("2"+" ");
                        }
                    }else{
                        System.out.println((n - 1) / 2);
                        System.out.print("3"+" ");
                        n-=3;
                        while(n>0){
                            System.out.print("2"+" " );
                            n-=2;
                        }
                    }
                }

            }
            System.out.println();
        }
    }
}