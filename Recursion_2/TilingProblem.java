package Recursion_2;

public class TilingProblem {
    public static int tiling(int n){
        if(n==0 || n == 1){
            return 1;
        }

        //horizontal
        int horizontal = tiling(n-1);

        //vertical
        int vertical = tiling(n-2);

        int totalWays = horizontal + vertical;

        return totalWays;
    }

    public static void main(String[] args) {
        System.out.println(tiling(4));
    }
}
