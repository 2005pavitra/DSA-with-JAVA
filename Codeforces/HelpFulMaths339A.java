package Codeforces;
import java.util.*;

public class HelpFulMaths339A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int n = s.length();
        int[] arr = new int[n/2+1];
        int i = 0;
        for(char c : s.toCharArray()){
            if(c!= '+'){
                int ele = c-'0';
                arr[i]= ele;
                i++;
            }
        }

        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for(int j = 0; j < arr.length; j++){
            sb.append(arr[j]);
            if(j<n){
                sb.append("+");
            }
        }
        System.out.println(sb.toString().substring(0,n));
    }
}
