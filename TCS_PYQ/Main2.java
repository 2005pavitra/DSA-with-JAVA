package TCS_PYQ;

import java.util.*;

public class Main2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0;i < n; i++){
            arr[i] = sc.nextInt();
        }

        int[] ans = solve(arr);

        for(int x: ans){
            System.out.print(x+" ");
        }
    }


    private static int[] solve(int[] arr){
        int n = arr.length;
        int r = 0;
        int r1 = 0;
        int r2 = 0;


        for(int i : arr){
            if(i == 0){
                r++;
            }else if(i == 1){
                r1++;
            }else{
                r2++;
            }


        }

        List<Integer> ans = new ArrayList<>();
        int i = 0;
        while(r>0){
            arr[i] = 0;
            r--;
            i++;
        }

        while(r1> 0){
            arr[i] = 1;
            r1--;
            i++;
        }

        while(r2> 0){
            arr[i] = 2;
            r2--;
            i++;
        }

        return arr;
    }
}