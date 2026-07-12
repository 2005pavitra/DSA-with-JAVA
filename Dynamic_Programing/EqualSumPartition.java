package Dynamic_Programing;

public class EqualSumPartition {
    static boolean equalSum(int[] nums ){
        int sum = 0;
        for(int num : nums){
            sum+=num;
        }
        if(sum%2 != 0) return false;

        return solve(nums, sum/2);
    }

    private static boolean solve(int[] nums , int target){
        int n = nums.length;
        boolean[][] dp = new boolean[n+1][target+1];

        for(int i = 0; i<= n; i++){
            dp[i][0]  = true;
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
        int[] nums = {1, 5, 11, 5 };
//        int[] wt = {4, 5, 1};
//        int W = 4;

        System.out.println(equalSum(nums));
    }
}
