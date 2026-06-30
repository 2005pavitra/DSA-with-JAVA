package Problems_Practice;
import java.util.*;

public class ActivitySelection {


    public static int activity(int[] start, int end[]){
        int n = start.length;

        int[][] arr = new int[n][2];

        for(int i = 0; i< n ; i++){
            arr[i][0] = start[i];
            arr[i][1] = end[i];
        }

        Arrays.sort(arr, (a, b) -> Integer.compare(a[1], b[1]));

        int cnt = 1;
        int endTime = arr[0][1];

        for(int i = 0; i< n; i++){
            if(arr[i][0]>endTime){
                cnt++;
                endTime = arr[i][1];
            }
        }

        return cnt;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] start = new int[n];
        int[] end = new int[n];

        for(int i = 0; i< n; i++){
            start[i] = sc.nextInt();
        }

        for(int i = 0; i< n; i++){
            end[i] = sc.nextInt();
        }

        System.out.println(activity(start, end));
    }
}
