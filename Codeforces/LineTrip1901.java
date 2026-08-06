package Codeforces;

import java.util.*;

public class LineTrip1901{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int x = sc.nextInt();

            int[] arr = new int[n];

            for(int i = 0;i<n; i++){
                arr[i] = sc.nextInt();
            }

            int max = Math.max((arr[0]-0),(x-arr[n-1])*2);
                for(int i = 1; i< n; i++){

                    int curr = arr[i]-arr[i-1];
                    max = Math.max(curr, max);
                }

            System.out.println(max);

        }
    }
}