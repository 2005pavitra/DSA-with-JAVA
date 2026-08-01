package Problems_Practice;

public class Solve {

    public static long solve(int[] nums, int a, int b) {
        int n = nums.length;
        int[] tags = new int[n];

        // Step 1: Assign tags based on target groups (0, 1, or 2)
        for (int i = 0; i < n; i++) {
            if (nums[i] < a) {
                tags[i] = 0;
            } else if (nums[i] > b) {
                tags[i] = 2;
            } else {
                tags[i] = 1;
            }
        }

        // Step 2: Count inversions using Merge Sort logic
        return mergeSortAndCount(tags, 0, n - 1);
    }

    private static long mergeSortAndCount(int[] arr, int l, int r) {
        long count = 0;
        if (l < r) {
            int m = l + (r - l) / 2;
            count += mergeSortAndCount(arr, l, m);
            count += mergeSortAndCount(arr, m + 1, r);
            count += mergeAndCount(arr, l, m, r);
        }
        return count;
    }

    private static long mergeAndCount(int[] arr, int l, int m, int r) {
        int[] left = new int[m - l + 1];
        int[] right = new int[r - m];

        System.arraycopy(arr, l, left, 0, left.length);
        System.arraycopy(arr, m + 1, right, 0, right.length);

        int i = 0, j = 0, k = l;
        long swaps = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
                // All remaining elements in left[] are greater than right[j]
                swaps += (left.length - i);
            }
        }
        while (i < left.length) arr[k++] = left[i++];
        while (j < right.length) arr[k++] = right[j++];

        return swaps;
    }

    public static void main(String[] args) {
        int[] nums = {9,7,5,3};
        int a = 4;
        int b = 8;
        System.out.println("Minimum swaps needed: " + solve(nums, a, b));
    }
}
