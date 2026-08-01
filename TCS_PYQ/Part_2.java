package TCS_PYQ;

public class Part_2 {
    public static void main(String[] args){
        String s = "01:00:00";
        System.out.println(s.substring(3,5));
    }
}

/**
 * class Solution {
 *     public int minimumCost(int[] nums, int k) {
 *         int n = nums.length;
 *         int avail = k;
 *         long cost = 0;
 *         int cntr = 1;
 *         long MOD = 1_000_000_007L;
 *         int x = 1;
 *
 *         for (int i = 0; i < n; i++) {
 *             if (avail >= nums[i]) {
 *                 avail -= nums[i];
 *             } else {
 *
 *                 // avail+=k;
 *                 int temp = (nums[i] - avail) / k;
 *                 if ((nums[i] - avail) % k == 0) {
 *                     cntr = temp;
 *
 *                 } else {
 *                     cntr = temp + 1;
 *
 *                 }
 *                 for (int j = x; j <= cntr; j++) {
 *                     cost += j;
 *                 }
 *                 x = cntr + 1;
 *                 avail += cntr * k;
 *                 avail -= nums[i];
 *
 *             }
 *         }
 *
 *         return (int) cost;
 *     }
 * }
 */