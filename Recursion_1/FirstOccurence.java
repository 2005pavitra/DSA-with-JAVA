package Recursion_1;

public class FirstOccurence {
    public static int check(int[] arr, int i, int target){
        if(i== arr.length){
            return -1;
        }
        if(arr[i] == target){
            return i;
        }

        return check(arr, i+1, target);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(check(arr,0,5));
    }
}
