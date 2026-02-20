package Heap;

public class MaxHeapInsert {

    private int[] heap;
    private int size;
    private int capacity;

    public MaxHeapInsert(int capacity){
        this.capacity = capacity;
        heap = new int[capacity];
        size = 0;
    }

    public void insert(int value){
        //check overflow
        if(size == capacity){
            System.out.println("Heap is full");
            return;
        }

        //step -1 : insert at the end
        heap[size] = value;
        int current = size;
        size++;

        //step -2 : heapify up
        while(current>0){
            int parent = (current-1)/2;

            //if current node is greater than parent ->swap
            if(heap[current]> heap[parent]){
                swap(current, parent);
                current = parent; //move up
            }else{
                break;
            }
        }
    }

    private void swap(int i, int j){
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public void printHeap(){
        for(int i = 0; i < size; i++){
            System.out.println(heap[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MaxHeapInsert maxHeap = new MaxHeapInsert(10);

        maxHeap.insert(10);
        maxHeap.insert(20);
        maxHeap.insert(5);
        maxHeap.insert(30);
        maxHeap.insert(25);

        System.out.println("Max Heap after insertions:");
        maxHeap.printHeap();
    }
}
