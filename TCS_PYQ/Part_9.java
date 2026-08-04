package TCS_PYQ;

import java.util.*;

public class Part_9
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i< n;i++){
            arr[i] = sc.nextInt();
        }

        solve(arr);
    }

    private static void solve(int[] arr){
        int n = arr.length;
        if(n == 0) System.out.println("Array is Empty");
        int max = Integer.MIN_VALUE;

        for(int i = 0; i< n;i++){
            if(arr[i] > max){
                System.out.println(arr[i]);
            }

            max = arr[i];
        }

    }
}
