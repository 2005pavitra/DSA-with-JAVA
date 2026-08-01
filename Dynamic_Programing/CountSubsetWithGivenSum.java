package Dynamic_Programing;

public class CountSubsetWithGivenSum {
    static int countSubsets(int[] nums, int target){
        int n = nums.length;

        int[][] dp = new int[n+1][target+1];
        dp[0][0] = 1;

        for(int i = 1; i<= n; i++){
            for(int j = 0; j<= target; j++){
                if(nums[i-1]<= j){
                    dp[i][j] = dp[i-1][j] + dp[i-1][j-nums[i-1]];
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[n][target];
    }

    public static void main(String[] args){
        int[] nums = {1,1,1, 1, 1};
        int target = 3;

        System.out.println(countSubsets(nums, target));
    }

}
