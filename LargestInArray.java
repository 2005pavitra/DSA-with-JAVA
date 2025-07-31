public class LargestInArray {
    public static int largest(int arr[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int i = 0;
        while( i < arr.length){
            if(arr[i]> largest){
                largest = arr[i];
                i++;
            }
            else{
                i++;
            }


        }return largest;
    }

    public static void main(String[] args) {
        int arr[] = {32,453,2,12,24,5};
        System.out.println(largest(arr));


    }
}
