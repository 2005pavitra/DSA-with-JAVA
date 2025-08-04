package Arrays;

public class MaxSubarrayPrefix {
    public static void prefix(int[] arr){
      int[] prefix = new int[arr.length];
      int n = prefix.length;
      int sum;
      int maxsum = Integer.MIN_VALUE;
      prefix[0] = arr[0];
      for(int i = 1; i < n; i++){
          prefix[i]= prefix[i-1]+arr[i];
      }

      for(int i = 0; i < n; i++){
          int start = i;
          for(int j = i; j < n; j++){
              int end = j;
              sum = i == 0? prefix[end]: prefix[end] - prefix[start-1];
              System.out.print(sum+" ");

              if(sum > maxsum){
                  maxsum = sum;

              }
          }
          System.out.println();
          System.out.println("maxsum: "+maxsum);
      }
    }

    public static void main(String[] args) {
        int[] arr = {1,-2,6,-1,3};
        prefix(arr);
    }
}
