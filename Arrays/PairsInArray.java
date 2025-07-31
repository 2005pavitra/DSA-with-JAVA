package Arrays;

public class PairsInArray {
    public static void pairs(int[] arr){
        int n = arr.length;
        int a = 0;

        while(a <n){
            int pointer = a+1;
            while(pointer < n){
                System.out.println(arr[a] + "," + arr[pointer]);
                pointer++;
            }
            a++;
        }
    }

    public static void main(String[] args) {
        int[] arr= {6,454,24,365,88,67,48,667,45,3675,9,32};
        pairs(arr);
    }
}
