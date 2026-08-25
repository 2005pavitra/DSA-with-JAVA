import java.util.*;

public class AWalkingMaster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (y == b && x == a) {
                System.out.println("0");
            } else if (y < b) {
                System.out.println("-1");
            }

            else {
                int cnt = 0;
                // int max = Math.max(x, y);
                // int steps = max - b;
                int steps = (y - b);
                cnt += steps;
                a = a + steps;
                b = b + steps;

                if (a < x) {
                    System.out.println("-1");
                } else {
                    cnt = cnt + (a - x);
                    System.out.println(cnt);
                }
            }

        }
    }
}