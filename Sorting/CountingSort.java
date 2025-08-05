package Sorting;

public class CountingSort {
    public static void sort(int[] arr){
        int n = arr.length;

        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            largest = Math.max(largest, arr[i]);

        }

        int[] count = new int[largest+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int j = 0;
        for(int i = 0; i<count.length; i++){
            while(count[i]>0){
                arr[j]  = i;
                j++;
                count[i]--;
;           }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,1,4,3,5};
        sort(arr);
        for(int n :arr){
            System.out.println(n);
        }
    }
}
