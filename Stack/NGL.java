package Stack;
import java.util.*;

public class NGL {
    public static int[] ngl(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];

        Stack<Integer> st = new Stack<>();

        for(int i = 0; i< n; i++){
            while(!st.isEmpty() && st.peek()<= arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i] = -1;
            }else{
                ans[i] = st.peek();
            }
            st.push(arr[i]);
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {3, 5, 1,2,6};
        System.out.println(Arrays.toString(ngl(arr)));
    }
}
