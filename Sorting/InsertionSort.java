package Sorting;

public class InsertionSort {
    public static void sort (int[] arr){
        int n = arr.length;
        for(int i = 1; i<n; i++){
            int curr = arr[i];
            int prev = i-1;

            while (prev >= 0 && curr < arr[prev]){
                arr[prev + 1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = curr;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,4,1,3,2};
        sort(arr);

        for(int num : arr){
            System.out.println(num );
        }
    }
}
