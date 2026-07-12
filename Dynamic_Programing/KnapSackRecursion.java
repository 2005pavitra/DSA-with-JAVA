package Dynamic_Programing;

public class KnapSackRecursion {
    static int knapsackRec(int W, int[] val, int[] wt, int n){
        if(n == 0 || W == 0)return 0;

        int pick = 0;

        if(wt[n-1] <= W){
            pick = val[n-1] + knapsackRec(W-wt[n-1], val, wt, n-1);

        }

        int notpick = knapsackRec(W, val, wt, n-1);

        return Math.max(pick, notpick);
    }
    static int knapsack(int W, int[] val, int[] wt) {
        int n = val.length;
        return knapsackRec(W, val, wt, n);
    }

    public static void main(String[] args) {
//Driver Code Starts
        int[] val = {1, 2, 3};
        int[] wt = {4, 5, 1};
        int W = 4;

        System.out.println(knapsack(W, val, wt));
    }
}
