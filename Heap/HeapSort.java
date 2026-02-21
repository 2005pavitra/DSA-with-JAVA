package Heap;

public class HeapSort {
    public static void heapSort(int[] arr){
        int n = arr.length;

        //Step 1 - Build MaxHeap
        for(int i = n/2 -1; i>= 0; i--){
            heapify(arr, n, i);
        }

        for(int i = n-1; i > 0; i--){
            swap(arr, 0 ,i);

            heapify(arr, i, 0);
        }
    }

    private static void heapify(int[] arr, int size, int i){
        int largest = i;
        int left = 2*i+1;
        int right = 2*i+2;

        if(left < size && arr[left]>arr[largest]) largest = left;
        if(right<size && arr[right] > arr[largest]) largest = right;

        if(largest != i) {
            swap(arr, i, largest);
            heapify(arr, size, largest);
        }
    }

    private static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    private static void print(int[] arr){
        for(int n: arr){
            System.out.println(n+" ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 15, 30, 40, 5};

        System.out.print("Original Array: ");
        print(arr);

        heapSort(arr);

        System.out.print("Sorted Array: ");
        print(arr);
    }
}
