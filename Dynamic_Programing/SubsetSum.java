package Dynamic_Programing;

public class SubsetSum {
    static boolean subsetSum(int[] nums, int target, int n){
        boolean[][] dp = new boolean[n+1][target+1];

        for(int i = 0; i<= n; i++){
            dp[i][0] = true;
        }

        for(int j = 1; j<= target; j++){
            dp[0][j] = false;
        }

        for(int i = 1; i<= n; i++){
            for(int j = 1; j<= target; j++){
                if(nums[i-1]<= j){
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-nums[i-1]];
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[n][target];
    }
    public static void main(String[] args) {
        int[] nums = {2, 3, 7, 8, 10 };
//        int[] wt = {4, 5, 1};
//        int W = 4;

        System.out.println(subsetSum(nums, 11, 5));
    }
}
