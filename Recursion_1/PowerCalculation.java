package Recursion_1;

public class PowerCalculation {
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }

        return x*power(x, n-1);
    }


    public static void main(String[] args) {
        int n = 2, p = 5;
        System.out.println(n + "^" + p + " = " + power(n, p));
    }
}
