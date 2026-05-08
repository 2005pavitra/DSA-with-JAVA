package Stack;
import java.util.*;

public class NGR {
    public static int[] ngr(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];

        Stack<Integer> st = new Stack<>();

        for(int i = n-1; i >= 0; i--){
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
        int arr[] = {3, 5, 1, 2, 6};
        System.out.println(Arrays.toString(ngr(arr)));
    }

}
