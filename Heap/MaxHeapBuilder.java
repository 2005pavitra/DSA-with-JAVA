package Heap;

public class MaxHeapBuilder {

    public static void buildMaxHeap(int[] arr){
        int n = arr.length;

        //last non-leaf node = (n/2)-1;
        for(int i = n/2 -1; i>= 0; i--){
            heapyfy(arr, n, i);
        }
    }

    private static void heapyfy(int[] arr, int n, int i){
        int largest = i;

        int left = 2*i+1;
        int right = 2*i+2;

        //if left exists and is greater
        if(left<n && arr[left] > arr[largest]){
            largest = left;
        }

        //if right exists and is greater
        if(right < n && arr[right] > arr[largest]){
            largest = right;
        }

        //if largest is not the parent, swap and heapify again
        if(largest != i){
            swap(arr, i, largest);
            heapyfy(arr, n, largest);
        }


    }
    private static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3,5,9,6,8,20,10,12,18,9};
        buildMaxHeap(arr);
        System.out.println("Max heap arr: " );
        for(int num: arr){
            System.out.println(num+" ");
        }
    }
}
