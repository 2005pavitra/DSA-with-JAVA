import java.util.*;

public class AArrayColoring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int odd = 0;

            for (int i : arr) {
                if (i % 2 != 0)
                    odd++;
            }

            if (odd % 2 == 1 && odd != n) {
                System.out.println("No");
            } else if (odd == n && odd % 2 == 1) {

                System.out.println("No");

            } else {
                System.out.println("Yes");
            }
        }
    }
}