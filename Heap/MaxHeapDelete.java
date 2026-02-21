package Heap;

public class MaxHeapDelete {
    private int[] heap;
    private int size;
    private int capacity;

    public MaxHeapDelete(int capacity){
        this.capacity = capacity;
        heap = new int[capacity];
        size = 0;
    }

    public void insert(int value){
        if(size == capacity){
            System.out.println("Heap Overflow");
            return;
        }

        heap[size] = value;
        int current = size;
        size++;

        while(current > 0){
            int parent = (current -1)/2;
            if(heap[current] > heap[parent]){
                swap(current, parent);
                current = parent;
            }else{
                break;
            }
        }
    }

    //delete
    public int delete(){
        if(size == 0){
            System.out.println("Heap is empty");
            return -1;
        }

        int max = heap[0];
        heap[0] = heap[size-1];
        size--;

        heapifyDown(0);

        return max;
    }

    private void heapifyDown(int i){
        int largest = i;

        while(true){
            int left = 2*i+1;
            int right = 2*i+2;

            if(left<size && heap[left]>heap[largest]) largest = left;
            if(right<size && heap[right]>heap[largest]) largest = right;

            if(largest == i){
                break;
            }

            swap(i, largest);
            i = largest;
        }
    }

    private void swap(int a, int b){
        int temp = heap[a];
        heap[a] = heap[b];
        heap[b] = temp;
    }

    public void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        MaxHeapDelete heap = new MaxHeapDelete(10);

        heap.insert(10);
        heap.insert(20);
        heap.insert(5);
        heap.insert(30);
        heap.insert(25);

        System.out.print("Heap before deletion: ");
        heap.printHeap();

        int removed = heap.delete();
        System.out.println("Deleted max element: " + removed);

        System.out.print("Heap after deletion: ");
        heap.printHeap();
    }
}
