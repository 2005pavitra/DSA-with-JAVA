package Arrays;

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

    public static class ArraysAsFunctionArg {
        public static void update(int marks[]) {
            for (int i = 0; i < marks.length; i++) {
                marks[i] = marks[i] + 1;
            }
        }

        public static void main(String[] args) {
            int marks[] = {23, 45, 532, 423, 543, 32, 4458, 6, 9, 776, 88, 65, 8};

            update(marks);

            for (int i = 0; i < marks.length; i++) {
                System.out.println(marks[i]);
            }
        }
    }
}
