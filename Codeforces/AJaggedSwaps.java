import java.util.*;

public class AJaggedSwaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // boolean flag = true;

            if (isSorted(arr)) {
                System.out.println("YES");
            } else {
                for (int j = 1; j < n - 1; j++) {
                    for (int i = 1; i < n - 1; i++) {
                        while (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                            int temp = arr[i];
                            arr[i] = arr[i + 1];
                            arr[i + 1] = temp;
                        }
                    }

                }
                if ( !isSorted(arr)) {
                    System.out.println("NO");
                } else {

                    System.out.println("YES");
                }
            }
        }

    }

    private static boolean isSorted(int[] arr) {
        int n = arr.length;

        int i = 0;
        while (i < n - 1) {
            if (arr[i + 1] < arr[i]) {
                // System.out.println("Sorted");
                return false;
            }
            i++;
        }

        return true;
    }


}