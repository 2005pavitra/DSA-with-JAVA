package Arrays;

public class KadansAlgorithm {
    public static void kadan(int[] arr){
        int n = arr.length;
         int currSum = arr[0];
         int maxSum = arr[0];

        for (int i = 0; i < n;i++) {
            currSum+= arr[i];

            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("Max subarray sum: "+ maxSum);
    }


    public static void main(String[] args) {
//        int[] arr = {1,-2,6,-1,3};
        int[] arr = {-1, -2, -3, -4};
        kadan(arr);
    }
}
