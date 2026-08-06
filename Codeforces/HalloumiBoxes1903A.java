package Codeforces;

import java.util.*;

public class HalloumiBoxes1903A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];

            for(int i = 0; i< n; i++){
                arr[i] = sc.nextInt();
            }

            if(isSorted(arr) || k>= n)System.out.println("YES");
            else if(k == 1)System.out.println("N0");
            else{
                System.out.println("YES");
            }
        }
    }

    private static boolean isSorted(int[] nums){
        int i = 0;

        while(i< nums.length-1){
            if(nums[i+1]<nums[i]){
                return false;
            }else{
                i++;
            }
        }

        return true;
    }
}