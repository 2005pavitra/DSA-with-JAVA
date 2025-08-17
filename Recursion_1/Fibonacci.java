package Recursion_1;

public class Fibonacci {
    public static int print(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }

        int res = print(n-1)+print(n-2);
        return res;
    }

    public static void main(String[] args) {
        System.out.println(print(10));
    }
}
