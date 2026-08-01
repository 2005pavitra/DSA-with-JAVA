package TCS_PYQ;
import java.util.*;

public class Part_5 {
    public static void main(String[] args){
//        Character[] arr = {'a','b','b','b','c','c','c','a','f','c'};
//        Character[] arr = {'r','g','b','b','y','y'};
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        char[] arr = new char[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.next().charAt(0);
        }
        solve(arr);
    }

    private static void solve(char[] arr){
        int n = arr.length;

        HashMap<Character,Integer> map = new HashMap<>();

        for(char c : arr){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        for(int i = 0; i< n; i++){
            if(map.get(arr[i]) % 2 != 0){
                System.out.println(arr[i]);
                return;
            }
        }
        System.out.println("All are even");
    }
}
