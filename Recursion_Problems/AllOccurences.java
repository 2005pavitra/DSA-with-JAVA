package Recursion_Problems;

public class AllOccurences {
    public static void print(int[] arr , int i, int key){
        if(i == arr.length){
            return;
        }
        if(arr[i] == key){
            System.out.println(i+ " ");
        }
        print(arr, i+1, key);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,2,4,2};
        int key = 2;
        print(arr, 0, key);
        System.out.println();
    }
}
