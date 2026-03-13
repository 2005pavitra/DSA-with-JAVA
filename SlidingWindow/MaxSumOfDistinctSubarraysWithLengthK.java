package SlidingWindow;

import java.util.*;

public class MaxSumOfDistinctSubarraysWithLengthK {

    public long maximumSubarraySum(int[] nums, int k) {

        int n = nums.length;
        int i = 0;
        long sum = 0;
        long max = 0;

        HashSet<Integer> set = new HashSet<>();

        for (int j = 0; j < n; j++) {

            while (set.contains(nums[j])) {
                set.remove(nums[i]);
                sum -= nums[i];
                i++;
            }

            set.add(nums[j]);
            sum += nums[j];

            if (j - i + 1 == k) {

                max = Math.max(max, sum);

                set.remove(nums[i]);
                sum -= nums[i];
                i++;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        MaxSumOfDistinctSubarraysWithLengthK obj =
                new MaxSumOfDistinctSubarraysWithLengthK();

        int[] nums = {1, 5, 4, 2, 9, 9, 9};
        int k = 3;

        long result = obj.maximumSubarraySum(nums, k);

        System.out.println("Maximum Sum = " + result);
    }
}