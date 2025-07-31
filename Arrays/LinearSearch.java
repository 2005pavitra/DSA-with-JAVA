package Arrays;

public class LinearSearch {

    public static int linearSearch(int arr[], int target){
//        int arr[] = {543,4,34,2,647,586,864,67};

        for(int i = 0; i< arr.length; i++){
            if(arr[i] == target){
                System.out.println("Found at index: "+i);
            }
        }return -1;

    }


    public static void main(String[] args) {
        int marks[] = {23,43,6563,42,325,456};
        int res = linearSearch(marks, 43);

        if(res == -1){
            System.out.println("Not found");
        }

    }
}
