package TCS_PYQ;

import java.util.HashMap;

public class Part_3 {
    public static void main(String[] args){
        int[][] arr = { {1, 0, 1}, {1, 0, 0}, {1, 1, 0},{1,1,1} };
        System.out.println(solve(arr));
    }

    private static int solve(int[][] arr){
        int max = 0;
        int n = arr.length;
        int m = arr[0].length;

        int row  = 0;


        for(int i = 0; i<n; i++){
            int cnt = 0;
            for(int j = 0; j< m; j++){
                if(arr[i][j] == 1){
                    cnt++;
                }
            }
            if(cnt>max){
                row = i+1;
            }
            max = Math.max(max,cnt);



        }

        return row;
    }
}
