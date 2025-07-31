package Arrays;

public class MaxSubarrayPrefix {
    public static void prefix(int[] arr){
      int[] prefix = new int[arr.length];
      int n = prefix.length;
      int sum;

      prefix[0] = arr[0];
      for(int i = 1; i < n; i++){
          prefix[i]= prefix[i-1]+arr[i];
      }

      for(int i = 0; i < n; i++){
          for(int j = i; j < n; j++){
              sum = i == 0? prefix[j]: prefix[j] + prefix[i-1];
              System.out.print(sum+" ");
          }
          System.out.println();
      }
    }

    public static void main(String[] args) {
        int[] arr = {1,-2,6,-1,3};
        prefix(arr);
    }
}
