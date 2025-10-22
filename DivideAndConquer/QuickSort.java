import java.util.Arrays;

public class QuickSort {

    // The main recursive method to implement Quick Sort
    public static void quickSort(int[] arr, int si, int ei) {
        // Base case: if the array has 0 or 1 element, it's already sorted
        if (si >= ei) {
            return;
        }

        // Partition the array and get the pivot index
        int pvtIdx = partition(arr, si, ei);

        // Recursively sort the two halves
        quickSort(arr, si, pvtIdx - 1); // Sort left part
        quickSort(arr, pvtIdx + 1, ei); // Sort right part
    }

    // Method to partition the array and place the pivot at its correct sorted position
    public static int partition(int[] arr, int si, int ei) {
        int pvt = arr[ei]; // The pivot element is the last element
        int i = si - 1; // Tracks the index for the smaller element's position

        for (int j = si; j < ei; j++) {
            // If the current element is smaller than or equal to the pivot
            if (arr[j] <= pvt) {
                i++; // **FIX 1: Increment i first**
                // Swap arr[i] and arr[j]
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        // Place the pivot in its correct final position
        i++;
        int temp = pvt;
        arr[ei] = arr[i]; // arr[ei] is the original pivot, now swapped
        arr[i] = temp;    // The correct position for the pivot is arr[i]

        return i; // **FIX 2: Return the pivot's final index**
    }

    public static void main(String[] args) {
        int[] arr = {7, 2, 1, 6, 8, 5, 3, 4, 9};
        System.out.println("Original array: " + Arrays.toString(arr));

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}