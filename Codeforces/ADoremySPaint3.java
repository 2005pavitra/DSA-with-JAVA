import java.util.*;

public class ADoremySPaint3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i : arr) {
                map.put(i, map.getOrDefault(i, 0) + 1);

            }

            if (map.size() >= 3) {
                System.out.println("No");
            } else if(map.size() == 1){
                System.out.println("Yes");
            }
            else {
                Iterator<Integer> freq = map.values().iterator();
                int f1 = freq.next();
                int f2 = freq.next();

                if (f1 == f2 ) {
                    System.out.println("Yes");
                } else if ((n % 2 != 0) && (Math.abs(f1 - f2) == 1)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }

        }

        sc.close();

    }
}