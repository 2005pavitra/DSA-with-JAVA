package Recursion;

public class Factorial {
    public static int print(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fn= n* print(n-1);
        return fn;

    }

    public static void main(String[] args) {
        int n = 5;
        print(5);
        System.out.println(print(5));
    }
}
