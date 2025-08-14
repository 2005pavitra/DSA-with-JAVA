package Recursion;

public class LastOccurence {
    public static int check(int[] arr, int key, int i){
        if(i == arr.length){
            return -1;
        }

        int isFound = check(arr, key, i+1);

        if(isFound != -1){
            return isFound;
        }

        if(arr[i] == key){
            return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(check(arr, 4, 1));
    }
}
