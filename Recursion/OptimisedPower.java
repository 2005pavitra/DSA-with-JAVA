package Recursion;

public class OptimisedPower {
    public static int power(int x, int n){
        if(n == 0) return 1;
        int halfPower = power(x, n/2);

        if(n%2 == 0){
            return halfPower * halfPower;
        }
        else{
            return x*halfPower*halfPower;
        }
    }

    public static void main(String[] args) {
        int n = 2, p = 5;
        System.out.println(n + "^" + p + " = " + power(n, p));
    }
}
