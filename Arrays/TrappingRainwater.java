package Arrays;

public class TrappingRainwater {
    public static void trapped(int[] arr){
        int n = arr.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
//        int[] min = new int[n];
        leftMax[0] = arr[0];
        rightMax[n-1] = arr[n-1];
        int sum = 0;

        for(int i = 1; i <n; i++){
            if(arr[i] > leftMax[i-1]){
                leftMax[i] = arr[i];
            }else{
                leftMax[i] = leftMax[i-1];
            }
        }

        for(int j = n-2; j>=0; j--){
            if(arr[j] > rightMax[j+1]){
                rightMax[j] = arr[j];
            }else{
                rightMax[j] = rightMax[j+1];
            }
        }

        for (int i = 0; i < n; i++) {
            int min = Math.min(leftMax[i], rightMax[i]);
            int height = min - arr[i];
            sum+= height;
        }
        System.out.println("trapped water: "+ sum);
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 0, 6, 3, 2, 5};
        trapped(arr);
    }

}
