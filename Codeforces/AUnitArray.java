import java.util.*;

public class AUnitArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int one = 0;
            int zero = 0;

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] == -1)
                    zero++;
                else
                    one++;
            }

            boolean flag = false;
            int cnt = 0;
            while (zero >= 0) {
                if (one >= zero && zero % 2 == 0) {
                    flag = true;
                    break;
                } else {
                    one++;
                    zero--;
                    cnt++;
                }
            }

            if (flag) {
                System.out.println(cnt);
            }
        }

    }
}