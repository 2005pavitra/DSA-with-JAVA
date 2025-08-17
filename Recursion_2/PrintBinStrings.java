package Recursion_2;

public class PrintBinStrings {
    public static void print(int n, int lastPlace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }

        // Always can put 0
        print(n - 1, 0, str + "0");

        // Only put 1 if lastPlace was 0
        if (lastPlace == 0) {
            print(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {
        print(3, 0, "");  // length = 3
    }
}
