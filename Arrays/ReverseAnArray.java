package Arrays;

public class ReverseAnArray {
public static void reverse(int[] arr){
     int n = arr.length;
     int first = 0;
     int last = n-1;

     while(first <= last){
         int temp = arr[first];
         arr[first] = arr[last];
         arr[last] = temp;
         first++;
         last--;

     }
    }

    public static void main(String[] args) {
        int[] arr = {654,5,246,4,6,69,707,32,4,353,63};
        reverse(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
