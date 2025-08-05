package Sorting;

public class SelectionSort {
    public static void sort(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n-1; i++){
            int minPos = i;
            for(int j = i+1; j<=n-1; j++){
                if(arr[minPos] > arr[j]){
                    int temp = arr[minPos];
                    arr[minPos] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        sort(arr);

        for (int n : arr) {
            System.out.println(n);
        }
    }
}
