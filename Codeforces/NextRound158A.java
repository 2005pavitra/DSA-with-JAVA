package Codeforces;

import java.util.*;

public class NextRound158A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        if(k>n)System.out.println("0");

        int score = arr[k-1];

        int cnt = 0;

        for(int i = 0; i< n; i++){
            if(arr[i]!= 0 && arr[i]>=score){
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}