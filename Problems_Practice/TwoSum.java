package Problems_Practice;
import java.util.Scanner;
import java.util.HashMap;

public class TwoSum {
    private static int[] two_sum(int[] arr, int target){
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
//        for(int i = 0; i< n; i++){
//            map.put(arr[i], i);
//        }
//        int[] ans = new int[2];

        for(int i = 0 ;i< n; i++){
            int diff = target- arr[i];
            if(map.containsKey(diff)){
                return new int[]{i, map.get(diff)};
            }
            map.put(arr[i], i);

        }
        return new int[]{-1 , -1};
    }



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i< n; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int ans[] = two_sum(arr, target);
        System.out.println(ans[0]+" "+ ans[1]);



    }


}
