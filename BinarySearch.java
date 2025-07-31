import java.util.Arrays;

public class BinarySearch {
    public static int binary(int[] arr, int target){
        Arrays.sort(arr);
        int n = arr.length;
        int start = 0;
        int end = n - 1;


       while(start<= end){
           int mid = (start + end)/2;
           if(arr[mid] == target){
               return mid;
           } else if(arr[mid] > target){
               end = mid -1 ;
           }else{
               start = mid + 1;
           }
       }return -1;
    }

    public static void main(String[] args) {
        int[] arr = {123,24,54,3546,342,348,6,756,67,97,37};
        int target = 97;
//        System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.println("Target index (in sorted array): " + binary(arr, target));    }
}
