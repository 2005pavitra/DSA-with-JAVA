package Dynamic_Programing;

public class CountSubsetWithGivenSum {
    static int countSubsets(int[] nums, int target){
        int n = nums.length;

        int[][] dp = new int[n+1][target+1];
        for(int i = 0; i<= n; i++){
            dp[i][0] = 1;
        }

        for(int j = 1; j<= target;j++ ){
            dp[0][j] = 0;
        }

        for(int i = 1; i<= n; i++){
            for(int j = 1; j<= target; j++){
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
        int[] nums = {2, 3, 5, 6, 8, 10};
        int target = 10;

        System.out.println(countSubsets(nums, target));
    }

}
