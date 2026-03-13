package SlidingWindow;
import java.util.*;

public class FirstNegInEveryWindowOfSizeK {

    static List<Integer> firstNegInt(int arr[], int k) {

        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();

        int i = 0, j = 0;

        while (j < arr.length) {

            if (arr[j] < 0) {
                q.offer(j);
            }

            if (j - i + 1 < k) {
                j++;
            }

            else if (j - i + 1 == k) {

                if (q.isEmpty()) {
                    ans.add(0);
                } else {
                    ans.add(arr[q.peek()]);
                }

                if (!q.isEmpty() && q.peek() == i) {
                    q.poll();
                }

                i++;
                j++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;

        List<Integer> result = firstNegInt(arr, k);

        System.out.println(result);
    }
}