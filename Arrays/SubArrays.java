package Arrays;

public class SubArrays {
    public static void subarray(int[] arr){
        int n = arr.length;
        int ts = 0;
        int maxsum = Integer.MIN_VALUE;
//        int sum = 0;



        for(int i = 0; i<n; i++){
            for(int j = i; j<n; j++){
                int sum = 0;

                for(int k = i; k<=j; k++){
                    System.out.print(arr[k]+", ");
                    sum+=arr[k];
                    if(maxsum < sum){
                        maxsum = sum;
                    }


                }ts++;
                System.out.println();
                System.out.println("sum of the subarrays: "+sum);
            }


        }System.out.println("total subarrays:"+ts);
        System.out.println("Max sum subarray: "+ maxsum);
    }

    public static void main(String[] args) {
        int[] arr = {1,3,2};
        subarray(arr);
//        System.out.println(ts);
    }
}
