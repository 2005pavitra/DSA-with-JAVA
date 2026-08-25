import java.util.*;

public class ATwinPermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();

            }
            int temp = n + 1;
            for (int i : arr) {
                System.out.print((temp - i)+ " ");
            }
            System.out.println();

        }
    }
}