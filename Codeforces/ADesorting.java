import java.util.*;

public class ADesorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            boolean isSorted = true;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i + 1] < arr[i]) {
                    System.out.println("0");
                    isSorted = false;
                    break;
                }
            }

            if (!isSorted) {
                continue;
            }

            int ptr = 0;
            int min = Integer.MAX_VALUE;

            for (int i = 0; i < n - 1; i++) {

                if (Math.abs(arr[i + 1] - arr[i]) < min) {
                    min = Math.abs(arr[i + 1] - arr[i]);
                    ptr = i;
                }
            }

            int diff = arr[ptr + 1] - arr[ptr];
            int res = diff / 2 + 1;
            System.out.println(res);
        }
        sc.close();
    }
}