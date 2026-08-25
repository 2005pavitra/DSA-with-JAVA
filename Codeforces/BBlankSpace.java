import java.util.*;

public class BBlankSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int max = 0;

            int i = 0;
            while (i < n) {
                int cnt = 0;
                if (arr[i] == 0) {
                    while (i< n && arr[i] == 0) {
                        cnt++;
                        i++;
                    }
                    max = Math.max(max, cnt);
                }
                i++;
            }

            System.out.println(max);
        }
    }
}